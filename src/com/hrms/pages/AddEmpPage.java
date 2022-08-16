package com.hrms.pages;
import org.openqa.selenium.By;

import com.hrms.utility.*;
public class AddEmpPage extends BaseClass {
static By txt_firstname = By.name("txtEmpFirstName");
static By txt_lastname  = By.name("txtEmpLastName");
static By id_save       = By.id("btnEdit");
static By path_add     = By.xpath("//input[@value='Add']");
public static void addEmployee(String fn,String ln) {
	driver.switchTo().frame("rightMenu");
	driver.findElement(path_add).click();
	driver.findElement(txt_lastname).sendKeys(ln);
	driver.findElement(txt_firstname).sendKeys(fn);
	driver.findElement(id_save).click();
	driver.switchTo().defaultContent();
}
}
