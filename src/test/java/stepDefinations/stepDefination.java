package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {
		
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on NetBanking landing page");
	}
	
	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String strArg1, String strArg2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login into application with username and password");
		System.out.println(strArg1);
		System.out.println(strArg2);
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is populated");
	}
	
	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.printf("Cards displayed %s\n", arg1);
	}

}