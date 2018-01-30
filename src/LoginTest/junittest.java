package LoginTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class junittest {
	ClsLogin c = new ClsLogin();
  @Test
  public void jtest() {
	  c.LoginTest();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		c.browser();
		}

  @AfterMethod
  public void afterMethod() {
  }

}
