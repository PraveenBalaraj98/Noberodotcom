package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PDPRepo {

	AndroidDriver driver;
	public  PDPRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath="//button[contains(.,'Add to Cart')]")
	private WebElement addToCart;
	
	@FindBy(xpath="//button[contains(.,'Notify me when available')]")
	private WebElement notifyMeWhenAvailable;
	
	@FindBy(xpath="//input[@value='Black']")
	private WebElement color; //method-color
	
	public WebElement getNotifyMeWhenAvailable() {
		return notifyMeWhenAvailable;
	}

	@FindBy(xpath="//div[@class='flex overflow-x-scroll hide-scrollbar']//input[@value='S']")
	private WebElement size; //method-size
		
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getSize() {
		return size;
	}
	
	
	
	
}
