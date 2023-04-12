package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountRepo {

WebDriver driver;
	
	public MyAccountRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement LoginEmailField;
	
	@FindBy(xpath="//input[@id='id_password']")
	private WebElement LoginPassword;
	
	@FindBy(xpath="//input[@id='ForgotPassword']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//button[@id='signIn']")
	private WebElement signInButton;
	
	@FindBy(xpath="//a[contains(.,'Create your account')]")
	private WebElement createAccount;
	
	@FindBy(xpath="//input[@name='customer[first_name]']")
	private WebElement FirstName;

	@FindBy(xpath="//input[@name='customer[last_name]']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='customer[email]']")
	private WebElement RegEmail;
	
	@FindBy(xpath="//input[@name='customer[password]']")
	private WebElement RegPassword;
	
	@FindBy(xpath="//button[contains(.,'Register')]")
	private WebElement registerButton;
	
	@FindBy(xpath="//a[contains(.,'Login Here')]")
	private WebElement LoginHere;
	
	@FindBy(xpath="//input[@id='RecoverEmail']")
	private WebElement recoverEmail;
	
	@FindBy(xpath="//input[@id='resetBtn']")
	private WebElement recoverSubmit;
	
	@FindBy(xpath="//a[contains(.,'Cancel')]")
	private WebElement cancelLink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoginEmailField() {
		return LoginEmailField;
	}

	public WebElement getLoginPassword() {
		return LoginPassword;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getRegEmail() {
		return RegEmail;
	}

	public WebElement getRegPassword() {
		return RegPassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getLoginHere() {
		return LoginHere;
	}

	public WebElement getRecoverEmail() {
		return recoverEmail;
	}

	public WebElement getRecoverSubmit() {
		return recoverSubmit;
	}

	public WebElement getCancelLink() {
		return cancelLink;
	}
	
}
