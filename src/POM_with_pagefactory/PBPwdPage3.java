package POM_with_pagefactory;
//POM class 3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage3 {
	//step1:decleration
	@FindBy(xpath="//input[@id='central-login-password']") WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signIn;
	
	//step2:initilization
	public PBPwdPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3:usage
	public void inputPBPwdPagePwd()
	{
		pwd.sendKeys("Sanjay@23");
	}
	public void clickPBPwdPageSignIn()
	{
		signIn.click();
	}
	

}
