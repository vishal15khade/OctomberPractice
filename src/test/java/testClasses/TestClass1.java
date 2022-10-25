package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {

	@Test
	void test1A() {
		Assert.assertTrue(true);
		log.info("test1A executed");
	}

	@Test
	void test1B() {
		Assert.assertTrue(true);
		log.info("test1B executed");
	}

}
