package AskEcomPageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AskEcomUtility.AskEcomBase;

public class APLocators extends AskEcomBase {
	
   public APLocators () {
		
		PageFactory.initElements(driver,this);
		

  }
   
   @FindBy (id="username")
	 public WebElement LogUsernameField;
	 
	 @FindBy (id="password")
	 public WebElement LogPassField;
	 
	 @FindBy (xpath="//button[text()='Log in']")
	 public WebElement LogButton;

	 @FindBy (id="reg_username")
	 public WebElement RegUserfield;
	 
	 @FindBy (id="reg_email")
	 public WebElement RegEmailfield;
	 
	 @FindBy (id="reg_password")
	 public WebElement RegPassfield;
	 
	 @FindBy (xpath="//button[text()='Register']")
	 public WebElement RegButton;
	 
	 
}
