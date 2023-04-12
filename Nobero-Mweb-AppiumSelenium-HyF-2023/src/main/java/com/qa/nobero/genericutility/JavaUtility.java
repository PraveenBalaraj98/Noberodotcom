package com.qa.nobero.genericutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Praveen B
 */
public class JavaUtility {
	
	/**
	 * its used to generate the random number with in the range 
	 * @return
	 */
	public static String getRanDomNumber(int range) {
		Random ranDom = new Random();
		int ranDomNum =  ranDom.nextInt(range);
		String randomInteger = Integer.toString(ranDomNum);
		return randomInteger;
	
	}
	/**
	 *  its used to get the current system date based on YYYY-MM-DD format
	 * @return
	 */
	public String  getSystemDateInYYYYMMDD() {
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
	
			String formate = yyyy+"-"+mm+"-"+dd;
			return formate;
	}
	/**
	 *  its used to get the current system date based on DD-MM-YYYY format 
	 * @return
	 */
	public  String  getSystemDateInDDMMYYYY() {
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;

			String formate = dd+"-"+mm+"-"+yyyy;
			return formate;
	}
	/**
	 *  its used to get the current system date based on MM-DD-YYYY format
	 * @return
	 */
	public String  getSystemDateInMMDDYYYY() {
		Date date = new Date(0);
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
	
			String formate = mm+"-"+dd+"-"+yyyy;
			return formate;
	}

	public String  getSystemDateTime() {
		Date date = new Date();
		String currentDate = date.toString();
		//System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
		String time = arr[3].replace(":", "");
			String formate = dd+mm+yyyy+time;
			return formate;
	}
	
	
}
