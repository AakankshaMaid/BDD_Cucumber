package POM_with_pagefactory;
//POM class 6

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage6 {
	//step1:declaration
	@FindBy(xpath="//input[@id='outlined-secondary']")private WebElement fullName;
	WebDriver driver1;
	
	//step2:initialization
	public PBProfilePage6(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	
	//step3:usage
	public void SwitchToChildWindow()
	{
		Set<String> ids=driver1.getWindowHandles();
		ArrayList<String> childId=new ArrayList<String>(ids);
	 driver1.switchTo().window(childId.get(1));
	}
	public void verifyPBProfilePagefullName()
	{
		String actu=fullName.getAttribute("value");
		String expt="Jan batch";
		if(actu.equals(expt))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}

}
