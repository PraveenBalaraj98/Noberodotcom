package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class TrackOrderRepo {
	AndroidDriver driver;
	
	public TrackOrderRepo(AndroidDriver driver2) {
		PageFactory.initElements(driver,this);	}
}
