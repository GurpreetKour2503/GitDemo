package StepDefination;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefi {

    @Given("^User landed to NetBanking Application$")
    public void user_landed_to_netbanking_application() throws Throwable {
     System.out.println("User landed to NetBanking Application");  
     System.out.println("User landed to NetBanking Application");  
     System.out.println("User landed to NetBanking Application"); 
    }

    @When("^User login to the appliaction using useridt (.+) and password (.+)$")
    public void user_login_to_the_appliaction_using_useridt_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(password);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
     System.out.println("Home page is displayed");
     System.out.println("*&&&&&&&&&&&&&&&&&&&&&&&*");
     System.out.println("Home page is displayed");
    }

    @And("^Payement cards displayed \"([^\"]*)\"$")
    public void payement_cards_displayed_something(String Arg1) throws Throwable {
        System.out.println(Arg1);
        System.out.println(Arg1);
<<<<<<< HEAD
=======
        System.out.println(Arg1);
>>>>>>> d78891af47302137635d019b91a9486a0881c7ae
    }

    }



