package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opencart.utils.BaseClass;

public class Product_Page extends BaseClass {
	

	public static void opencartapplycouponcode()
    {
        driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
        driver.findElement(By.xpath("//input[@id='input-coupon']")).sendKeys("XYZA");
        driver.findElement(By.xpath("//input[@id='button-coupon']")).click();
        WebElement errormsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
        String Error = errormsg.getText();
        String errorMessage = "Warning";
        if(Error.contains(errorMessage)) {
            System.out.println("Wrong Coupon Code Entered");
        }

}
	
}
