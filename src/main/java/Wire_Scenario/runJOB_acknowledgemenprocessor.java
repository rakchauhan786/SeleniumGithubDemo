package Wire_Scenario;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;
import org.testng.ISuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class runJOB_acknowledgemenprocessor {
	
@Test(priority =1)
	  public void ACK_01() throws FileFormatException, IOException
  {	
				String i ="3";
				assertEquals(i, "3");
		  		System.out.println("ACK_01");
	  }
	  @Test(priority =2)
	  public void ACK_02() throws FileFormatException, IOException
	  {		 			String i ="3";
		assertEquals(i, "3");
		  		System.out.println("ACK_02");
	  }
	  @Test(priority =3)
	  public void ACK_03() throws FileFormatException, IOException
	  {		 	String i ="3";
				assertEquals(i, "3");
		  		System.out.println("ACK_03");
	  }
	  @Test(priority =4)
	  public void ACK_04() throws FileFormatException, IOException
	  {		 	
		  		System.out.println("ACK_04");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method runJOB_acknowledgemenprocessor ");
		  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Before Method runJOB_acknowledgemenprocessor");
	  }
	  public void generateReport(List<ISuite> suites, String outputDirectory){}
}
