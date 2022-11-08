package com.company.dropdown_checkbox_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnabledDisabledCalender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//disable
	//	driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style"));
		
	//	element which is changing the state from disable to enable
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
	//	now its enabled - id is same for both enable and disable
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style"));
		
		// when opacity 0.5 its disabled so test will failed 
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else{
			System.out.println("its disbaled");
			Assert.assertTrue(false);
			
		}
		
	}
}

		


