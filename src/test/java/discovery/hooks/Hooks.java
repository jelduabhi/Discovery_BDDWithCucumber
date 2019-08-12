package discovery.hooks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.ScreenshotException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import discovery.utility.CommonMethods;


public class Hooks extends CommonMethods {

	@Before
	public void beforeScenario(Scenario sc) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Before Scenarios");
		System.out.println("Scenario Name ::: "+sc.getName());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Log.info("XXXXXXXXXXXXXXXXXXXXXXX XXXXXXXXXXXXXXXXXXXXXX XXXXXXXXXXXXXXXXXXXXXX XXXXXXXXXXXXXXXXXX");
		Log.info("***********************    "+"-S---T---A---R---T-"+"   *************************");
		Log.info("***************************"+dateFormat.format(date)+"***********************************");
		Log.info("$$$$$$$$$$$$$$$$$$$$$      "+sc.getName()+ "       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Log.info("****************************************************************************************");
		Log.info("****************************************************************************************");
		
	}
	
	@After
	public void afterScenario(Scenario sc) {
		if(sc.isFailed()) { 
			sc.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
	
	}
	}
}
