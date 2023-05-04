package com.qa.nobero.cartTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.JavaUtility;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;
@Listeners(com.qa.nobero.genericutility.ITestListenerImpClass.class)
public class cartTest extends BaseClass {
	List<WebElement> priceList;

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifyProductIsAddedToCartTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().gethamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getOffers().click();

		//Step3: Click on 1st Product and fetch the Product name.                                                    
		repo.getPLPRepo().getProducts().click();

		//Step5: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step6: Go to Cart 
		repo.getHomeRepo().getCartIcon().click();

		//Step7: Clcik On Proceed to buy
		//repo.getCartRepo().getProceedToBuy().click();
		if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
			Assert.assertEquals("1", "1");
		}else {
			Assert.fail();
		}

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifyProductIsAddedToCartAfterSearchTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//CLick on Search icon	
		repo.getSearchRepo().getSearchIcon().click();

		//Search for product - "Shirt"
		repo.getSearchRepo().getSearchText().sendKeys("Joggers");

		//Search Close
		repo.getSearchRepo().getSearchClose().click();
		
		//Step9: Click on 1st Product and fetch the Product name.                                                   
		repo.getSearchRepo().getProduct().click();

		//Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		// Go to Cart 
		repo.getHomeRepo().getCartIcon().click();

		//Clcik On Proceed to buy
		//repo.getCartRepo().getProceedToBuy().click();
		if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
			Assert.assertEquals("1", "1");
		}else {
			Assert.fail();
		}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = false)
	public void ToVerifyApplyFilterforPriceTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().gethamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getOffers().click();

				//Step3: Click on  Filter 
				repo.getPLPRepo().getFilter().click();

				//Step4: Click on Price
				repo.getPLPRepo().getFilterPrice().click();
		
				//Step5: Click on 'less than 500'
				repo.getPLPRepo().getLessthan₹500().click();
				
				//Step6: Click On Apply
				repo.getPLPRepo().getApply().click();

				//Step7: Validate whether prodcut less than 500 is displayed on Sort
				
				//Scrolling of pages needs to be implemented
				priceList = repo.getPLPRepo().getProductPriceList();
				for (WebElement webElement : priceList) {
					String priceSTR = webElement.getText();
					System.out.println(priceSTR);
//					//int price = new JavaUtility().returnNumber(priceSTR);
//					int price;
//					String conc="";
//					for (int i = 0; i < priceSTR.length(); i++) {
//						if (priceSTR.charAt(i)>=48 || priceSTR.charAt(i)<=57) {
//							conc=conc+priceSTR.charAt(i);
//						}	
//					}
//					price = Integer.parseInt(conc);
//					System.out.println(price);
//					if (!(price<500)) {
//						Assert.fail("Products less than 500 is not displayed");
//					}
				}
				
				

				//Step9: Click on 1st Product.                                                    
				repo.getPLPRepo().getProducts().click();

				//Step11: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step12: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step13: Clcik On Proceed to buy
				repo.getCartRepo().getProceedToBuy().click();
	}
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifyApplyFilterforColorTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().gethamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getOffers().click();

				//Step3: Click on  Filter 
				repo.getPLPRepo().getFilter().click();

				//Step4: Click on color
				repo.getPLPRepo().getFilterColor().click();

				//Step5: click on any color
				repo.getPLPRepo().selectColor(2);
				
				//Step6: Click On Apply
				repo.getPLPRepo().getApply().click();

				//Step7: Click on 1st Product.                                                    
				repo.getPLPRepo().getProducts().click();

				//Step8: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step9: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step10: Clcik On Proceed to buy
				//repo.getCartRepo().getProceedToBuy().click();
				if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
					Assert.assertEquals("1", "1");
				}else {
					Assert.fail();
				}
			
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifyApplyFilterforSizeTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().gethamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getOffers().click();

				//Step3: Click on  Filter 
				repo.getPLPRepo().getFilter().click();

				//Step4: Click on color
				repo.getPLPRepo().getFilterSize().click();

				//Step5: click on any color
				repo.getPLPRepo().selectSize("M");
				
				//Step6: Click On Apply
				repo.getPLPRepo().getApply().click();

				//Step7: Click on 1st Product.                                                    
				repo.getPLPRepo().getProducts().click();

				//Step8: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step9: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step10: Clcik On Proceed to buy
				//repo.getCartRepo().getProceedToBuy().click();
				if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
					Assert.assertEquals("1", "1");
				}else {
					Assert.fail();
				}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifyApplyFilterforAvailabilityTest() {
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
				repo.getPLPRepo().getApply().click();

				//Step7: Click on 1st Product.                                                    
				repo.getPLPRepo().getProducts().click();

				//Step8: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step9: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step10: Clcik On Proceed to buy
				//repo.getCartRepo().getProceedToBuy().click();
				if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
					Assert.assertEquals("1", "1");
				}else {
					Assert.fail();
				}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifySortByBestSellingTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().gethamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getOffers().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();

				//Step4: Click on Best Selling
				repo.getPLPRepo().getBestSelling().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().click();

				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step9: Clcik On Proceed to buy
				//repo.getCartRepo().getProceedToBuy().click();
				if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
					Assert.assertEquals("1", "1");
				}else {
					Assert.fail();
				}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifySortByFeaturedTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().gethamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getOffers().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();

				//Step4: Click on Featured
				repo.getPLPRepo().getFeatured().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().click();

				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step9: Clcik On Proceed to buy
				//repo.getCartRepo().getProceedToBuy().click();
				if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
					Assert.assertEquals("1", "1");
				}else {
					Assert.fail();
				}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifySortByNewArrivalTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().gethamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getOffers().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();
				
				//Step4: Click on New Arrival
				repo.getPLPRepo().getNewArrivals().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().click();

				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step9: Clcik On Proceed to buy
				//repo.getCartRepo().getProceedToBuy().click();
				if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
					Assert.assertEquals("1", "1");
				}else {
					Assert.fail();
				}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifySortByPriceLowToHighTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().gethamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getOffers().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();

				//Step4: Click on PriceLowToHigh
				repo.getPLPRepo().getPriceLowToHigh().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().click();

				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step9: Clcik On Proceed to buy
				//repo.getCartRepo().getProceedToBuy().click();
				if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
					Assert.assertEquals("1", "1");
				}else {
					Assert.fail();
				}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true)
	public void ToVerifySortByPriceHighToLowTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().gethamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getOffers().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();

				//Step4: Click on PriceHighToLow
				repo.getPLPRepo().getPriceHightolow().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().click();

				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8: Go to Cart 
				repo.getHomeRepo().getCartIcon().click();

				//Step9: Clcik On Proceed to buy
				//repo.getCartRepo().getProceedToBuy().click();
				if (repo.getCartRepo().getProceedToBuy().isEnabled()) {
					Assert.assertEquals("1", "1");
				}else {
					Assert.fail();
				}
	}



}
