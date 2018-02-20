package ProjLoginLogout.ProjLoginLogout;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.List;

import javax.enterprise.inject.New;

import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;


public class JiraAppTest {
	LoginLogout j = new LoginLogout();
	WebDriver driver=InitializeBrowser.testdriver();
	//FullTestCase F= new FullTestCase();
	
   @Test(priority =0)
  public void JiraAppLogin() throws FileFormatException, IOException, InterruptedException
  {		 	 
	  System.out.println("Testing Login ..");
  
  			j.login();
  
  }

  @Test(priority =1)
  public void JiraApplogout() throws FileFormatException, IOException
  {	
	 j.logout();
	 System.out.println("Testing Logout ...");
  }
  
  //@Test(priority =1)
  public void CreateUser() throws FileFormatException, IOException
  {		 	j.createusers();
	  		//System.out.println("Testing Login and logout..");
  }

  @BeforeSuite
  public void beforeMethod() throws InterruptedException {
	 j.TestStartTime();
	//driver=F.chromeBrowser();
	  }
  @AfterSuite
  public void afterMethod() {
	  
	  j.TestEndTime();
	//driver.quit();
  }
  public void generateReport(List<ISuite> suites, String outputDirectory){}
}

