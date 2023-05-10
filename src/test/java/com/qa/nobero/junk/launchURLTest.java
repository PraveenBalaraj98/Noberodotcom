package com.qa.nobero.junk;

import org.openqa.selenium.logging.LogEntry;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.JavaUtility;
import com.qa.nobero.mWeb.objectRepo.HomeRepo;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class launchURLTest extends BaseClass

{

	@Test(enabled = false)
	public void launchBrowser() throws MalformedURLException, InterruptedException {



		//Set the capabilities
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12" );
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "509ead11022");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 12");
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		//desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		//desiredCapabilities.setCapability("appWaitForLaunch", false);
		//desiredCapabilities.setCapability("autoGrantPermissions", false);
		//desiredCapabilities.setCapability(MobileCapabilityTy)
		desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\Praveen B\\Desktop\\chromedriver_win32\\chromedriver.exe");

		URL url = new URL("http://localhost:4723");

		//		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("--disable-notifications");

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.unlockDevice();
		driver.get("https://nobero.com/?_ab=0&_fd=0&_sc=1&preview_theme_id=132509958310");

		//		HomeRepo hp = new HomeRepo(driver);
		//		hp.gethamburger().click();
		Thread.sleep(4000);
		//	driver.switchTo().
		//driver.findElement(By.id("com.android.chrome:id/negative_button")).click();

		//	 Set<String> contextNames = driver.getContextHandles();
		//		for (String contextName : contextNames) {
		//		System.out.println( contextName );
		//		if (contextName.contains("WEBVIEW")) {
		//		driver.context( contextName );
		//		System.out.println( contextName );
		//		try {
		//		Thread.sleep( 1500 );
		//		} catch (InterruptedException e) {
		//		e.printStackTrace();+
		//		}
		//		}
		//		}

		//Handle Permission Pop up, Switch To Native app i.e Chrome
		driver.context("NATIVE_APP");
		//Click on Allow
		driver.findElement(By.xpath(".//android.widget.Button[@text='Allow']")).click();
		//Change context back to the main page.
		driver.context("CHROMIUM");
		HomeRepo hp = new HomeRepo(driver);
		hp.getHamburger().click();

	}

	@Test(enabled = false)
	public void fetchVariantID() {

		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> Logs = entry.getAll();
		for (LogEntry logEntry : Logs) {
			System.out.println("----->"+logEntry);
		}

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifyApplyFilterforPrice₹1000to₹1500Test() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 4:Click on ShopAllProducts in top picks in Mens Page
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on '₹1000 to ₹1500'
		repo.getPLPRepo().get₹1000to₹1500().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product ₹1000 to ₹1500  is displayed

		//Scroll the PLP page 
		try {
			long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
			System.out.println(lastHeight);
			while (true) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
				Thread.sleep(2000);
				long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
				if (newHeight == lastHeight) {
					break;
				}
				lastHeight = newHeight;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Fetch the product price of all the products in the PLP and check if all the products are between 1000 and 1500
		List<WebElement> ProductPriceList = repo.getPLPRepo().getProductPriceList();
		for (WebElement ProductPrice : ProductPriceList) {
			new JavaUtility();
			int price = new JavaUtility().extractNumbers(ProductPrice.getText());
			Assert.assertTrue(price>=1000&&price<1500);
		}
	}
}
