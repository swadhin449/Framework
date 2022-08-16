package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC002 {
@Test
public static void tc002() {
	BaseClass.openApplication();
	VerifyPage.verifyTitle("OrangeHRMS");
	LoginPage.login("nareshit", "nareshit");
	VerifyPage.verifyTitle("hrms");
	AddEmpPage.addEmployee("Amit", "Singh");
	LogoutPage.logout();
	BaseClass.closeApplication();
}
}
