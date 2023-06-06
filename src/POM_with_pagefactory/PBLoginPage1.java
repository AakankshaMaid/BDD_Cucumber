package POM_with_pagefactory;
//POM class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage1 //naming of class=projectName_pageName
{
	//step1:deceleration
	@FindBy(xpath="//a[text()='Sign in']")private WebElement signIn;//private WebElement signIn=driver.findElement(By.xpath(""));
    
	//step2:initialization
	public PBLoginPage1(WebDriver driver) //Constructor
	{
		PageFactory.initElements(driver, this);//className.methodName(WebDriver_object,this_keyword);
	}
	
	//step3:usage
	public void clickPBLoginPagesignIn() //method_name=Action_WebPageName_elementName
	{
		signIn.click();
	}
	
}

