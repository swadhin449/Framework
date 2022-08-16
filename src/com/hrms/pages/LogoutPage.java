package com.hrms.pages;
import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.*;
public class LogoutPage extends BaseClass{
//Objects
static By link_logout = By.linkText("Logout");
//Function
public static void logout() {
driver.findElement(link_logout).click();
Reporter.log("Logout Completed");
}
}
