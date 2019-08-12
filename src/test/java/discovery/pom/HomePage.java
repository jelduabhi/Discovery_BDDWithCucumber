package discovery.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import discovery.utility.CommonMethods;

public class HomePage extends CommonMethods{
	
	public WebElement Shows() {
		WebElement shows=driver.findElement(By.xpath("//a[@class='o-Header__a-NavLink' and contains(text(),'Shows')]"));
		return shows;
	}
	public WebElement seeAll() {
		WebElement seeAll=driver.findElement(By.xpath("//a[@class='m-DropdownList__a-Cta' and contains(text(),'See All')]"));
		return seeAll;
	}
	public WebElement sampleVideo() {
	WebElement sampleVideo=driver.findElement(By.xpath("(//div[@class='showGridTile__gradient'])[1]"));
	return sampleVideo;
	}
	public WebElement firstVideo() {
		WebElement firstVideo=driver.findElement(By.xpath("(//button[@type='button' and @class='flipIconCore__button'])[1]"));
		return firstVideo;
	}
	public WebElement firstVideoText() {
		WebElement firstVideoText=driver.findElement(By.xpath("//*[@id='react-root']/div/div[1]/main/section[2]/div/ul/li[1]/div[1]/div[1]/div/a/div[2]/p[2]"));
		return firstVideoText;
	}
	public WebElement secondVideo() {
		WebElement secondVideo=driver.findElement(By.xpath("(//button[@type='button' and @class='flipIconCore__button'])[2]"));
		return secondVideo;
	}
	public WebElement secondVideoText() {
		WebElement secondVideoText=driver.findElement(By.xpath("//*[@id='react-root']/div/div[1]/main/section[2]/div/ul/li[2]/div[1]/div[1]/div/a/div[2]/p[2]"));
		return secondVideoText;
	}
	public WebElement watchlater() {
		WebElement watchlater=driver.findElement(By.xpath("//*[@id=\\\"react-root\\\"]/div/div[1]/div[3]/main/div/div[1]/section[3]/div/h2"));
		return watchlater;
	}
	public WebElement validateFirstVideo() {
		WebElement validateFirstVideo=driver.findElement(By.xpath("(//*[@class='thumbnailTile__titleLineClamp'])[1]"));
		return validateFirstVideo;
	}
	public WebElement validateSecondVideo() {
		WebElement validateSecondVideo=driver.findElement(By.xpath("(//*[@class='thumbnailTile__titleLineClamp'])[2]"));
		return validateSecondVideo;
	}
}
