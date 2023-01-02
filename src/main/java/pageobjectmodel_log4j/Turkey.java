package pageobjectmodel_log4j;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Turkey {
	
	WebDriver driver;
//	By=ById.onlineapplysection;
	public Turkey(WebDriver driver)
	{
	//	initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="onlineapplysection")
	WebElement applyonline;
	@FindBy(id="buttonForTurkey")
	WebElement applyonlinetoturkeyapp;
	@FindBy(xpath="//button[@id='buttonForTurkey']")
	WebElement applyonlinetoturkey;
	
	public void openurl() {
		driver.get("https://qa.edocs.travel/");
	}
	
	
	public void applyonline() {
		driver.findElement(By.id("buttonForTurkey"));
	}
	
	public void applyonlinetoturkeyapp() {
		driver.findElement(By.xpath("//button[@id='buttonForTurkey']"));
	}
	// Actions method
	
	public void turkeyappform() {
		applyonline.click();
		applyonlinetoturkeyapp.click();
		applyonlinetoturkey.click();
		
	}
	
	
	
	
	
	}


