package StepsDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps 
{
	@Given("user should be logged in")
	public void user_should_be_logged_in() 
	{
		System.out.println("login page open");
	   
	}

	@When("user clicks on orders link")
	public void user_clicks_on_orders_link()
	{
	 System.out.println("click on order link");   
	}

	@When("user click on past order button")
	public void user_click_on_past_order_button() 
	{
		System.out.println("click on past order btn");
	    	}

	@Then("user should able to see past orders")
	public void user_should_able_to_see_past_orders() 
	{
		System.out.println("see past orders");
	   
	}

	@When("user clicks on current order button")
	public void user_clicks_on_current_order_button()
	{
		System.out.println("click on current order btn");
	   
	}

	@Then("user should able to see current orders")
	public void user_should_able_to_see_current_orders() 
	{
		System.out.println("see current orders");
	   
	}



}
