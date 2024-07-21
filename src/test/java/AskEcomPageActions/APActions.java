package AskEcomPageActions;

import AskEcomPageLocators.APLocators;
import AskEcomUtility.AskEcomBase;
import AskEcomUtility.AskEcomUtilization;

public class APActions extends AskEcomBase {

	
	APLocators apActObj=new APLocators();
	
	public void enter_username_password_click_login(String U, String P) {
		
		apActObj.LogUsernameField.sendKeys(U);
		apActObj.LogPassField.sendKeys(P);
		apActObj.LogButton.click();
	}
	
	public void enter_username_email_password_click_Register(String U, String E, String P) {
		
		apActObj.RegUserfield.sendKeys(U);
		apActObj.RegEmailfield.sendKeys(E);
		apActObj.RegPassfield.sendKeys(P);
		apActObj.RegButton.click();
		
		AskEcomUtilization.TakeScreenshot(driver, "RegProfilePage");
	}
	
	
}
