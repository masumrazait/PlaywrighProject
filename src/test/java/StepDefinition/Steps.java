package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {


    @Given("user is on GreenCart Landing page")
    public void user_is_on_green_cart_landing_page() {
        System.out.println("hello");
        throw new io.cucumber.java.PendingException();
    }

    @When("user searched with shortname Tomato and extracted actual name of product")
    public void user_searched_with_shortname_tomato_and_extracted_actual_name_of_product() {
        System.out.println("when");
        throw new io.cucumber.java.PendingException();
    }

    @Then("user searched for Tomato shortname in offers page")
    public void user_searched_for_tomato_shortname_in_offers_page() {
        System.out.println("delhi");
        throw new io.cucumber.java.PendingException();
    }

    @Then("validate product name in offers page match with landing page")
    public void validate_product_name_in_offers_page_match_with_landing_page() {
        System.out.println("lo");
        throw new io.cucumber.java.PendingException();
    }
}

