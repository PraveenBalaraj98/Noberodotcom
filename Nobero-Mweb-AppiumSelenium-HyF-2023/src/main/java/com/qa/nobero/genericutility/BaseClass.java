package com.qa.nobero.genericutility;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;
import com.qa.nobero.mWeb.objectRepo.HomeRepo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * @author Praveen B
 *
 */
public class BaseClass {

	public AndroidDriver driver;
	public static AndroidDriver sdriver;
	public AppiumDriverLocalService server;
	public static String URL;

	@BeforeSuite
	public void startserver() {
		server = AppiumDriverLocalService.buildService
				(new AppiumServiceBuilder().usingPort(4723).usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe")));
		server.start();
	}

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
		desiredCapabilities.setCapability("chromedriverExecutable", fileUtil.getPropertyKeyValue("chromedriverExecutable", IConstants.qaCapablityProprtyFile));
		//desiredCapabilities.setCapability("autoGrantPermissions", false);
		desiredCapabilities.setCapability("chromedriverExecutableDir", System.getProperty("user.data")+"/driver/.exe");


		URL url = new URL("http://localhost:4723");

		driver = new AndroidDriver(url, desiredCapabilities);
		sdriver=driver;
		URL =fileUtil.getPropertyKeyValue("masterURL", IConstants.qaURLPropertyFilePath);
		driver.get(URL);

		driver.manage().timeouts().implicitlyWait(IConstants.Implicitly_TIMEOUT);

		//Handle Permission Pop up, Switch To Native app i.e Chrome
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println( contextName );
			if (contextName.contains("CHROMIUM")) {
				driver.context("NATIVE_APP");
				try {
					Thread.sleep( 1500 );
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		//driver.context("NATIVE_APP");
		//Click on Allow
		driver.findElement(By.xpath(".//android.widget.Button[@text='Allow']")).click();
		//Change context back to the main page.
		driver.context("CHROMIUM");

	}

	@AfterSuite
	public void stopServer() {
		server.stop();
	}

	public static String takescreenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "../Nobero-Mweb-AppiumSelenium-HyF-2023/reports/screenshots/" +JavaUtility.getSystemDateTime()+name + ".png";
		File dest = new File(path);
		Files.copy(src, dest);
		return path;
	}

	public static String ts() {
		return sdriver.getScreenshotAs(OutputType.BASE64);
	}
}
