package ProjLoginLogout.ProjLoginLogout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//Commit Check
	public class InitializeBrowser {
		private static WebDriver driver =null;
		public static WebDriverWait wait;
		public static String baseUrl ="http://demo.amrutsoftware.com:8080";
				// "http://demo.amrutsoftware.com:8080";
				//"http://demo.amrutsoftware.com:8080/secure/Dashboard.jspa";
						//
			
		public static WebDriver testdriver()
		{ 
			if(driver == null){
			 System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
			 //System.setProperty("webdriver.chrome.driver", "C://Users//RC//workspace//SeleniumGithubDemo//src//main//resources//chromedriver.exe");
			 
			 driver = new ChromeDriver();
			 driver.get(baseUrl);
//			 driver.manage().window().maximize();	
//				
//				System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
//				driver = new FirefoxDriver();			
//				driver.get(baseUrl);
		//driver.manage().window().maximize();
				
		}
			 return driver;        
		}
	}

