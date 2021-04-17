package mackTrucks.stepDefinitions;


import mackTrucks.steps.EndUserSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import io.cucumber.datatable.DataTable;

public class DefinitionSteps {

	@Steps
	EndUserSteps steps;

	@Given("user is on Landing page")
	public void user_is_on_Landing_page() throws InterruptedException {
		steps.user_is_on_Landing_page();
	}

	@Given("user click on {string} menu")
	public void user_click_on_menu(String string) throws InterruptedException {
		steps.user_click_on_menu(string);
	}

	@Then("user can see related page {string} displayed")
	public void user_can_see_related_page_displayed(String string) throws InterruptedException {
		steps.user_can_see_related_page_displayed(string);
	}


}
