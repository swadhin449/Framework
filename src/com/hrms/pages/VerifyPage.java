package com.hrms.pages;
import org.testng.Reporter;

import com.hrms.utility.*;
public class VerifyPage extends BaseClass{
//Verify
public static void verifyTitle(String Title) {
	if(driver.getTitle().equals(Title)) {
		Reporter.log("Title Matched");
	}
	else {
		Reporter.log("Title not Matched");
		Reporter.log(driver.getTitle());
	}
}
}
