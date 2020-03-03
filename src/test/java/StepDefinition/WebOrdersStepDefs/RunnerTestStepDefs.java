package StepDefinition.WebOrdersStepDefs;

import io.cucumber.java.en.Given;

public class RunnerTestStepDefs {

    @Given("the user send key")
    public void the_user_send_key() {

        System.out.println("this is for test 1");
    }

    @Given("the user click the button")
    public void the_user_click_the_button() {

        System.out.println("this is for test 2");
    }

}
