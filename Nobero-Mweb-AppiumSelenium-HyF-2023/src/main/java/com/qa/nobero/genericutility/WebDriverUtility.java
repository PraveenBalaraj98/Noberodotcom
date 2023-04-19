package com.qa.nobero.genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class WebDriverUtility {


	public void handlePermissionPopUp(AndroidDriver driver, String clickOn) {
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
		driver.findElement(By.xpath(".//android.widget.Button[@text='"+clickOn+"']")).click();
		//Change context back to the main page.
		driver.context("CHROMIUM");
		
	}
}
