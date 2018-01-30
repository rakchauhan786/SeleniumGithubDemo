package Wire_Scenario;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.List;

import org.testng.ISuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunJOBWireInstructionsProcessor {
@Test(priority =0)
	  public void TC_07() throws IOException
	  {		 		String  i ="Hello World";
				assertEquals(i, "Hello");
		  		System.out.println("TC_01");
	  }
	  @Test(priority =1)
	  public void TC_08() throws IOException
	  {
		  			String  i ="Hello World";
			assertEquals(i, "Hello World"); 	
		  
		  		System.out.println("TC_02");
	  }
	  @Test(priority =2)
	  public void TC_09() throws IOException
	  {		 	String  i ="Hello World";
		assertEquals(i, "Hello World"); 
		  		System.out.println("TC_03");
	  }	  
	  @Test(priority =3)
	  public void ACK_15() throws  IOException
  {	
				String i ="3";
				assertEquals(i, "3");
		  		System.out.println("ACK_01");
	  }
	  @Test(priority =4)
	  public void ACK_16() throws FileAlreadyExistsException, IOException
	  {		 			String i ="3";
		assertEquals(i, "2");
		  		System.out.println("ACK_02");
	  }
	  @Test(priority =5)
	  public void ACK_17() throws IOException
	  {		 	String i ="3";
				assertEquals(i, "3");
		  		System.out.println("ACK_03");
	  }
	  @Test(priority =6)
	  public void ACK_18() throws IOException
	  {		 	
		  		System.out.println("ACK_04");
	  }

	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method RunJOBWireInstructionsProcessor");
		  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Before Method RunJOBWireInstructionsProcessor");
	  }
	  public void generateReport(List<ISuite> suites, String outputDirectory){}
	 
}
