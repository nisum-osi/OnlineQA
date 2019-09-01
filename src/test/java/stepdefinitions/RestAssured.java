package stepdefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestAssured {
    @Given("^I set rest api server$")
    public void iSetRestApiServer() {
//        URL url = new java.net.URL(RunConfig.url);
        System.out.println("set rest server successfully");

    }

    @When("^I execute check registration api request$")
    public void iExecuteCheckRegistrationApiRequest() {
        System.out.println("I executed check registration api request");
    }

    @Then("^I should see the response accordingly$")
    public void iShouldSeeTheResponseAccordingly() {
        System.out.println("I should see the response accordingly");
    }
}
