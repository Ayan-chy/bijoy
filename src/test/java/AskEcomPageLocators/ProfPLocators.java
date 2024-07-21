package AskEcomPageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AskEcomUtility.AskEcomBase;

public class ProfPLocators extends AskEcomBase{

	public ProfPLocators () {
		
		PageFactory.initElements(driver,this);
		
	}
	
	

	 @FindBy (xpath="(//strong[text()='Zahid123'])[1]")
	 public WebElement VerifyProfText;
	

	 @FindBy (linkText="Logout")
	 public WebElement LogOutLink;
	 
	 @FindBy (linkText="Dashboard")
	 public WebElement regProfVerify;
	 
	
	
	 
	
	 
	
}
