package com.company.dropdown_checkbox_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes_Assertion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		// Count of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type=checkbox]")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type=checkbox]")).size(), 6);
				
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());	
		Assert.assertFalse(false, "driver.findElement(By.cssSelector(\"input[id*=friendsandfamily]\")).isSelected()");
		driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		Assert.assertTrue(true, "driver.findElement(By.cssSelector(\"input[id*=friendsandfamily]\")).isSelected()");
		

	}

}
