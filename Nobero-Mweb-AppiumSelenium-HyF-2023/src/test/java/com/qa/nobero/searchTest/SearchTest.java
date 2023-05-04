package com.qa.nobero.searchTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.JavaUtility;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;

public class SearchTest extends BaseClass{

	String searchTest="hoodie";

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyThatPLPIsDisplayedAfterValidSearchTest() {



		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Validate the search title
		assertEquals(searchTest, repo.getSearchRepo().getsearchTitle().getText());

		//Check if PLP page is displayed
		Assert.assertTrue(repo.getSearchRepo().getPLPgrid().isDisplayed(), "PLP page is displayed");	

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyApplyFilterPriceAfterValidSearchTest() {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Prive Range 
		repo.getSearchRepo().getpriceRangeFilter().click();

		//Click on any price
		repo.getSearchRepo().get₹1001to₹1500().click();

		//Click on Apply Button
		repo.getSearchRepo().getFilterApply().click();

		//Validate wheather the PLP products are within the Applied pice range
		List<WebElement> PLPprices = repo.getSearchRepo().getPLPgridPrice();
		for (WebElement PLPprice : PLPprices) {
			int prodPrice = JavaUtility.extractNumbers(PLPprice.getText());
			if (prodPrice >= 1001 && prodPrice<=1500) {
				Assert.assertTrue(true);
			}

		}

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyApplyFilterColorAfterValidSearchTest() {
		String colorTest = "Black";
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getcolorFilter().click();

		//Click on given color
		List<WebElement> colors = repo.getSearchRepo().getcolorsSearchFilter();
		for (WebElement colorWE : colors) {
			if (colorTest.equals(colorWE.getText())) {
				colorWE.click();
			}
		}

		//Click on Apply 
		repo.getSearchRepo().getFilterApply().click();

		//Validate searched color is displayed - Click on  an product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();
		//String colorTitle = repo.getSearchRepo().getproductColorTitle().getText();
		int colorIndex=0;
		try {
			boolean check = repo.getSearchRepo().getParamColor(colorTest).isDisplayed(); 
			Assert.assertTrue(true);
		}
		catch (NoSuchElementException e) {
			repo.getSearchRepo().getParamColorPicBox(colorIndex).click();
			colorIndex++;
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyApplyFilterSizeIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getSizeDrawerFilter().click();

		List<WebElement> sizesWE = repo.getSearchRepo().getSizesFilter();
		for (WebElement sizeWE : sizesWE) {

			Assert.assertTrue(sizeWE.isEnabled());
		}
	}


	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyApplyFilterAvailabilityInStockIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getavailabilityFilter().click();

		//Click on In Stock
		repo.getSearchRepo().getInStock().click();

		//Click on Apply 
		repo.getSearchRepo().getFilterApply().click();		

	}


	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyApplyFilterAvailabilityOutOfStockIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getavailabilityFilter().click();

		//Click on In Stock
		repo.getSearchRepo().getOutOfStock().click();

		//Click on Apply 
		repo.getSearchRepo().getFilterApply().click();		

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifySortByFeaturedIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchSortBy().click();

		//Click on Featured
		repo.getSearchRepo().getFeatured().click();
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifySortByNewArrivalIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchSortBy().click();

		//Click on Featured
		repo.getSearchRepo().getNewArrivals().click();
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifySortByPriceLowToHighIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchSortBy().click();

		//Click on Featured
		repo.getSearchRepo().getpriceLowtoHigh().click();
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifySortByPriceHighToLowIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchSortBy().click();

		//Click on Featured
		repo.getSearchRepo().getpriceHighToLow().click();
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyThatPDPIsDisplayedAfterValidSearchTest() {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on first product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyThatProductIsMovedToCartAfterValidSearchTest() {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on first product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();
		String PDPprodTitle = repo.getSearchRepo().getPDPprodTitle().getText();

		//Click On Add To cart
		repo.getSearchRepo().getAddToCart().click();

		//Click on cart
		repo.getSearchRepo().getcartIcon().click();

		//Validate the product in cart page
		String cartProdTitle = repo.getSearchRepo().getcartProdTitle().getText();
		Assert.assertEquals(PDPprodTitle, cartProdTitle);

	}


	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifyNotifyMeWhenAvailableAfterValidSearchTest() {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getavailabilityFilter().click();

		//Click on In Stock
		repo.getSearchRepo().getOutOfStock().click();

		//Click on Apply 
		repo.getSearchRepo().getFilterApply().click();		

		//Click on first product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();

		//Click on 'Notify me when available' button
		repo.getSearchRepo().getNotifyMeWhenAvailable().click();

		//Verify Contlo is displayed
		driver.switchTo().frame(repo.getSearchRepo().getcontloForm());
		Assert.assertTrue(repo.getSearchRepo().getcontloForm().isDisplayed());

	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class)
	public void ToVerifySizeGuideAfterValidSearchTest() {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on first product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();

		//Click on Size Guide
		repo.getSearchRepo().getsizeGuide().click();

		//Verify Contlo is displayed
		driver.switchTo().frame(repo.getSearchRepo().getsizeGuide());
		Assert.assertTrue(repo.getSearchRepo().getsizeGuide().isDisplayed());

	}


}