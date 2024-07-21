package AskEcomUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AskEcomUtilization extends AskEcomBase {

	
	public static long implicitlyWait=15;
	public static long pageLoadTimeout=20;
	
	
	public static void TakeScreenshot(WebDriver driver, String Screenshot) {
		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//Take the screenshot
		
		String currentdir = System.getProperty("user.dir"); //project directory
		
		try {
			FileUtils.copyFile(scrfile, new File(currentdir+"/FW2Screenshots/"+Screenshot+".png") );
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
