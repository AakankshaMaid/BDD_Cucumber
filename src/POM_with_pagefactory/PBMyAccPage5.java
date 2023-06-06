package POM_with_pagefactory;
//POM class 5

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage5 {
	//step1:declaration
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myprofile;
	
	//step2:Initialization
	public PBMyAccPage5(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3:usage
	public void clickPBMyAccPageMyProfile()
	{
		myprofile.click();
	}
	

}
