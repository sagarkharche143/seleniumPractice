package com.company.dropdown_checkbox_alert;

import java.util.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAutoSuggestive {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> Options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option : Options) {
		if(option.getText().equalsIgnoreCase("India")) {
			option.click();
		}
		
		
		
		
		}
			

	}
}
