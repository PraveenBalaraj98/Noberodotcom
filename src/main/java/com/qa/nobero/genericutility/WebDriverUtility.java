package com.qa.nobero.genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class WebDriverUtility {

	public void scrollToVisibleTest(AndroidDriver driver, String visibleText)
	{
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollTextIntoView(" + visibleText + "))"));

	}
	public void scrollToPoint(AppiumDriver driver,String x,String y) {
 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+");");

	}
	
	public void scrollToElement(AppiumDriver driver,WebElement WE) {
		 
		Point point = WE.getLocation();
		int x = point.getX();
		int y = point.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+");");

	}
	
	  public void scrollToElement(AndroidDriver driver, WebElement element) {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	    }

	public void handlePermissionPopUp(AndroidDriver driver) {
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println( contextName );
			if (contextName.contains("CHROMIUM")) {
				driver.context("NATIVE_APP");
				try {
					Thread.sleep( 1500 );
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		//Click on Allow
		driver.findElement(By.xpath(".//android.widget.Button[@text='Block']")).click();
		//Change context back to the main page.
		driver.context("CHROMIUM");
		
	}

}
