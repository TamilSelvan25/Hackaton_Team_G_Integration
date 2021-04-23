package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class UploadFilePage extends BaseClass {

	static ExtentTest test;
	static ExtentReports report;
	public String path = "\\Users\\Bhavani\\eclipse-workspace\\Demo\\screenshot";
	
	@BeforeTest
	public void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");

	test = report.startTest("MainTest");
	}
	
			@Test(priority=0, groups= {"group1","group2"})
			public void setup() throws Exception{

				 Launchbrowser();
				 driver.get(prop.getProperty("url")); 
				
				

			}
				
				 @Test(priority=1,groups= {"group1","group2"})
				 public void selectAdd() throws Exception{
					 LoginPage login = new LoginPage(driver);
					 move(login.getMouseComponent());
					 login.getMonitors().click();
					 login.getAppleCinema().click();
					 login.getCheckbox3().click();
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					 js.executeScript("window.scrollBy(0,1000)");
					 Select se = new Select(driver.findElement(By.xpath("//select[@id='input-option217']")));
					 se.selectByIndex(1);
					 login.getText().sendKeys(prop.getProperty("Textarea"));
					 //l.getUploadFile().click();
					 //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
					 login.getFileAddtocart().click();
					 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
					 screenShot(path+"\\screenshotlast3.jpeg");
					 report.flush();
				 }
}


