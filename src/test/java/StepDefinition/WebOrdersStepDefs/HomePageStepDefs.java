package StepDefinition.WebOrdersStepDefs;

import Pages.WebOrdersPage.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class HomePageStepDefs {

    HomePage page=new HomePage();

    @Then("user validate menu list")
    public void user_validate_menu_list() {

        List<String> expected=page.orderMenuData();
        List<String> actual=new ArrayList<>();

        for(WebElement element: page.orderMenu){

            actual.add(element.getText());
        }

        for(int i=0; i<actual.size();i++){

            Assert.assertEquals(expected.get(i),actual.get(i));
        }
    }

}
