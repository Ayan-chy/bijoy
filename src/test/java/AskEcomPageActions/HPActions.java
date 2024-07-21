package AskEcomPageActions;

import AskEcomPageLocators.HPLocators;
import AskEcomUtility.AskEcomBase;

public class HPActions extends AskEcomBase {
   
	HPLocators hpActObj=new HPLocators();
	
	
	public void User_click_Account_link() {
		hpActObj.AccountLink.click();
		
	}
	
	
}
