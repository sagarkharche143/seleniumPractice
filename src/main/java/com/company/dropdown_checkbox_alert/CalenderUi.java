package com.company.dropdown_checkbox_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderUi {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();	
		
		//Calender
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		// return date ui is enabled or disabled
		System.out.println(driver.findElement(By.cssSelector("input[id*=mainContent_view_date2]")).isEnabled());
		Assert.assertTrue(false);
	

	}
	
}


	
	
	
	


