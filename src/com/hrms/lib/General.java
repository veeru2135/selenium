package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
//To provide all re-usable fun:related to whole application
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.navigate().to(url);
      System.out.println("Application Opened");//Console
      Reporter.log("Application opened");//html report
      Log.info("Application Opened");//Log file
	}
   public void closeApplication() {
	   driver.close();
	   System.out.println("Application Closed");
	   Reporter.log("Application Closed");//html report
	      Log.info("Application Closed");//Log
   }
   public void login() {
	   driver.findElement(By.name(txt_loginname)).sendKeys(un);
	   driver.findElement(By.name(txt_password)).sendKeys(pw);
	   driver.findElement(By.name(btn_login)).click();
	   System.out.println("Login Completed");
	   Reporter.log("Login Completed ");//html report
	      Log.info("Login Completed ");//Log
   }
   public void logout() {
	   driver.findElement(By.linkText(link_Logout)).click();
	   System.out.println("Logout Completed");
	   Reporter.log("Logout Completed ");//html report
	      Log.info("Logout Completed ");//Log
   }
   public void enterFrame() {
	   driver.switchTo().frame(frm_empinfo);
	   System.out.println("Entered into frame");
	   Reporter.log("Enterd into frame ");//html report
	      Log.info("Enterd into Frame ");//Log
   }
   public void exitFrame() {
	   driver.switchTo().defaultContent();
	   System.out.println("exit from frame");
	   Reporter.log("Exit into frame ");//html report
	      Log.info("exit into frame");//Log
   }
   public void addNewEmp() {
	   driver.findElement(By.xpath(btn_Add)).click();
	   driver.findElement(By.name(txt_EFN)).sendKeys(FN);
	   driver.findElement(By.name(txt_ELN)).sendKeys(LN);
	   driver.findElement(By.id(btn_Save)).click();
	   System.out.println("New Emp Added");
	   Reporter.log("New emp added ");//html report
	      Log.info("New emp added ");//Log
   }
}
