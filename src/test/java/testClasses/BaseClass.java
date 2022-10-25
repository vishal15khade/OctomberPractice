package testClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

public class BaseClass {

	Logger log;

	@BeforeClass
	public void setUp() {
		log = LogManager.getLogger("BaseClass");
		log.info("New class Started");
	}

	@AfterClass
	public void tearDown() {
		log.info("Class ends");
	}

}
