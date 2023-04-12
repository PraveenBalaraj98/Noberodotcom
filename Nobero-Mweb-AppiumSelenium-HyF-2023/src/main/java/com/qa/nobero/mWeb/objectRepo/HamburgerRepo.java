package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author Praveen B
 *
 */
public class HamburgerRepo {
	public AndroidDriver driver;
	public HamburgerRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='Track Order']")
	private WebElement trackOrder;
	
	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='Reviews']")
	private WebElement reviews;
	
	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='Return & Exchange']")
	private WebElement returnExchange;
	
	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='Contact Us']")
	private WebElement ContactUs;
	
	@FindBy(xpath="//div[@id='shopify-section-bottom-nav']/descendant::button[contains(.,'Log In or Sign Up')]")
	private WebElement logInSignUp;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::div[contains(.,'New Arrivals') and @class='font-[familyMedium] text-base']")
	private WebElement newArrival;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::li[contains(.,'Men')]")
	private WebElement men;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::li[contains(.,'Women')]")
	private WebElement women;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::li[contains(.,'Co-ord Sets')]")
	private WebElement coOrdSet;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::li[contains(.,'Offers')]")
	private WebElement offers;
	
	@FindBy(xpath="//div[@id='menu-container']//*[local-name()='svg' and @class='icon icon-close']")
	private WebElement closeIcon;
	
	@FindBy(xpath="//div[@id='menu-container']//*[local-name()='svg' and @viewBox='0 0 20 22']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//div[@id='menu-container']//img[@alt='Nobero Logo']")
	private WebElement noberoLogo;
	
	@FindBy(xpath="//*[local-name()='svg' and @viewBox='0 0 8 12']/*[local-name()='path' and @d='M6.5 1L1.5 6L6.5 11']")
	private WebElement NewArrivalbackicon;
	
	@FindBy(xpath="//img[@class='rounded-lg object-cover mobile-nested-img']/parent::a[@href='https://nobero.com/collections/cozy-lounge-1']")	 
	private WebElement cozyLounge;
	
	@FindBy(xpath="//div[@id='shopify-section-bottom-nav']/descendant::button[contains(.,'Log Out')]")
	private WebElement logOut;
	
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getTrackOrder() {
		return trackOrder;
	}

	public WebElement getReviews() {
		return reviews;
	}

	public WebElement getReturnExchange() {
		return returnExchange;
	}

	public WebElement getContactUs() {
		return ContactUs;
	}

	public WebElement getLogInSignUp() {
		return logInSignUp;
	}

	public WebElement getNewArrival() {
		return newArrival;
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCoOrdSet() {
		return coOrdSet;
	}

	public WebElement getOffers() {
		return offers;
	}

	public WebElement getCloseIcon() {
		return closeIcon;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getNoberoLogo() {
		return noberoLogo;
	}

	public WebElement getNewArrivalbackicon() {
		return NewArrivalbackicon;
	}

	public WebElement getCozyLounge() {
		return cozyLounge;
	}
	
	
	
	//PlushRibs
	//summerTees
	//airportCoOrds
	//seeTheLatest
	//topSelling
	//sale
	//cart
	//cartcount
	
	
	
	
	
}
