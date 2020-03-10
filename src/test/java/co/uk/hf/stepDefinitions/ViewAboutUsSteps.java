package co.uk.hf.stepDefinitions;

import co.uk.hf.pages.BasePage;
import co.uk.hf.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ViewAboutUsSteps extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @Given("I navigate to h-f.co.uk")
public void i_navigate_to_h_f_co_uk() {
        homePage.launchURL();
}

    @When("I click on the {string} tab")
    public void i_click_on_the_tab(String string) {

    }

    @Then("the {string} page is displayed")
    public void the_page_is_displayed(String string) {

    }


}
