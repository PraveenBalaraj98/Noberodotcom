package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class RepositoryHub {

	private static AndroidDriver driver ; 
	
	public RepositoryHub(AndroidDriver driver2) {
		PageFactory.initElements(driver2,this);
		RepositoryHub.driver = driver2;
	}
	
	public CartRepo getCartRepo(){
		CartRepo cartRepo = new CartRepo(driver);
		return cartRepo;
	}
	
	public HamburgerRepo getHamburgerRepo(){
		HamburgerRepo hamburgerRepo = new HamburgerRepo(driver);
		return hamburgerRepo;
	}
	
	public HomeRepo getHomeRepo(){
		HomeRepo homeRepo = new HomeRepo(driver);
		return homeRepo;
	}
	
	public MyAccountRepo getMyAccountRepo(){
		MyAccountRepo myAccountRepo = new MyAccountRepo(driver);
		return myAccountRepo;
	}
	
	public PDPRepo getPDPRepo(){
		PDPRepo pdpRepo = new PDPRepo(driver);
		return pdpRepo;
	}
	
	public PLPRepo getPLPRepo(){
		PLPRepo plpRepo = new PLPRepo(driver);
		return plpRepo;
	}
	
	public TrackOrderRepo getTrackOrderRepo(){
		TrackOrderRepo trackOrderRepo = new TrackOrderRepo(driver);
		return trackOrderRepo;
	}
	
}
