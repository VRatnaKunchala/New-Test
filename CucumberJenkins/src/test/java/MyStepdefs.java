import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    @cucumber.api.java.en.When("^The Home page is opened$")
    public void theHomePageIsOpened() throws Throwable {

        System.out.println("URL  is opened");
        //throw new cucumber.api.PendingException();
    }

    @Given("^The UserName is entered$")
    public void theUserNameIsEntered() throws Throwable {

        System.out.println("Home page is opened");
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^The user is navigated to home page$")
    public void theUserIsNavigatedToHomePage() throws Throwable {
        System.out.println("Home page is opened");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @And("^The Password is entered$")
    public void thePasswordIsEntered() throws Throwable {

        System.out.println("Password is entered");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
