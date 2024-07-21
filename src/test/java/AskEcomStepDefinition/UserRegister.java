package AskEcomStepDefinition;

import AskEcomPageActions.APActions;
import AskEcomPageActions.ProfPActions;
import AskEcomUtility.AskEcomBase;
import AskEcomUtility.AskEcomUtilization;
import io.cucumber.java.en.*;

public class UserRegister extends AskEcomBase {
	
	APActions apobj=new APActions();
	ProfPActions progpObj= new ProfPActions();

	@When("User enter username, email address and password and click Register")
	public void user_enter_username_email_address_and_password_and_click_register() {
	    
		apobj.enter_username_email_password_click_Register(PropObj.getProperty("RegUser1"), PropObj.getProperty("RegEmail1"), PropObj.getProperty("RegPass1"));
		
	}

	@Then("Verify user Register successfully")
	public void verify_user_register_successfully() {
	    
		
		progpObj.Verify_user_Register_successfully();
		
	
		
		
		
	}

	
	
}
