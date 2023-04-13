package com.qa.nobero.cartTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;
@Listeners(com.qa.nobero.genericutility.ITestListenerImpClass.class)
public class cartTest extends BaseClass {

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyProductIsAddedToCartTest() {
		
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);
		
		//Step1: Click on Hamburger icon
		repo.getHomeRepo().gethamburger().click();
		
		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getOffers().click();
		
		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();
		
		//Step4: Click on Availability
			repo.getPLPRepo().getFilterAvailability().click();
		
		//Step5: Click on 'In Stock'
			repo.getPLPRepo().getInStockradio().click();
		
		//Step6: Click On Apply
			//repo.getPLPRepo().getApply().click();
		
		//Step7: Click on Sort
		repo.getPLPRepo().getSortBy().click();
		//repo.getPLPRepo().getCloseSort().click();
		
		//Step8: Click on Best Selling
		repo.getPLPRepo().getBestSelling().click();
		
		//Step9: Click on 1st Product and fetch the Product name
		String prodName = repo.getPLPRepo().getProductName().getText();
		System.out.println(prodName);
		repo.getPLPRepo().getProducts().click();
		
		//Step10: Select Size
		
		//Step11: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();
		
		//Step12: Go to Cart 
		repo.getHomeRepo().getCartIcon().click();
	
		//Step13: Clcik On Proceed to buy
		repo.getCartRepo().getProceedToBuy().click();
			
	}
	
}
