package POM_with_pagefactory;
//POM class 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage2 {
	//step1:declear
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPwd;
   
	//step2:initilize
	public PBMobNumPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3:usage---> crate separate methods for perform action on every webelement
	public void inputPBMobNumPagemobNum()
	{
		mobNum.sendKeys("7020500587");
	}
	public void clickPBMobNumPagesignInWithPwd()
	{
		signInWithPwd.click();
	}
	
	
	
	
	
	
	
	
}
