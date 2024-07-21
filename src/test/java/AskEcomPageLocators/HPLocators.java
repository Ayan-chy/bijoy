package AskEcomPageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AskEcomUtility.AskEcomBase;

public class HPLocators extends AskEcomBase {
	
	 public HPLocators () {
			
			PageFactory.initElements(driver,this);
			
		}
	 
	 @FindBy (linkText="Account")
	 public WebElement AccountLink;
	 
	
	 

}
