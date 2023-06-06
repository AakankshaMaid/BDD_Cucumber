package POM_with_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage {
  @FindBy(xpath="//input[@id='outlined-secondary']")private WebElement fullName;
  WebDriver driver1;
  
  
  public PBProfilePage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
	  driver1=driver;
  }
  
  public void switchToWindow()
  {
	  Set<String> ids=driver1.getWindowHandles();
	  ArrayList<String> al=new ArrayList<String>(ids);
	  driver1.switchTo().window(al.get(1));
  }
  public void verifyPBProfilePagefullName(String ExpectedName )
  {
	  String actualName=fullName.getAttribute("value");
	 
	  
	  if(actualName.equals(ExpectedName))
	  {
		  System.out.println("TC pass");
	  }
	  else
	  {
		  System.out.println("Tc fail");
	  }
  }

}
