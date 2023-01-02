package com.company.dropdown_checkbox_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownStatic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement CurrencyDD = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select CurrencyDropdown = new Select(CurrencyDD);
		CurrencyDropdown.selectByValue("USD");
		System.out.println(CurrencyDropdown.getFirstSelectedOption().getText());
		/* there is only one dropdown is present so used getFirstSelectedOption
		 * if there is multiple dropdown use getAllSelectedOptions().
		 */
		

	}

}
