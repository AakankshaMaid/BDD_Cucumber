package POM_with_pagefactory;
//POM class 4

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage4 {
	//step1:declaration
	@FindBy(xpath="//div[text()='My Account']") private WebElement myAcc;
	WebDriver driver1; //declare global variable driver1
	
	//step2:initialization
	public PBHomePage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver; //initialize global variable with local variable driver
	}
	
	//step3:usage
	
	public void openDDOptionPBHomePageMyAcc() //DD-drop down
	{
		Actions act=new Actions(driver1);
		act.moveToElement(myAcc).perform();
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
