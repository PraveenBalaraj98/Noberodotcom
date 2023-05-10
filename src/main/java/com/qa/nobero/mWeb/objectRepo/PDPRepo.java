package com.qa.nobero.mWeb.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PDPRepo {

	AndroidDriver driver;
	public  PDPRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public AndroidDriver getDriver() {
		return driver;
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
	
	
	@FindBy(xpath="//section[@id='shopify-section-template--16063919063206__reco']//div[@class='container flex-col']/h2[contains(.,'Similar Products')]")
	private WebElement similarProductTitle;
	public WebElement getsimilarProductTitle() {
		return similarProductTitle;
	}
	
	@FindBy(xpath="//div[@class='flex flex-col']/descendant::h1")
	private WebElement ProductTitle;
	public WebElement getProductTitle() {
		return ProductTitle;
	}
	
	@FindBy(xpath="//div[@id='slick-slide30']")
	private WebElement recentlyViewdProductTitle;
	public WebElement getrecentlyViewdProductTitle() {
		return recentlyViewdProductTitle;
	}
	
	@FindBy(xpath="//div[@id='shopify-section-template--16047755657382__recent-products']//div//div//div/div/div/div/div")
	private List<WebElement> recentlyViewdProduct;
	public List<WebElement> getrecentlyViewdProduct() {
		return recentlyViewdProduct;
	}
	
	@FindBy(xpath="//div[@id='slick-slide50']")
	private WebElement similarProduct;
	public WebElement getsimilarProduct() {
		return similarProduct;
	}
	
	@FindBy(xpath="//form[@id='product-form-template--16047755657382__main']//span[@id='selected-color-title']")
	private WebElement colorName;
	public WebElement getcolorName() {
		return colorName;
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
	

	@FindBy(xpath="//div[@class='flex overflow-x-scroll hide-scrollbar']//label[@class='relative cursor-pointer size-select mb-6 size-selected']")
	private WebElement selectedSize;
	public WebElement getselectedSize() {
		return selectedSize;
	}
	
	@FindBy(xpath="//span[text()='Item is out of stock']")
	private WebElement toastMessageOutStock;
	public WebElement getToastMessageOutStock() {
		return toastMessageOutStock;
	}
	
	@FindBy(xpath="//div[@id='ratings-badge-mweb']")
	private WebElement reviewCountOnProduct;
	public WebElement getreviewCountOnProduct() {
		return reviewCountOnProduct;
	}
	
	@FindBy(xpath="//details[@id='judgeme_mweb']//div[@class='jdgm-rev-widg__summary-text']")
	private WebElement basedOnReview;
	public WebElement getbasedOnReview() {
		// TODO Auto-generated method stub
		return basedOnReview;
	}
	
	@FindBy(xpath="//div[@id='shopify-section-template--16047755657382__main']//div[@id='sales_countdown']")
	private WebElement salesCount;
	public WebElement getsalesCount() {
		return salesCount;
	}
	
	
	
	
}
