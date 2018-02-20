/**
 * 
 */
package ProjLoginLogout.ProjLoginLogout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Rakesh
 *
 */
public class FullTestCase {
	 WebDriver driver= null;
	 public WebDriver chromeBrowser() 
	 { 		
	 	//System.setProperty("webdriver.chrome.driver", "..//chromedriver");
	 	System.setProperty("webdriver.chrome.driver", "..//chromedriver.exe");
	 	driver= new ChromeDriver();		//driver.manage().window().maximize();
	 		String baseUrl ="http://demo.amrutsoftware.com:8080";
	 		driver.get(baseUrl);
	 	//	Thread.sleep(1000);
	 	//	wait = new 	WebDriverWait(driver,180);
	 		 return driver;
	 	}
	 
	 public void login()
	 {	
	 	 try
	 	 {
	 		
	 		WebElement login = driver.findElement(By.id("login-form-username"));
			 login.sendKeys("rakesh");
			 Thread.sleep(2000);
			 WebElement password = driver.findElement(By.id("login-form-password"));
				password.sendKeys("Rakesh123$");
				Thread.sleep(2000);
				WebElement loginbtn = driver.findElement(By.name("login"));
				loginbtn.click();
				Thread.sleep(4000);
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='usernameerror']/p")).isDisplayed(), "Login fail ,Please check Credentials");
				System.out.println("Jira Log in");
	 	 }
	 	catch(Exception e)
	 	{
	 		System.out.println("Please check user name and Password ");
	 	}
	}
	 public void logout()
	 {
	 	try{
	 	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 	 WebElement admin = driver.findElement(By.xpath("//*[@id='header-details-user-fullname']/span/span/img"));
	 	 admin.click();
	 }
	 	catch(Exception e)
	 	{
	 		System.out.println("Logout successfully...... ");
	 		
	 	}
	 		}

	 
}
