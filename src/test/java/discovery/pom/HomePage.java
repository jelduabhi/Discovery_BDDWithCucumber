package discovery.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//a[@class='m-DropdownList__a-Cta' and contains(text(),'See All')]") 
	public static WebElement seelAlllink;
	@FindBy(xpath="//a[@class='o-Header__a-NavLink' and contains(text(),'Shows')]")
	public static WebElement showslink;
	@FindBy(xpath="(//div[@class='showGridTile__gradient'])[1]")
	public static WebElement sampleVideo;
	@FindBy(xpath="(//button[@type='button' and @class='flipIconCore__button'])[1]")
	public static WebElement firstVideo;
	@FindBy(xpath="//*[@id='react-root']/div/div[1]/main/section[2]/div/ul/li[1]/div[1]/div[1]/div/a/div[2]/p[2]")
	public static WebElement firstVideoText;
	@FindBy(xpath="(//button[@type='button' and @class='flipIconCore__button'])[2]")
	public static WebElement secondVideo;
	@FindBy(xpath="//*[@id='react-root']/div/div[1]/main/section[2]/div/ul/li[2]/div[1]/div[1]/div/a/div[2]/p[2]")
	public static WebElement secondVideoText;
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/div[3]/main/div/div[1]/section[3]/div/h2")
	public static WebElement watchlater;
	@FindBy(xpath="(//*[@class='thumbnailTile__titleLineClamp'])[1]")
	public static WebElement validateFirstVideo;
	@FindBy(xpath="(//*[@class='thumbnailTile__titleLineClamp'])[2]")
	public static WebElement validateSecondVideo;
}
