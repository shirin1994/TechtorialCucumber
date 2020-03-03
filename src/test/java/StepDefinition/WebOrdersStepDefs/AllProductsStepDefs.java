package StepDefinition.WebOrdersStepDefs;
import Pages.WebOrdersPage.HomePage;
import Pages.WebOrdersPage.ViewAllProductsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
public class AllProductsStepDefs {


    HomePage homePage=new HomePage();
    ViewAllProductsPage page=new ViewAllProductsPage();


    @Then("the user click view all product button")
    public void the_user_click_view_all_product_button() {

     homePage.viewAllProducts.click();
    }

    @Then("the user validate product table")
    public void the_user_validate_product_table() {

       List<String> actual=page.getProductList();
       List<String > expected=page.expectedData();

        Assert.assertTrue(actual.containsAll(expected));
    }

}
