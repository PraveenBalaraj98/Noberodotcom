//package com.qa.nobero.genericutility;
//
//
//
//import java.io.File;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
///**
// * contains all reusable Actions of Webdriver 
// * @author Praveen
// *
// */
//
//public class WebDriverUtility {
//	/**
//	 * This method to take screenshot when test script is failure
//	 * @param string 
//	 * @param sdriver 
//	 * @return 
//	 */
//	public static String takeScreenShot(WebDriver sdriver, String string) {
//		String screenshotpath="./Screenshot/"+string+new JavaUtility().getSystemDateTime()+".png";
//		EventFiringWebDriver eDriver= new EventFiringWebDriver(sdriver);
//		File src = eDriver.getScreenshotAs(OutputType.FILE);
//		try {
//			File dst = new File(screenshotpath);
//			FileUtils.copyFile(src, dst);	
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return screenshotpath;
//		
//	}
//	
//
//	/**
//	 *  used to Switch to Any Window based on Window Title
//	 * @param driver
//	 * @param partialWindowTitle
//	 */
//	public void swithToWindow(WebDriver driver , String partialWindowTitle) {
//		Set<String> set = driver.getWindowHandles();
//		Iterator<String> it = set.iterator();
//
//		while (it.hasNext()) {
//			String wID = it.next();
//			driver.switchTo().window(wID);
//			String currentWindowTitle = driver.getTitle();
//			if(currentWindowTitle.contains(partialWindowTitle)) {
//				break;
//			}
//		}
//	}
//	/**
//	 * used to Switch to Alert Window & click on OK button
//	 * @param driver
//	 */
//	public void swithToAlertWindowAndAccpect(WebDriver driver ,String expectedMsg) {
//		Alert alt = driver.switchTo().alert();
//		if(!alt.getText().trim().equalsIgnoreCase(expectedMsg.trim())) {
//			System.out.println("Alert Message is not verified");
//		}
//		alt.accept();
//	}
//
//
//	/**
//	 * used to Switch to Alert Window & click on Cancel button
//	 * @param driver
//	 */
//	public void swithToAlertWindowAndCancel(WebDriver driver, String expectedMsg) {
//		Alert alt = driver.switchTo().alert();
//		if(alt.getText().equals(expectedMsg)) {
//			System.out.println("Alert Message is verified");
//		}else {
//			System.out.println("Alert Message is not verified");
//		}
//		alt.dismiss();
//	}
//	/**
//	 * used to Switch to Frame Window based on index
//	 * @param driver
//	 * @param index
//	 */
//	public void swithToFrame(WebDriver driver , int index) {
//		driver.switchTo().frame(index);
//	}
//
//	/**
//	 * used to Switch to Frame Window based on id or name attribute
//	 * @param driver
//	 * @param id_name_attribute
//	 */
//	public void swithToFrame(WebDriver driver , String id_name_attribute) {
//		driver.switchTo().frame(id_name_attribute);
//	}
//
//	/**
//	 * used to select the value from the dropDwon  based on index
//	 * @param driver
//	 * @param index
//	 */
//	public void select(WebElement element , int index) {
//		Select sel = new Select(element);
//		sel.selectByIndex(index);
//	}
//	public void deselectAll(WebElement element) {
//		Select sel = new Select(element);
//		sel.deselectAll();
//	}
//	
//	public List<WebElement> getOptions(WebElement element){
//		Select sel=new Select(element);
//		List<WebElement> options = sel.getOptions();
//		return options;
//	}
//	/**
//	 * used to select the value from the dropDwon  based on value / option avlaible in GUI
//	 * @param element
//	 * @param value
//	 */
//	public void select(WebElement element , String text) {
//		Select sel = new Select(element);
//		sel.selectByVisibleText(text);
//	}
//	/**
//	 * used to place mouse cursor on specified element
//	 * @param driver
//	 * @param elemnet
//	 */
//	public void mouseOverOnElement(WebDriver driver , WebElement elemnet)
//	{
//		Actions act = new Actions(driver);
//		act.moveToElement(elemnet).perform();
//	}
//
//	/**
//	 * 	 used to right click  on specified element
//
//	 * @param driver
//	 * @param elemnet
//	 */
//
//	public void rightClickOnElement(WebDriver driver , WebElement elemnet)
//	{
//		Actions act = new Actions(driver);
//		act.contextClick(elemnet).perform();
//	}
//
//	/**
//	 * 	
//	 * @param driver
//	 * @param javaScript
//	 */
//	public void executeJavaScript(WebDriver driver , String javaScript) {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeAsyncScript(javaScript, null);
//	}
//	/**
//	 * Wait and click the element
//	 * @param element
//	 * @param waitTime
//	 */
//	public void waitAndClick(WebElement element, int waitTime) throws InterruptedException
//	{
//		int count = 0;
//		while(count<waitTime) {
//			try {
//				element.click();
//				break;
//			}catch(Throwable e){
//				Thread.sleep(1000);
//				count++;
//			}
//		}
//	}
//
//
//
//	/**
//	 * pass enter Key appertain in to Browser
//	 * @param driver
//	 */
//	public void passEnterKey(WebDriver driver) {
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.ENTER).perform();
//		
//	} 
//}
//
//
//
//
//
