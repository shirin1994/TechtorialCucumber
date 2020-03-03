package StepDefinition;
import Pages.WebOrdersPage.ViewAllPage;
import Utils.BrowserUtils;
import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hook {

    WebDriver driver;


    @Before
    public void setupDriver(){

        driver= Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        System.out.println("This is from after annotation");

    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        System.out.println("This is from after annotation");
        if(scenario.isFailed()){

            BrowserUtils.takeScreenshot();
        }

//        if(driver!=null){
//

//            driver.quit();
//            driver=null;
//        }
    }

    public static class ViewAllOrderStepDefs {

        ViewAllPage page=new ViewAllPage();
        @Then("validate list of all order displayed")
        public void validate_list_of_all_order_displayed() {

           String actual= page.header.getText();
           String expected="List of All Orders";

            Assert.assertEquals(actual,expected);

        }


    }
}
