package rerunTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases2 {

	@Test
	void loginAmazon()
	{   int a=10/0;
		System.out.println("This is Amazon"+a);}
	
	@Test
	void loginFlipkart()
	{System.out.println("This is Flipkart");}
	
	@Test
	void loginMyntra()
	{   Assert.assertTrue(10>50);
		System.out.println("This is Myntra");}
}
