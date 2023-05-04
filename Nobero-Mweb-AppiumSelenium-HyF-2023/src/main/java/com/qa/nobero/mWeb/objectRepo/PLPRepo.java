package com.qa.nobero.mWeb.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PLPRepo {

	AndroidDriver driver;
	public  PLPRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h3[contains(.,'items')]")
	private WebElement items;
	
	@FindBy(xpath="//article[@id='product_price']//span[@class='font-[familyMedium] text-sm text-[#121212] pr-1 lg:text-base ']")
	private List<WebElement> ProductPriceList;
	


	public List<WebElement> getProductPriceList() {
		return ProductPriceList;
	}

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

	
	@FindBy(xpath="//form[@id='submit-mobile-form']//details[@class='filter-group']//li[@class='flex flex-col pt-[18px] pl-1  show-color ']")
	private WebElement firstColor;
	
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
	
	
	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='Less than ₹500']")
	private WebElement lessthan₹500;

	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='₹500 - ₹1000']")
	private WebElement ₹500to₹1000;

	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='₹1000 - ₹1500']")
	private WebElement ₹1000to₹1500;

	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='₹1500 - ₹2000']")
	private WebElement ₹1500to₹2000;

	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='More than ₹2000']")
	private WebElement morethan₹2000;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::section[@class='pb-5']/ul/li")
	private List<WebElement> eachColor;

	
	public List<WebElement> getAllSize() {
		return allSize;
	}
	public WebElement getLessthan₹500() {
		return lessthan₹500;
	}

	public WebElement get₹500to₹1000() {
		return ₹500to₹1000;
	}
	public WebElement get₹1000to₹1500() {
		return ₹1000to₹1500;
	}

	public WebElement get₹1500to₹2000() {
		return ₹1500to₹2000;
	}

	public WebElement getMorethan₹2000() {
		return morethan₹2000;
	}

	public List<WebElement> getEachColor() {
		return eachColor;
	}

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

	public WebElement getFilterByColor() {
		return firstColor;
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
	
	public void selectColor(int index) {	
		List<WebElement> list = this.getEachColor();
		int count = 0;
		for (WebElement webElement : list) {
			count++;
			if (count==index) {
				webElement.click();
			}
		}	
	}
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//li[@class='flex pt-[18px] pl-1  ']//input[@id='Filter-filter.v.option.size-1']")
	private List<WebElement> allSize;
	
	public void selectSize(String Size) {
		
		List<WebElement> list = this.getAllSize();
		for (WebElement webElement : list) {
			String sizeWE = webElement.getText();
			if (sizeWE.equals(Size)) {
				webElement.click();
			}
		}	
	}
	
	//method for price filter and color and size
	
	
	
	
	
	
	
	
	
	
}
