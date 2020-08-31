package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	
	public WebDriver driver;
	
	By signIn= By.linkText("Sign in");
	By emailCreate=By.id("email_create");
	By createAccountButton=By.cssSelector("#create-account_form span");
	By createAccountError= By.cssSelector("#create_account_error li");
	By customerFirstName=By.id("customer_firstname");
	By customerLastName=By.id("customer_lastname");
	By email=By.id("email");
	By password=By.id("passwd");
	By addressFirstName=By.id("firstname");
	By address1=By.id("address1");
	By city=By.id("city");
	By state=By.id("id_state");
	By postcode=By.id("postcode");
	By country=By.id("id_country");
	By mobile=By.id("phone_mobile");
	By addressAlias=By.id("alias");
	By register=By.cssSelector("button#submitAccount > span");
	By registererror=By.cssSelector(".alert-danger");
	
	public RegistrationPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}

	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}

	
	public WebElement emailCreate()
	{
		return driver.findElement(emailCreate);
	}
		
	public WebElement createAccountButton()
	{
		return driver.findElement(createAccountButton);
	}
	
	public WebElement createAccountError()
	{
		return driver.findElement(createAccountError);
	}
	
	public WebElement customerFirstName()
	{
		return driver.findElement(customerFirstName);
	}
	
	public WebElement customerLastName()
	{
		return driver.findElement(customerLastName);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement addressFirstName()
	{
		return driver.findElement(addressFirstName);
		
	}
	
	public WebElement address1()
	{
		return driver.findElement(address1);
		
	}
	
	public WebElement city()
	{
		return driver.findElement(city);
		
	}
	
	public WebElement state()
	{
		return driver.findElement(state);
		
	}
	
	public WebElement postcode()
	{
		return driver.findElement(postcode);
		
	}
	
	public WebElement country()
	{
		return driver.findElement(country);
		
	}
	
	public WebElement mobile()
	{
		return driver.findElement(mobile);
		
	}
	
	
	public WebElement addressAlias()
	{
		return driver.findElement(addressAlias);
		
	}
	
	public WebElement register()
	{
		return driver.findElement(register);
		
	}
	
	public WebElement registererror()
	{
		return driver.findElement(registererror);
		
	}
}





