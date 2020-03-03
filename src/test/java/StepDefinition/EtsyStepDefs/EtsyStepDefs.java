package StepDefinition.EtsyStepDefs;
import Pages.EtsyPages.EtsyHomePage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EtsyStepDefs {

    WebDriver driver= Driver.getDriver();
    EtsyHomePage page=new EtsyHomePage();

    @Given("user loges in to etsy.com")
    public void user_loges_in_to_etsy_com() {
      driver.get(ConfigReader.getProperty("etsyUrl"));
    }

    @When("search for {string}")
    public void search_for(String searchValue) {

        page.searchField.sendKeys(searchValue);
        page.searchButton.click();

    }

    @Then("validate title is {string}")
    public void validate_title_is(String expectedTitle) {

        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }



}




