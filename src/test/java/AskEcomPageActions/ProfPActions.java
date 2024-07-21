package AskEcomPageActions;

import org.testng.Assert;

import AskEcomPageLocators.ProfPLocators;
import AskEcomUtility.AskEcomBase;
import AskEcomUtility.AskEcomUtilization;

public class ProfPActions extends AskEcomBase {
	
	ProfPLocators profPActobj=new ProfPLocators();
	
	public void Verify_user_login_successfully() {
		boolean verifyText = profPActobj.VerifyProfText.isDisplayed();
		Assert.assertTrue(verifyText);
		AskEcomUtilization.TakeScreenshot(driver, "loginProfilePage");
		profPActobj.LogOutLink.click();
		
	
		
	}
	
	public void Verify_user_Register_successfully() {
		
		boolean verifyreg = profPActobj.regProfVerify.isDisplayed();
		
		Assert.assertTrue(verifyreg);
		
		
		
		
	}

}
