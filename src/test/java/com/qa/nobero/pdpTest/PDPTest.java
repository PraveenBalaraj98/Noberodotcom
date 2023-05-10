package com.qa.nobero.pdpTest;

import java.lang.StackWalker.Option;
import java.time.Duration;

import javax.sound.midi.Sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.JavaUtility;
import com.qa.nobero.genericutility.WebDriverUtility;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class PDPTest extends BaseClass	{

	JavaUtility jUtil = new JavaUtility();
	
	
	@Test(enabled=true)
	public void ToVerifyRecentlyViewedIsFunctionalTest() throws InterruptedException {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		//repo.getHomeRepo().gethamburger().click();

		//Step2: Click on Men Collection
		repo.getHomeRepo().getWomens().click();

		//Step3: Click on 1st Product and fetch the Product name.                                                    
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Fetch The product title
		String PDP1ProductTitle = repo.getPDPRepo().getProductTitle().getText();

		//Step4: Scroll the page to similar products
		new WebDriverUtility().scrollToPoint(driver, "0", "1500");		
		
		//Step7: Click on any products in similar products
		repo.getPDPRepo().getsimilarProduct().click();
		
		//Fetch The product title
		String PDP2ProductTitle = repo.getPDPRepo().getProductTitle().getText();
		
		//Step8: click on cart icon
		repo.getHomeRepo().getCartIcon().click();
		
		//Step10: check whether the previously viewed product is displayed in recently viewed section in empty cart page
		String cartrv2_ProductTitle = repo.getCartRepo().getrecentlyViewdProductTitle().trim();
		Assert.assertEquals(PDP2ProductTitle, cartrv2_ProductTitle);
		
		
		//Step :Close cart page
		repo.getCartRepo().getcartCloseIcon().click();
		
		//Step8: Scroll the page to recently viewed
		new WebDriverUtility().scrollToPoint(driver, "0", "2000");
		
		//Step9: check whether the previously viewed product is displayed in recently viewed section 
		String pdpRV_ProdTitle = repo.getPDPRepo().getrecentlyViewdProductTitle().getText().trim();
		Assert.assertEquals(PDP2ProductTitle, pdpRV_ProdTitle);
		

		//Step6: Scroll the page to similar products
		new WebDriverUtility().scrollToPoint(driver, "0", "1500");	
		
		//Step7: Click on any products in similar products
		repo.getPDPRepo().getsimilarProduct().click();
		
		//Fetch The product title
		String PDP3ProductTitle = repo.getPDPRepo().getProductTitle().getText();
		
		//Step8: click on cart icon
		repo.getHomeRepo().getCartIcon().click();
				
		//Step10: check whether the previously viewed product is displayed in recently viewed section in empty cart page
		String cartrv3_ProductTitle = repo.getCartRepo().getrecentlyViewdProductTitle().trim();
		Assert.assertEquals(PDP3ProductTitle, cartrv3_ProductTitle);
		
		
		//Step : Swipe the products in cart check if it is swipe
		//Step :Close cart page
		repo.getCartRepo().getcartCloseIcon().click();
		
		// Find the element representing the current image
		WebElement currentImage = driver.findElement(By.xpath("//div[@id='product-image-carousel-wrapper']"));
		
		Dimension dimension = currentImage.getSize();
		int anchor = currentImage.getSize().getHeight()/2;
		double screenWidthStart = dimension.getWidth()*0.8;
		int  scrollstart =(int)screenWidthStart;
		double screenWidthEnd = dimension.getWidth()*0.2;
		int  scrollend =(int)screenWidthEnd;
		
	

		TouchAction actions = new TouchAction<>(driver);
		actions.press(PointOption.point(scrollstart, anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(scrollend, anchor))
				.release().perform();
	
		
		//Step8: Scroll the page to recently viewed
		//new WebDriverUtility().scrollToPoint(driver, "0", "2000");
		
		//Step9: check whether the last viewed product is displayed in recently viewed section 
		
		//Step : Swipe the products check if it is swipe

	}
	@Test(enabled = true)
	public void ToVerifyProductImageSwipe() {
				//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step2: Click on Men Collection
				repo.getHomeRepo().getWomens().click();

				//Step3: Click on 1st Product and fetch the Product name.                                                    
				repo.getPLPRepo().getProducts().get(0).click();
				
				// Find the element representing the current image
				WebElement currentImage = driver.findElement(By.xpath("//div[@id='product-image-carousel-wrapper']"));
				
				Dimension dimension = currentImage.getSize();
				int anchor = currentImage.getSize().getHeight()/2;
				System.out.println(anchor);
				double screenWidthStart = dimension.getWidth()*0.8;
				int  scrollstart =(int)screenWidthStart;
				System.out.println(scrollstart);
				double screenWidthEnd = dimension.getWidth()*0.2;
				int  scrollend =(int)screenWidthEnd;
				System.out.println(scrollend);
				
//				TouchAction actions = new TouchAction<>(driver);
//				actions.press(PointOption.point(scrollstart, anchor))
//						.moveTo(PointOption.point(scrollend, anchor))
//						.release().perform();
				
				PointerInput pointer = new PointerInput(Kind.TOUCH, "finger");

				// Create a new sequence of touch actions
//				 org.openqa.selenium.interactions.Sequence touchAction = new org.openqa.selenium.interactions.Sequence(pointer, 0));
//
//				// Define the starting point of the touch action
//				Origin origin = pointer.createPointerMove(PointOption.point(scrollstart, scrollend));
//
//				// Define the end point of the touch action
//				PointOption end = PointOption.point(x2, y2);
//
//				// Add the touch actions to the sequence
//				touchAction.addAction(origin);
//				touchAction.addAction(pointer.createPointerDown(MouseButton.LEFT.asArg()));
//				touchAction.addAction(pointer.createPointerMove(end));
//				touchAction.addAction(pointer.createPointerUp(MouseButton.LEFT.asArg()));
//
//				// Perform the touch actions
//				Action touchActionPerformer = touchAction.build();
//				touchActionPerformer.perform();
				
			
	}
	
	@Test()
	public void ToVerifyProductSalesCountisEnabledInPDPpage() throws InterruptedException{
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();
				
				//Step3: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();
				
				//Fetch The sales timer and validate if timer is running
				int salesTimerPre = jUtil.extractNumbers(repo.getPDPRepo().getsalesCount().getText().trim()) ;
				Thread.sleep(5000);
				int salesTimerPost = jUtil.extractNumbers(repo.getPDPRepo().getsalesCount().getText().trim()) ;
				Assert.assertFalse((salesTimerPre==salesTimerPost));
	}
}
