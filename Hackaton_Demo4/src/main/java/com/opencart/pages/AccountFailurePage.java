package com.opencart.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AccountFailurePage extends BaseClass{
	
	static ExtentTest test;
	static ExtentReports report;
	
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
				 public void userLogin() throws Exception{
					 LoginPage login = new LoginPage(driver);
					 login.getDropdown().click();
					 login.getRegister().click();
					 login.getFirstName().sendKeys(prop.getProperty("FirstName"));
					 login.getLastName().sendKeys(prop.getProperty("LastName"));
					 login.getEmail().sendKeys(prop.getProperty("E-Mail"));
					 login.getCheckbox().click();
					 login.getButtonclick().click();
	                 driver.quit();
	                 report.flush();
	
				 }

}
