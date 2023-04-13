package com.qa.nobero.genericutility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ITestListenerImpClass implements ITestListener {

	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result){
		test=reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result){
		test.log(Status.PASS,result.getMethod().getMethodName()+" got passed" );
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,result.getMethod().getMethodName()+" got Fail" );
		test.log(Status.FAIL, result.getThrowable());

		try {
			//String path=BaseClass.ts();
			test.addScreenCaptureFromBase64String(BaseClass.ts());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" got skipped");
	}

	public void onStart(ITestContext context) {
		FileUtility fileUtil = new FileUtility();
		ExtentSparkReporter reporter = new ExtentSparkReporter("../Nobero-Mweb-AppiumSelenium-HyF-2023/reports/extentReports/"+JavaUtility.getSystemDateTime()+"Report.html");
		reporter.config().setDocumentTitle("Nobero");
		reporter.config().setReportName("App Test");
		reporter.config().setTheme(Theme.DARK);

		reports = new ExtentReports();
		reports.attachReporter(reporter);
		try {
			reports.setSystemInfo("Platform Name", fileUtil.getPropertyKeyValue("PLATFORM_NAME", IConstants.qaCapablityProprtyFile));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			reports.setSystemInfo("Platform Version", fileUtil.getPropertyKeyValue("PLATFORM_VERSION", IConstants.qaCapablityProprtyFile));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			reports.setSystemInfo("Device Name", fileUtil.getPropertyKeyValue("DEVICE_NAME", IConstants.qaCapablityProprtyFile));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			reports.setSystemInfo("Browser Name", fileUtil.getPropertyKeyValue("BROWSER_NAME", IConstants.qaCapablityProprtyFile));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			reports.setSystemInfo("Environment URL", BaseClass.URL);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}
}
