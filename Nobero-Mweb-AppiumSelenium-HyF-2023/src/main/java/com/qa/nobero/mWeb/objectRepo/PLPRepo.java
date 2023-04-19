package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PLPRepo {

	AndroidDriver driver;
	public  PLPRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath="//h3[contains(.,'items')]")
	private WebElement items;
	
	@FindBy(xpath="//article[@id='product-grid']/section")
	private WebElement products;
	
	@FindBy(xpath="//article[@id='product-grid']/section//h3")
	private WebElement productName;
	
	@FindBy(xpath="//article[@id='product-grid']/section//h3/..//article[@id='price__regular']")
	private WebElement productPrice;
	
	@FindBy(xpath="//article[@id='filter_button']")
	private WebElement filter;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//span[text()='Price']")
	private WebElement filterPrice;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//span[text()='Color']")
	private WebElement filterColor;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//span[text()='Size']")
	private WebElement filterSize;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//span[text()='Availability']")
	private WebElement filterAvailability;
	
	@FindBy(xpath="//a[text()='Clear All' and @id='clear-all-fitlers']")
	private WebElement clearAll;
	
	@FindBy(xpath="//input[@id='filter-submit']")
	private WebElement Apply;
	
	@FindBy(xpath="//article[@id='filter_header']/button[@id='filter_close_btn']")
	private WebElement closeFilter;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//div[@class='pl-5 lg:pl-0']//label[@class='cursor-pointer']")
	private WebElement filterByPrice;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//details[@class='filter-group']//li[@class='flex flex-col pt-[18px] pl-1  show-color ']")
	private WebElement filterByColor;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//details[@class='filter-group']//span[contains(.,'+ Show')]")
	private WebElement showMoreColor;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//details[@class='filter-group']//span[contains(.,'- Hide')]")
	private WebElement hideColor;
	
	@FindBy(xpath="//section[@id='filter_container']//details[@class='filter-group']//ul[@class='grid grid-cols-4 px-3 lg:px-0 pb-5']/li")
	private WebElement filterBySize;
	
	@FindBy(xpath="//section[@id='filter_container']//details[@class='filter-group']//span[text()='In stock']")
	private WebElement inStockradio;
	
	@FindBy(xpath="//section[@id='filter_container']//details[@class='filter-group']//span[text()='Out of stock']")
	private WebElement OutOfStockradio;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='Featured']")
	private WebElement featured;
	
	@FindBy(xpath="//article[@id='sort_button']")
	private WebElement sortBy;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='New Arrivals']")
	private WebElement newArrivals;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='Best Selling']")
	private WebElement bestSelling;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='Price low to High']")
	private WebElement priceLowToHigh;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='Price High to low']")
	private WebElement priceHightolow;
	
	@FindBy(xpath="//article[@id='sort_header']/button[@id='sort_close_btn']")
	private WebElement closeSort;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getBestSelling1() {
		return bestSelling;
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getItems() {
		return items;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductPrice() {
		return productPrice;
	}

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getFilterPrice() {
		return filterPrice;
	}

	public WebElement getFilterColor() {
		return filterColor;
	}

	public WebElement getFilterSize() {
		return filterSize;
	}

	public WebElement getFilterAvailability() {
		return filterAvailability;
	}

	public WebElement getClearAll() {
		return clearAll;
	}

	public WebElement getApply() {
		return Apply;
	}

	public WebElement getCloseFilter() {
		return closeFilter;
	}

	public WebElement getFilterByPrice() {
		return filterByPrice;
	}

	public WebElement getFilterByColor() {
		return filterByColor;
	}

	public WebElement getShowMoreColor() {
		return showMoreColor;
	}

	public WebElement getHideColor() {
		return hideColor;
	}

	public WebElement getFilterBySize() {
		return filterBySize;
	}

	public WebElement getInStockradio() {
		return inStockradio;
	}

	public WebElement getOutOfStockradio() {
		return OutOfStockradio;
	}

	public WebElement getFeatured() {
		return featured;
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getNewArrivals() {
		return newArrivals;
	}

	public WebElement getBestSelling() {
		return bestSelling;
	}

	public WebElement getPriceLowToHigh() {
		return priceLowToHigh;
	}

	public WebElement getPriceHightolow() {
		return priceHightolow;
	}

	public WebElement getCloseSort() {
		return closeSort;
	}
	
	//method for price filter and color and size
	
	
	
	
	
	
	
	
	
	
}
