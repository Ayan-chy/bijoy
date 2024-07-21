package AskEcomUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AskEcomBase {

	
	public static WebDriver driver;
	public static Properties PropObj;
	
	public AskEcomBase () {
		
		try {
			FileInputStream FIS = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\AskEcomConfig\\ConfigFile.properties");
			PropObj = new Properties();
			PropObj.load(FIS);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public void BrowserSetup() {
		
		String browserName = PropObj.getProperty("Browser1");
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(AskEcomUtilization.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(AskEcomUtilization.implicitlyWait));
			driver.manage().deleteAllCookies();
		}
		
		else if (browserName.equalsIgnoreCase("Firefox")) {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().deleteAllCookies();
			
		}
			
		}
	
	public static void URLSetup (String URL) {
		
		driver.get(PropObj.getProperty("AskEcomURL"));
		
	}
		
		
	}
	
	

