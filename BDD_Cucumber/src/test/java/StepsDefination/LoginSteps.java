package StepsDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	//Scenario 1
	@Given("User is at the login screen") //common step 
	public void preconditions()
	{
		System.out.println("Given statement execute");
	}
	
	@When("User enters username")
	public void enterUsername()
	{
		System.out.println("Username entered");
	}
	@When("User enters password")
	public void enterPassword()
	{
		System.out.println("Password enter");
	}
	@When("User click on  button")
	public void clickBtn()
	{
		System.out.println("Click on login button");
	}
	
	@Then("User should see the homepage")
	public void validateLogin()
	{
		System.out.println("Home page is displying");
	}
	
	//Scenario 2
	//is step is common in multiple scenario the method declared only once it execute for both scenario
//	@Given("User is at the login screen") 
//	public void navToLoginPage()
//	{
//		System.out.println("user at login page ");
//	}
	
	@Then("page title should get display")
	public void validateTitle()
	{
		System.out.println("Title display");
	}

}
