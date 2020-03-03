package Pages.WebOrdersPage;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='ctl00_menu']//li")
    public List<WebElement>  orderMenu;

    public List<String> orderMenuData(){

        List<String > menus=new ArrayList<>();
        menus.add("View all orders");
        menus.add("View all products");
        menus.add("Order");
        return menus;
    }

    @FindBy(xpath = "//a[.='View all products']")
    public WebElement viewAllProducts;


}
