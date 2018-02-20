package ProjLoginLogout.ProjLoginLogout;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginLogout {
	protected static WebDriver driver=InitializeBrowser.testdriver();
	protected static WebDriverWait wait;
	Workbook Wb= null;
	
	public void TestStartTime() {
		//test start time and date 
		
		SimpleDateFormat dformat= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		//DATE date=new DATE();
		String date1=dformat.format(new Date());
		System.out.println("Test start date and time ..:"+date1);
	}
//Test End time 
	public void TestEndTime() {
		//test finished time 
		SimpleDateFormat dformat1= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		//DATE date=new DATE();
		String date2=dformat1.format(new Date());
		System.out.println("Test end date and time ..:"+date2);
	}
public WebDriver chromeBrowser() 
{ 		
	System.setProperty("webdriver.chrome.driver", "..//chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "..//chromedriver");
		driver= new ChromeDriver();		//driver.manage().window().maximize();
		String baseUrl ="http://demo.amrutsoftware.com:8080";
		driver.get(baseUrl);
	//	Thread.sleep(1000);
	//	wait = new 	WebDriverWait(driver,180);
		 return driver;
	}

public Workbook excelfile() throws FileFormatException, IOException {
	Workbook Wb = null;
	try {
		File file = new File("Datasources//JSDProjectdata.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		Wb = new XSSFWorkbook(inputstream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return Wb;
}
 public void login() throws FileFormatException, IOException
{	
	
		Wb=excelfile();
		Sheet ShloginDetail = Wb.getSheet("Credentials");
		 for( int i= 2; i<=ShloginDetail.getLastRowNum();i++)
		 {
			// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    WebElement login = driver.findElement(By.id("login-form-username"));
			// login.sendKeys("jiradbuser");
			login.sendKeys(ShloginDetail.getRow(i).getCell(1).toString());
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement password = driver.findElement(By.id("login-form-password"));
			//password.sendKeys("jiradbpassword");
			password.sendKeys(ShloginDetail.getRow(i).getCell(2).toString());
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			WebElement loginbtn = driver.findElement(By.name("login"));
			loginbtn.click();
			//Thread.sleep(4000);
		
			//Comment for Bitbucket
					//assertEquals(driver.findElement(By.xpath("//*[@id='find_link'][@title='Search for issues and view recent issues']")).isDisplayed(),true);
			
			
			System.out.println("Jira Log in");
			//Thread.sleep(2000);
			//*[@id="login-form"]/div[1]/div[1]
			//*[@id="find_link"]/title]
			}
	
//	Driver.switchTo().alert().dismiss();
}
public void wfauthentication() 
{
	//Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebElement AuthenticatePassword = driver.findElement(By.id("login-form-authenticatePassword"));
	AuthenticatePassword.sendKeys("Rakesh123$");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebElement confirmbtn = driver.findElement(By.id("login-form-submit"));
	confirmbtn.click();
}

public void createusers(){
	try{
		WebElement adminMenu  = driver.findElement(By.id("admin_menu"));
		adminMenu.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement usermanagement= driver.findElement(By.id("admin_users_menu"));
		usermanagement.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("create_user")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Wb=excelfile();
		Sheet sh= Wb.getSheet("CreateUser");
		System.out.println(sh.getLastRowNum());
		for(int i = 2; i<=sh.getLastRowNum(); i++)
		{
			XSSFRow r= (XSSFRow) sh.getRow(i);
			
			driver.findElement(By.id("user-create-email")).sendKeys(r.getCell(1).toString());
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(By.id("user-create-fullname")).sendKeys(r.getCell(2).toString());
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			driver.findElement(By.id("user-create-username")).sendKeys(r.getCell(3).toString());
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(By.id("password")).sendKeys(r.getCell(4).toString());
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 Thread.sleep(2000);
			 WebElement  btncreatanotheruser =driver.findElement(By.id("user-create-createAnother"));
			 if(!btncreatanotheruser.isSelected())
			 {
				 btncreatanotheruser.click();
			 }
			
			driver.findElement(By.id("user-create-submit")).click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		}
		
		 
	} 
	catch(Exception e)
	{
		System.out.println(e.toString());
		
	}
	
}


public void logout()
{
	
		
	//assertEquals(driver.findElement(By.xpath("//*[@id='find_link'][@title='Search for issues and view recent issues']")).isDisplayed(),true);
	driver.findElement(By.xpath("//*[@id='header-details-user-fullname']/span/span/img")).click();
	//Thread.sleep(1000);
	 driver.findElement(By.id("log_out1")).click();
	 
	 System.out.println("Logout successully......");
}
	


}
