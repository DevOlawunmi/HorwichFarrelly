package co.uk.hf.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewAboutUsPage
{
    WebDriver driver;

    @Given("I navigate to h-f.co.uk")
public void i_navigate_to_h_f_co_uk() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.h-f.co.uk/");
}

    @When("I click on the {string} tab")
    public void i_click_on_the_tab(String string) {

    }

    @Then("the {string} page is displayed")
    public void the_page_is_displayed(String string) {

    }


}
