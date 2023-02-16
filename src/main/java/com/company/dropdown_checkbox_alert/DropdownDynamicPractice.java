package com.company.dropdown_checkbox_alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDynamicPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[@value='BLR'])[2]"))	.click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		/*
		 * driver.findElement(By.xpath("//a[@value='BLR']")) .click(); I have wrap this
		 * in (//a[@value='BLR'])[2] because it showing 2 elements, 1 from city and
		 * another 1 from to city
		 */
		 
		}
	public void parentChildRelationship(WebDriver driver)
	{
		/* we are selecting the to city using parent-child relationship xpath because some of the client not
		accept code wrote using index*/
	// ParentXpath ChildXpath	
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a//[@value='BLR'")).click();
	}
 
}
