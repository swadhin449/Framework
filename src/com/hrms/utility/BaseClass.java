package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {
//Driver
public static WebDriver driver;
//Open Application
public static void openApplication() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SWADHIN KUMAR JENA\\Dropbox\\My PC (LAPTOP-FBQ671D5)\\Desktop\\Adactin\\Selenium\\Drivers\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application Opened");
	Reporter.log("Application Opened");
}
//Close Application
public static void closeApplication() {
	driver.close();
	System.out.println("Application Closed");
	Reporter.log("Application Closed");
}
}
