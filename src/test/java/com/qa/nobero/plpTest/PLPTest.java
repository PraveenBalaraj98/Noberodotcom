package com.qa.nobero.plpTest;

import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.JavaUtility;
import com.qa.nobero.genericutility.WebDriverUtility;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;

public class PLPTest extends BaseClass{
	JavaUtility jUtil = new JavaUtility();
	
	@Test(enabled=true)
	public void ToVerifyNewArrivalsPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHomeRepo().getNewArrival().getText().trim();

		//Step 3: Click on Collection - New Arrivals
		repo.getHomeRepo().getNewArrival().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyBestSellerPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHomeRepo().getBestSeller().getText().trim();

		//Step 3: Click on Collection - BestSeller
		repo.getHomeRepo().getBestSeller().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyMensPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHomeRepo().getMens().getText().trim();

		//Step 3: Click on Collection - Men's
		repo.getHomeRepo().getMens().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyWomensPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHomeRepo().getWomens().getText().trim();

		//Step 3: Click on Collection - Women's
		repo.getHomeRepo().getWomens().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyCoOrdSetPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHomeRepo().getCoOrdSet().getText().trim();

		//Step 3: Click on Collection - Co-Ord Set
		repo.getHomeRepo().getCoOrdSet().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=false)
	public void ToVerifyMenSummerTeesPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Swipe the Collection carousal 



		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHomeRepo().getmensSummerTees().getText().trim();

		//Step 3: Click on Collection - Men's Summer Tees
		repo.getHomeRepo().getmensSummerTees().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyCoOrdSetPageFromHamburgerPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHamburgerRepo().getCoOrdSet().getText().trim();

		//Click on Co-Ord Sets in HAmburger Page
		repo.getHamburgerRepo().getCoOrdSet().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyCoOrdSetPageFromMenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		String collectionName = repo.getHamburgerRepo().getMenCoordSets().getText();

		//Click on Co-Ord Sets in Mens Page
		repo.getHamburgerRepo().getMenCoordSets().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyComfortJoggersPageFromMenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		String collectionName = repo.getHamburgerRepo().getMenComfortJoggers().getText();

		//Click on ComfortJoggers in Mens Page
		repo.getHamburgerRepo().getMenComfortJoggers().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifySummerShortsPageFromMenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		String collectionName = repo.getHamburgerRepo().getMenSummerShorts().getText();

		//Click on SummerShorts in Mens Page
		repo.getHamburgerRepo().getMenSummerShorts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifySummerSetsPageFromMenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		String collectionName = repo.getHamburgerRepo().getMenSummerSets().getText();

		//Click on SummerSets in Mens Page
		repo.getHamburgerRepo().getMenSummerSets().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifySummerTeesPageFromMenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		String collectionName = repo.getHamburgerRepo().getMenSummerTees().getText();

		//Click on SummerTees in Mens Page
		repo.getHamburgerRepo().getMenSummerTees().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyOversizedTeesPageFromMenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		String collectionName = repo.getHamburgerRepo().getMenOversizedTees().getText();

		//Click on OversizedTees in Mens Page
		repo.getHamburgerRepo().getMenOversizedTees().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyTopPicksShopAllProductsPageFromMenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		//String collectionName = repo.getHamburgerRepo().getMenOversizedTees().getText();

		//Click on ShopAllProducts in top picks in Mens Page
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("Men", plpTitle);

	}

	@Test(enabled=true)
	public void ToVerify_Pickany3at999_PageFromMenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		//String collectionName = repo.getHamburgerRepo().getMenPicksTeesTitle().getText().trim();

		//Click on ShopAllProducts in Pick any 3 @ 999in Mens Page
		repo.getHamburgerRepo().getMenPicksTeesShopAllProducts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("T-Shirts", plpTitle);

	}


	//********************************************************************************************

	@Test(enabled=true)
	public void ToVerifyCoOrdSetPageFromWomenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getWomen().click();

		//Step 2: Fetch The Collection Name from Women s Page
		String collectionName = repo.getHamburgerRepo().getWomenCoordSets().getText();

		//Click on Co-ord Sets in Women s Page
		repo.getHamburgerRepo().getWomenCoordSets().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyComfortJoggersPageFromWomenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getWomen().click();

		//Step 2: Fetch The Collection Name from Women Page
		String collectionName = repo.getHamburgerRepo().getWomenComfortJoggers().getText();

		//Click on ComfortJoggers in Women Page
		repo.getHamburgerRepo().getWomenComfortJoggers().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifySummerShortsPageFromWomenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getWomen().click();

		//Step 2: Fetch The Collection Name from Women Page
		String collectionName = repo.getHamburgerRepo().getWomenSummerShorts().getText();

		//Click on SummerShorts in Women Page
		repo.getHamburgerRepo().getWomenSummerShorts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifySummerTeesPageFromWomenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getWomen().click();

		//Step 2: Fetch The Collection Name from Women Page
		//String collectionName = repo.getHamburgerRepo().getWomenSummerTees().getText();

		//Click on SummerTees in Women Page
		repo.getHamburgerRepo().getWomenSummerTees().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("Women's Summer Tees", plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyOversizedTShirtPageFromWomenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Women Page
		//String collectionName = repo.getHamburgerRepo().getWomenoversizedTShirts().getText();

		//Click on oversizedTShirts in Women Page
		repo.getHamburgerRepo().getWomenoversizedTShirts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("Women Oversized  T-shirt", plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyTexturedCollectionPageFromWomenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Women Page
		//String collectionName = repo.getHamburgerRepo().getWomenTexturedCollection().getText().trim();

		//Click on TexturedCollection in Women Page
		repo.getHamburgerRepo().getWomenTexturedCollection().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("Plush Ribs", plpTitle);

	}

	@Test(enabled=true)
	public void ToVerifyTopPicksShopAllProductsPageFromWomenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		//String collectionName = repo.getHamburgerRepo().getMenOversizedTees().getText();

		//Click on Shop all products in Top Picks in Women Page
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("Women", plpTitle);

	}

	@Test(enabled=true)
	public void ToVerify_Pickany3at999_PageFromWomenPageTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Womens Page
		//String collectionName = repo.getHamburgerRepo().getWomenPicksTeesTitle().getText().trim();

		//Click on Shop all products in Pick any 3 @ 999 in Womens Page
		repo.getHamburgerRepo().getWomenPicksTeesShopAllProducts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("Women's Summer Tees", plpTitle);

	}

	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = false,priority = 3)
	public void ToVerifyApplyFilterforPriceLessthan₹500Test() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 4:Click on ShopAllProducts in top picks in Mens Page
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on 'less than 500'
		repo.getPLPRepo().getLessthan₹500().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product less than 500 is displayed

			//Scroll the PLP page 
				repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP
				List<WebElement> ProductPriceList = repo.getPLPRepo().getProductPriceList();
				for (WebElement ProductPrice : ProductPriceList) {
					int price = new JavaUtility().extractNumbers(ProductPrice.getText());
				    Assert.assertTrue(price<500);
				}
		
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = false,priority = 3)
	public void ToVerifyApplyFilterforPrice₹500to₹1000Test() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 4:Click on ShopAllProducts in top picks in Mens Page
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on '₹500 to ₹1000'
		repo.getPLPRepo().get₹500to₹1000().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product ₹500 to ₹1000 is displayed

			//Scroll the PLP page 
			repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP and check if all the products are between 500 and 1000
				List<WebElement> ProductPriceList = repo.getPLPRepo().getProductPriceList();
				for (WebElement ProductPrice : ProductPriceList) {
					int price = new JavaUtility().extractNumbers(ProductPrice.getText());
				    Assert.assertTrue(price>=500&&price<1000);
				}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 3)
	public void ToVerifyApplyFilterforPrice₹1000to₹1500Test() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 4:Click on ShopAllProducts in top picks in Mens Page
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on '₹1000 to ₹1500'
		repo.getPLPRepo().get₹1000to₹1500().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product ₹1000 to ₹1500  is displayed

			//Scroll the PLP page 
				repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP and check if all the products are between 1000 and 1500
				List<WebElement> ProductPriceList = repo.getPLPRepo().getProductPriceList();
				for (WebElement ProductPrice : ProductPriceList) {
					new JavaUtility();
					int price = jUtil.extractNumbers(ProductPrice.getText());
				    Assert.assertTrue(price>=1000&&price<1500);
				}
				
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = false,priority = 3)
	public void ToVerifyApplyFilterforPrice₹1500to₹2000Test() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 4:Click on ShopAllProducts in top picks in Mens Page
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on '₹1500 to ₹2000'
		repo.getPLPRepo().get₹1500to₹2000().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product ₹1500 to ₹2000  is displayed

			//Scroll the PLP page 
				repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP and check if all the products are between 1500 and 2000
				List<WebElement> ProductPriceList = repo.getPLPRepo().getProductPriceList();
				for (WebElement ProductPrice : ProductPriceList) {
					new JavaUtility();
					int price = jUtil.extractNumbers(ProductPrice.getText());
				    Assert.assertTrue(price>=1500&&price<2000);
				}
				
	}
	

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyApplyFilterforPricemorethan2000Test() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 4:Click on ShopAllProducts in top picks in Mens Page
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on more than 2000
		repo.getPLPRepo().getMorethan₹2000().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product more than 2000  is displayed

			//Scroll the PLP page 
				repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP and check if all the products are more than 2000
				List<WebElement> ProductPriceList = repo.getPLPRepo().getProductPriceList();
				for (WebElement ProductPrice : ProductPriceList) {
					new JavaUtility();
					int price = jUtil.extractNumbers(ProductPrice.getText());
				    Assert.assertTrue(price>2000);
				}
				
				
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyApplyFilterforColorTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on color
		repo.getPLPRepo().getFilterColor().click();

		//Step5: click on any color
		repo.getPLPRepo().selectColor(2);

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();

		//Step8: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step9: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());

	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 4)
	public void ToVerifyApplyColorFilterValidateColorInPDPPageTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on color
		repo.getPLPRepo().getFilterColor().click();
		
		//Step5: lick on Show more color
		repo.getPLPRepo().getShowMoreColor().click();

		//Step6: click on any color and get name
		String filterColorName = repo.getPLPRepo().GetColorNameAndselectColor(3);

		//Step7: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step8: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step9 :Get The color Name in PDP page
		String PDPColorName = repo.getPDPRepo().getcolorName().getText().trim();
		
		//Step10 :Validate the color Name
		Assert.assertEquals(filterColorName, PDPColorName);


	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 4)
	public void ToVerifyApplyColorFilterValidateColorInCartPageTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on color
		repo.getPLPRepo().getFilterColor().click();
		
		//Step5: lick on Show more color
		repo.getPLPRepo().getShowMoreColor().click();

		//Step5: click on any color and get name
		String filterColorName = repo.getPLPRepo().GetColorNameAndselectColor(3);

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();

		//Step8: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();
		
		//Fetch the color name in cart
		String cartColorName = repo.getCartRepo().getcartColorName().getText();
		
		//Assert the color name in cart page
		Assert.assertEquals(filterColorName, cartColorName);

		//Step9: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 5)
	public void ToVerifyApplyFilterforSizeTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on color drawer
		repo.getPLPRepo().getFilterSize().click();

		//Step5: select a color
		repo.getPLPRepo().selectSize("M");

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();

		//Step8: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step9: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 4)
	public void ToVerifyApplyColorFilterValidateSizeInPDPPageTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on size drawer
		repo.getPLPRepo().getFilterSize().click();

		//Step6: click on size and fetch name
		String filterColorName = repo.getPLPRepo().GetSizeNameAndselectSize(2);

		//Step7: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step8: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step9 :Get The color Name in PDP page
		String PDPSizeName = repo.getPDPRepo().getselectedSize().getText().trim();
		
		//Step10 :Validate the color Name
		Assert.assertEquals(filterColorName, PDPSizeName);


	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 4)
	public void ToVerifyApplyColorFilterValidateSizeInCartPageTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on size drawer
		repo.getPLPRepo().getFilterSize().click();

		//Step6: click on size and fetch name
		String filterSizeName = repo.getPLPRepo().GetSizeNameAndselectSize(2);

		//Step7: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step8: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();

		//Step8: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();
		
		//Fetch the size name in cart
		String cartSizeName = repo.getCartRepo().getcartSizeName().getText().trim();
		
		//Assert the size name in cart page
		Assert.assertEquals(filterSizeName, cartSizeName);

		//Step9: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());

	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 6)
	public void ToVerifyApplyFilterforAvailabilityInStockTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Availability
		repo.getPLPRepo().getFilterAvailability().click();

		//Step5: Click on 'In Stock'
		repo.getPLPRepo().getInStockradio().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();

		//Step8: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step9: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 6)
	public void ToVerifyApplyFilterforAvailabilityOutOfStockTest() throws InterruptedException {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Availability
		repo.getPLPRepo().getFilterAvailability().click();

		//Step5: Click on 'Out Of Stock'
		repo.getPLPRepo().getOutOfStockradio().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step8: Validate the Toast message
		String toastMessage = repo.getPDPRepo().getToastMessageOutStock().getText().trim();
		Assert.assertEquals(toastMessage, "Item is out of stock");
		
		//Toast message should be disappeared after 3 seconds
		Thread.sleep(3000);
		if (repo.getPDPRepo().getToastMessageOutStock().isDisplayed()) {
			Assert.fail();
		}
		
		//Step8: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step9: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 7)
	public void ToVerifySortByBestSellingTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on Sort
		repo.getPLPRepo().getSortBy().click();

		//Step4: Click on Best Selling
		repo.getPLPRepo().getBestSelling().click();

		//Step5: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step7: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step8: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 8)
	public void ToVerifySortByFeaturedTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on Sort
		repo.getPLPRepo().getSortBy().click();

		//Step4: Click on Featured
		repo.getPLPRepo().getFeatured().click();

		//Step5: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();

		//Step7: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step8:  Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 9)
	public void ToVerifySortByNewArrivalTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on Sort
		repo.getPLPRepo().getSortBy().click();

		//Step4: Click on New Arrival
		repo.getPLPRepo().getNewArrivals().click();

		//Step5: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();

		//Step7: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step8:  Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 10)
	public void ToVerifySortByPriceLowToHighTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

		//Step3: Click on Sort
		repo.getPLPRepo().getSortBy().click();

		//Step4: Click on PriceLowToHigh
		repo.getPLPRepo().getPriceLowToHigh().click();
		
		//Step5: Scroll the page
		repo.getPLPRepo().ScrollAllProducts(driver);

		//Step6: Fetch the product price
		int firstPrice = jUtil.extractNumbers(repo.getPLPRepo().getProductPriceList().get(0).getText());
		int lastPrice = jUtil.extractNumbers(repo.getPLPRepo().getProductPriceList().get(repo.getPLPRepo().getProductPriceList().size()-1).getText());
		
		Assert.assertTrue(firstPrice<=lastPrice);
		
		//Step5: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step7: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step8:  Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 11)
	public void ToVerifySortByPriceHighToLowTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenCoordSets().click();

		//Step3: Click on Sort
		repo.getPLPRepo().getSortBy().click();

		//Step4: Click on PriceHighToLow
		repo.getPLPRepo().getPriceHightolow().click();
		
		//Step5: Scroll the page
		repo.getPLPRepo().ScrollAllProducts(driver);

		//Step6: Fetch the product price
		int firstPrice = jUtil.extractNumbers(repo.getPLPRepo().getProductPriceList().get(0).getText());
		int lastPrice = jUtil.extractNumbers(repo.getPLPRepo().getProductPriceList().get(repo.getPLPRepo().getProductPriceList().size()).getText());
		Assert.assertTrue(firstPrice>=lastPrice);
		
		//Step7: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();

		//Step8: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step9:  Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 11)
	public void ToVerifyPLPproductCount() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenCoordSets().click();

		//Step3: fetch the product count in PLP page
		int PLPreviewcount = jUtil.extractNumbers(repo.getPLPRepo().getPLPcount().getText().trim());
		
		//Scroll the PLP page
		repo.getPLPRepo().ScrollAllProducts(driver);
		
		//Fetch the count of PLP products
		int ProductGridSize = repo.getPLPRepo().getProducts().size();
			
		//Validate the Product count in P:P page
		Assert.assertEquals(PLPreviewcount, ProductGridSize);
		
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,priority = 11)
	public void ToVerifyReviewCountFromPLPtoPDPpage() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenCoordSets().click();

		//Step3: fetch the review count and click on Product
		int PLPreviewcount = repo.getPLPRepo().FetchReviewCountAndClickProduct(0);

		//Step4: Go to review Section
		repo.getPDPRepo().getreviewCountOnProduct().click();
		
		//Validate the Review count in PDP page
		int PDPreviewcount = jUtil.extractNumbers(repo.getPDPRepo().getbasedOnReview().getText());
		Assert.assertEquals(PLPreviewcount, PDPreviewcount);
		
	}
	
	@Test()
	public void ToVerifyProductInPLPCartAfterAddingProdtuctToCart() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();
				
				//Step3: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();
				
				//Fetch The product title
				String ProductTitle = repo.getPDPRepo().getProductTitle().getText().toLowerCase();
				
				//Add the product to cart
				repo.getPDPRepo().getAddToCart().click();
				
				//Fetch the product title in cart from PDP page
				String productTitleCart1 = repo.getCartRepo().ProductName().getText().toLowerCase();
				Assert.assertEquals(ProductTitle, productTitleCart1);
				
				//Click on Close icon in half cart page
				repo.getCartRepo().getcartCloseIcon().click();
				
				//Click on browser back button
				driver.navigate().back();
				
				//Click on cart icon
				repo.getHomeRepo().getCartIcon().click();
				
				//Fetch the product title in cart from PLP page
				String productTitleCart2 = repo.getCartRepo().ProductName().getText().toLowerCase();
				Assert.assertEquals(ProductTitle, productTitleCart2);
					
	}

}
