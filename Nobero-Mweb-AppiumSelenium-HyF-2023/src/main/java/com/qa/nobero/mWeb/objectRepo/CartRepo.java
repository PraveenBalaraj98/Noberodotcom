package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * @author Praveen B
 *
 */
public class CartRepo {
	
	AndroidDriver driver;
	
	
	public CartRepo(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath="//button[@name='minus']")
	private WebElement minus;
	
	@FindBy(xpath="//button[@name='plus']")
	private WebElement plus;
	
	@FindBy(xpath="//input[@name='updates[]']")
	private WebElement quantity;
	
	@FindBy(xpath="//a[contains(.,'Remove')]")
	private WebElement remove;
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getMinus() {
		return minus;
	}

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getRemove() {
		return remove;
	}

	public WebElement getProceedToBuy() {
		return proceedToBuy;
	}

	@FindBy(xpath="//div[@id='footer-amount']//button[contains(.,'Proceed to buy')]")
	private WebElement proceedToBuy;
	
	
}
