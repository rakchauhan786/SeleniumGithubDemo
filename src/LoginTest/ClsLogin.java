package LoginTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClsLogin {
	WebDriver driver= null ;
	WebDriverWait wait;		
	@Test	
	public void LoginTest()
	{
		
	browser();
	
	try{
//			File file = new File("..//JSDAutomation//Datasources//JSDProjectdata.xlsx");
//			FileInputStream inputstream = new FileInputStream(file);
//			Workbook Wb =new XSSFWorkbook(inputstream);
//			//Wb=excelfile();
		//Sheet ShloginDetail = Wb.getSheet("Credentials");
	  
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 WebElement login = driver.findElement(By.id("login-form-username"));
			// login.sendKeys("jiradbuser");
//			 for( int i= 2; i<=ShloginDetail.getLastRowNum();i++)
//			 {
			login.sendKeys("jawed");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			WebElement password = driver.findElement(By.id("login-form-password"));
			//password.sendKeys("jiradbpassword");
			password.sendKeys("jawed");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			WebElement loginbtn = driver.findElement(By.name("login"));
			loginbtn.click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//checkAlertdenied();
			System.out.println("Login.............");
//			 }
	}
	catch(Exception e)
	{
		System.out.println("Please check user name and Password ");
	}
}
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D://HarshaShelar//JSD//chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl ="http://192.168.0.103:8095//";
		driver.get(baseUrl);
		wait = new 	WebDriverWait(driver,180);
	}
}
