package discovery.stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import discovery.framework.ProjectConfig;
import discovery.pom.Helper;
import discovery.utility.CommonMethods;
public class TestSteps extends CommonMethods{
	
	Helper help=new Helper();

	@Given("^i launch application with valid url$")
	public void i_launch_application_with_valid_url() {
		launchBrowser(ProjectConfig.getPropertyValue("BaseUrl"));
	}

	@When("^i navigate to my videos and add two videos into my favourite$")
	public void i_navigate_to_my_vidoes_and_add_two_vidos_into_my_favourite() throws Throwable {
		help.navigateToSampleVedio();
		help.addToFavourite();
	}

	@Then("^i can able to see favourite in MyVidoes section$")
	public void i_can_able_to_see_favourite_in_MyVidoes_section() throws Throwable {
		navgateToNewURL(ProjectConfig.getPropertyValue("MyVideosUrl"));
		help.validatefavourite();
	}
}
