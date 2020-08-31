package stepDefinition;



import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Academy.base;
import cucumber.api.DataTable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RegistrationPage;


public class registrationPage extends base{



	@Given("^Initialize the browser with chrome$")
    public void initialize_browser_with_chrome() throws Throwable {
    	driver =initializeDriver();
    }
	
	
	   @And("^Navigate to the url \"([^\"]*)\"$")
	    public void navigate_to_the_url_something(String url) throws Throwable {
	    	driver.get(url);
	    }
	    
	   
	   @When("^User clicks on the Sign in button$")
	    public void user_clicks_on_the_sign_in_button() throws Throwable {
	    	RegistrationPage reg =new RegistrationPage(driver);
	    	reg.signIn().click();
	    }
	   
	   
	    @Then("^User is on the Sign page$")
	    public void user_is_on_the_sign_page() throws Throwable {
	    	String title = driver.getTitle();
	    	Assert.assertEquals(title, "Login - My Store");
	    	
	    }
	   
	
    @When("^User clicks on the Create an account button$")
    public void user_clicks_on_the_create_an_account_button() throws Throwable {
    	RegistrationPage reg =new RegistrationPage(driver);
    	reg.createAccountButton().click();
    }

    @Then("^User sees an error message$")
    public void user_sees_an_error_message() throws Throwable {
    	RegistrationPage reg =new RegistrationPage(driver);
    	Assert.assertEquals(reg.createAccountError().getText(), "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    	driver.close();
    }
    
  
    

    @And("^User enters \\\"([^\\\"]*)\\\"$")
    public void user_enters_something(String strArg1) throws Throwable {
    	RegistrationPage reg =new RegistrationPage(driver);
    	reg.emailCreate().clear();
    	reg.emailCreate().sendKeys(strArg1);
    }
    @When("^User clicks on Register button$")
    public void user_clicks_on_register_button() throws Throwable {
    	RegistrationPage reg =new RegistrationPage(driver);
    	reg.register().click();
    }

    @Then("^User sees Registration error messages$")
    public void user_sees_registration_error_messages() throws Throwable {
    	RegistrationPage reg =new RegistrationPage(driver);
    	String var= reg.registererror().getText();
    	System.out.println(var);
    	Assert.assertTrue(var.contains("There are 8 errors"));
    	driver.close();
    }

    @Then("^User is successfully registered$")
    public void user_is_successfully_registered() throws Throwable {
    	String title = driver.getTitle();
    	Assert.assertEquals(title, "My account - My Store");
    	driver.close();
    }


    @And("^User enters the mandatory details:$")
    public void user_enters_the_mandatory_details(DataTable table) throws Throwable {
     RegistrationPage reg =new RegistrationPage(driver);	
     List<List<String>> data = table.raw();
     reg.customerFirstName().sendKeys(data.get(0).get(0));
     reg.customerLastName().sendKeys(data.get(0).get(1));
     reg.password().sendKeys(data.get(0).get(2));
     reg.address1().sendKeys(data.get(0).get(3));
     reg.city().sendKeys(data.get(0).get(4));
     Select state = new Select(reg.state());
     state.selectByVisibleText(data.get(0).get(5));
     reg.postcode().sendKeys(data.get(0).get(6));
     reg.mobile().sendKeys(data.get(0).get(7));
     reg.addressAlias().sendKeys(data.get(0).get(8));
     
     
    }
    
    
    
}