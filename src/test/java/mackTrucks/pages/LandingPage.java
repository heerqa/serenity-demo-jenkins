package mackTrucks.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://google.co.in")
public class LandingPage extends ExtendedPageObject {


    public void openURL() throws InterruptedException {
        waitForPageLoaded();
        String url = "http://flagcitymack.com/mack-trucks/";

        getDriver().get(url);
    }

//    public void quitBrowser()  {
//        getDriver().close();
//    }

    public void user_click_on_menu(String string) throws InterruptedException {
        waitForPageLoaded();
        String xpath = "//ul[@id='menu-main-menu']//a[text()='"+string+"']";
        WebElement menuItem = getDriver().findElement(By.xpath(xpath));
        menuItem.click();
    }

    @FindBy(xpath = "//div[@class='gusta-align-left  ']//h2")
    WebElementFacade h2Xpath;
    public String user_can_see_related_page_displayed() throws InterruptedException {
        waitForPageLoaded();
        String str = h2Xpath.getText();
        return str;
    }


}
