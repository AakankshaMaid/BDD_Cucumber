package StepsDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsWithData 
{
	@Given("User is at Login page")
	public void loginpage()
	{
		System.out.println("Login page");
	}
	@When("User enters the username as {string}") //here string id variable
	public void username(String string)
	{
		System.out.println("username is :"+string);
	}
	@When("User enters the password as {string}")
	public void password(String string)
	{
		System.out.println("password is :"+string);
	}
	@When("User click on login button")
	public void clickBtn()
	{
		System.out.println("click on button");
	}
	@Then("User should redirect to homepage")
	public void homepage()
	{
		System.out.println("open homepage");
	}

}
