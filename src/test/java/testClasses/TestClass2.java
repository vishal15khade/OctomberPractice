package testClasses;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass2 extends BaseClass {

	@Test
	void test2A() {
		Assert.assertTrue(true);
		log.info("test2A executed");
	}

	@Test
	void test2B() {
		Assert.assertTrue(true);
		log.info("test2B executed");
	}

}
