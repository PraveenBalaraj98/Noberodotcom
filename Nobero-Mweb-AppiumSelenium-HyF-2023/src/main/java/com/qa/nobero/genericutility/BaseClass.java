package com.qa.nobero.genericutility;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public AndroidDriver driver;
	public static AndroidDriver sdriver;

	@BeforeTest
	public void launchBrowser() throws Throwable {
		FileUtility fileUtil = new FileUtility();


		//Set the capabilities
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("automationName", fileUtil.getPropertyKeyValue("automationName", IConstants.qaCapablityProprtyFile ));
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, fileUtil.getPropertyKeyValue("PLATFORM_NAME", IConstants.qaCapablityProprtyFile));
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, fileUtil.getPropertyKeyValue("PLATFORM_VERSION", IConstants.qaCapablityProprtyFile) );
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, fileUtil.getPropertyKeyValue("UDID", IConstants.qaCapablityProprtyFile));
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, fileUtil.getPropertyKeyValue("DEVICE_NAME", IConstants.qaCapablityProprtyFile));
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, fileUtil.getPropertyKeyValue("BROWSER_NAME", IConstants.qaCapablityProprtyFile));

		URL url = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(url, desiredCapabilities);
		sdriver=driver;

		driver.get(fileUtil.getPropertyKeyValue("masterURL", IConstants.qaURLPropertyFilePath));
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	public static String takescreenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "../Nobero-Mweb-AppiumSelenium-HyF-2023/reports/screenshots/" +JavaUtility.getSystemDateTime()+name + ".png";
		File dest = new File(path);
		Files.copy(src, dest);
		return path;
	}
}
