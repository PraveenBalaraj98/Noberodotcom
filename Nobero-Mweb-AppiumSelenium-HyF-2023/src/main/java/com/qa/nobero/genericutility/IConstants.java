package com.qa.nobero.genericutility;

import java.time.Duration;

/**
 * @author Praveen B
 *
 */
public interface IConstants {

	String EXCELPATH = "./testdata/excelFile/NoberoTestData.xlsx";
	
	String qaPropertyFilePath = "./propertyFile/config/qa.properties";

	Duration Explicitly_TIMEOUT = Duration.ofSeconds(20);
	Duration Implicitly_TIMEOUT = Duration.ofSeconds(20);;
}
