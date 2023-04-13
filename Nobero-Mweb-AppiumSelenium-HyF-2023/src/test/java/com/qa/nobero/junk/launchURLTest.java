package com.qa.nobero.junk;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.nobero.mWeb.objectRepo.HomeRepo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class launchURLTest

{
	public AppiumDriverLocalService server;

	@BeforeSuite
	public void startserver() {
		server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingPort(4723).usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				);
		server.start();


	}

	@AfterSuite
	public void stopServer() {

		server.stop();

	}


	@Test
	public void launchBrowser() throws MalformedURLException, InterruptedException {



		//Set the capabilities
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12" );
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "509ead11022");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 12");
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		//desiredCapabilities.setCapability("appWaitForLaunch", false);
		//desiredCapabilities.setCapability("autoGrantPermissions", false);
		//desiredCapabilities.setCapability(MobileCapabilityTy)
		desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\Praveen B\\Downloads\\chromedriver_win32\\chromedriver.exe");

		URL url = new URL("http://localhost:4723");

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://nobero.com/?_ab=0&_fd=0&_sc=1&preview_theme_id=132509958310");

		
		
		
		
//		HomeRepo hp = new HomeRepo(driver);
//		hp.gethamburger().click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.android.chrome:id/negative_button")).click();



	}
}
