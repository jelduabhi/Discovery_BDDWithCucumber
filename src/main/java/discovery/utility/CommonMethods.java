package discovery.utility;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import discovery.framework.TestReport;


public class CommonMethods {
	
	protected static WebDriver driver;
	protected static Logger Log = Logger.getLogger(CommonMethods.class.getName());

	public WebDriver launchBrowser(String url) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Log.info("launch the Discovery browser!!!!!");
		driver.manage().window().maximize();
		CommonMethods.wait(10);
		//TestReport.clipScreenShot("Hit The Browser");
		return driver;

	}

public void navgateToNewURL(String url) {
driver.navigate().to(url);
}
	
	public static void Explicit_Wait(WebElement element) {
		System.out.println(element);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void clickOnElement(WebElement element, String log_commands) {
		try {
			Explicit_Wait(element);
			highLight(element, log_commands);
			element.click();
			Log.info("found " + log_commands);

		} catch (NoSuchElementException e) {
			Log.error("Not found " + log_commands);
			throwException("Not found " + log_commands);
		}
	}


	public static String getText(WebElement element, String log_commands) {
		try {
			String gettext = element.getText();
			Log.info("found " + log_commands);
			highLight(element, log_commands);
			return gettext;
		} catch (NoSuchElementException e) {
			Log.error("Not found " + log_commands);
			throwException("Not found " + log_commands);
		}
		return null;
	}
	public static void throwException(String errormessage) {
		Log.error(errormessage);
		throw new NoSuchElementException(errormessage);
	}
public static void moveMouseToElement(WebElement ele) {
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
}
	public static void highLight(WebElement element, String screenshot_name) {

		try {
			Actions Act = new Actions(driver);
			Act.moveToElement(element).build().perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red;');",
					element);
			//TestReport.clipScreenShot(driver, screenshot_name);
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("Not found this element [" + screenshot_name + "]");
		}
	}

	public static void switch_To_Window() {
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
	}
public static void wait(int sec) {
	try {
		Thread.sleep(sec*1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void switch_To_Frame(int index, String variable_type, String stringtypexpath) {
		if (variable_type.equalsIgnoreCase("int")) {
			driver.switchTo().frame(index);
		} else {
			driver.switchTo().frame(stringtypexpath);
		}

	}
	
	public static Set<String> getWindowsCount(WebDriver driver) {
		Set<String> allWindows = driver.getWindowHandles();
		return allWindows;
	}
	static Set openWindows;
	
	public static void swapWindow(int i, WebDriver driver) {
		openWindows = getWindowsCount(driver);
		String switchWindow = (String) openWindows.toArray()[i];
		driver.switchTo().window(switchWindow);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
	}
	
	public static void closeAndSwapToParentWindow(WebDriver driver, int i) {
		int windows_count = getWindowsCount(driver).size();
		for (int currentwindow = windows_count; currentwindow >= 2; --currentwindow) {
			driver.close();
			swapWindow(currentwindow - 2, driver);
		}

	}
	
}
