package utilityClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListener implements ITestListener {
	ExtentSparkReporter s;
	ExtentReports r;
	ExtentTest t;
	public void onStart(ITestContext a) {
	Date d=new Date();
	SimpleDateFormat dd=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	String time=dd.format(d);
		
		
	s=new ExtentSparkReporter("./Reports/extentReport"+time+".htlm");
	s.config().setDocumentTitle("Extent Report");
	s.config().setReportName("Vishal");
	s.config().setTheme(Theme.DARK);
	
	r=new ExtentReports();
	r.attachReporter(s);
	r.setSystemInfo("Environment","QA");
	}

	public void onTestSuccess(ITestResult b) {
		t=r.createTest(b.getName());
		t.getStatus();
		t.log(Status.PASS,"Test case passed");
		t.pass("Executed sucessfully");
	}

	public void onTestFailure(ITestResult b) {
		t=r.createTest(b.getName());
		t.getStatus();
		t.log(Status.FAIL,"Test case failed");
		t.fail("Failure occures");
	}

	public void onTestSkipped(ITestResult b) {
		t=r.createTest(b.getName());
		t.getStatus();
		t.log(Status.SKIP,"Test case skipped");
		t.skip("Please check");
	}

	public void onFinish(ITestContext a) {
		r.flush();
	}

}
