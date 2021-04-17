package mackTrucks.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import mackTrucks.pages.*;
import org.junit.After;
import org.junit.Assert;
import mackTrucks.pages.ExtendedPageObject;
import mackTrucks.pages.LandingPage;

import java.util.List;

public class EndUserSteps extends ExtendedPageObject {

	LandingPage landingPage;

	@Step
	public void user_is_on_Landing_page() throws InterruptedException {
		landingPage.openURL();
	}

	@Step
	public void user_click_on_menu(String string) throws InterruptedException {
		landingPage.user_click_on_menu(string);
	}

	@Step
	public void user_can_see_related_page_displayed(String string) throws InterruptedException {
		Assert.assertEquals(string, landingPage.user_can_see_related_page_displayed());
	}






}
