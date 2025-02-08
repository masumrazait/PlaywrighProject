import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {


    @Given("I have a search the field on amazon page")
    public void i_have_a_search_the_field_on_amazon_page() {
        System.out.println("I have a search the field on amazon page");
        throw new io.cucumber.java.PendingException();
    }

    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String ProductName, Integer Price) {
        System.out.println("I search for a product with name :" + ProductName + " and price :" + Price);
        throw new io.cucumber.java.PendingException();
    }

    @Then("product with the name {string} should be display")
    public void product_with_the_name_should_be_display(String ProductName) {
        System.out.println("product_with_the_name_should_be_display : " + ProductName);
        throw new io.cucumber.java.PendingException();
    }
}

