package rerunTestCases;

import org.testng.Assert;
import org.testng.annotations.*;

import listeners.RetryTestCases;

public class TestCases {

	@Test
	void loginFB()
	{System.out.println("This is facebook");}
	
	@Test(retryAnalyzer=RetryTestCases.class)
	void loginWhatsApp()
	{System.out.println("This is Whatsapp");
	Assert.assertTrue(false);}
	
	@Test(dependsOnMethods="loginWhatsApp",alwaysRun=true)
	void loginTwitter()
	{System.out.println("This is Twitter");}
	
	@Test(enabled=false,alwaysRun=true)//This will not run
	void loginDemo()
	{System.out.println("This is Demo");}
}
