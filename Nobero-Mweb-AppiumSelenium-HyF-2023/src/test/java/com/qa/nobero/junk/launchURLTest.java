package com.qa.nobero.junk;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.qa.nobero.mWeb.objectRepo.HomeRepo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class launchURLTest {

	@Test
	public void launchBrowser() throws MalformedURLException, InterruptedException {
		
		
		
		//Set the capabilities
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12" );
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "VC5T9P89PNL7D6CA");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi k50i");
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

		URL url = new URL("http://localhost:4723/wd/hub");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		
		driver.get("https://nobero.com/?_ab=0&_fd=0&_sc=1&preview_theme_id=132509958310");
		
		HomeRepo hp = new HomeRepo(driver);
		hp.gethamburger().click();
		
		
		
	}
}
