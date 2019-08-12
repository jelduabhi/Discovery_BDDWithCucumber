package discovery.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import discovery.pom.HomePage;
import discovery.utility.CommonMethods;

public class Helper extends HomePage{

	public void navigateToSampleVedio() {
		try {
		CommonMethods.moveMouseToElement(Shows());
		CommonMethods.wait(3);
		CommonMethods.clickOnElement(seeAll(), "Clicking seelAlllink");
		CommonMethods.wait(10);
		}catch(Exception e) {
			System.out.println("Unable to perform action "+e.getMessage());
			e.printStackTrace();
		}
	}
	public void addToFavourite() {
		try {
		CommonMethods.clickOnElement(sampleVideo(), "Clicking sampleVideo Element");
		CommonMethods.wait(5);
		CommonMethods.highLight(firstVideo(), "First Video");
		CommonMethods.highLight(firstVideoText(), "First Text");
		CommonMethods.clickOnElement(firstVideo(), "Clicking firstVideo Element");
		CommonMethods.wait(2);
		CommonMethods.highLight(secondVideo(), "Second Video");
		CommonMethods.highLight(secondVideoText(), "Second Text");
		CommonMethods.clickOnElement(secondVideo(), "Clicking secondVideo Element");
		}catch(Exception e) {
			System.out.println("Unable to perform action "+e.getMessage());
		}
	}
	public void validatefavourite() {
		try {
		CommonMethods.highLight(watchlater(), "watchlater");
		CommonMethods.highLight(validateFirstVideo(), "validateFirstVideo");
		CommonMethods.highLight(validateSecondVideo(), "validateSecondVideo");
		}catch(Exception e) {
			System.out.println("Unable to valiate "+e.getMessage());
		}
	}

}