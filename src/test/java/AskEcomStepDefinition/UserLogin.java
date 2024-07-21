package AskEcomStepDefinition;

import AskEcomPageActions.APActions;
import AskEcomPageActions.HPActions;
import AskEcomPageActions.ProfPActions;
import AskEcomUtility.AskEcomBase;
import AskEcomUtility.AskEcomUtilization;
import io.cucumber.java.en.*;

public class UserLogin extends AskEcomBase {

	HPActions hpObj = new HPActions();
	APActions apobj=new APActions();
	ProfPActions progpObj= new ProfPActions();
	

	@Given("Open ecommerce application {string}")
	public void open_ecommerce_application(String URL) {
	
		URLSetup(URL);
		
	}

	@When("User click Account link")
	public void user_click_account_link() {
		hpObj.User_click_Account_link();
		
	    
	}

	@When("User enter username and password and click log in")
	public void user_enter_username_and_password_and_click_log_in() {
	    
		apobj.enter_username_password_click_login(PropObj.getProperty("LogUser1"), PropObj.getProperty("LogPass1"));
		
		
	}

	@Then("Verify user login successfully")
	public void verify_user_login_successfully() {
	   
		progpObj.Verify_user_login_successfully();
		
		
	}



	
}
