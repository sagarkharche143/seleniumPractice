package realtimeexercises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenderui2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.get("https://www.path2usa.com/travel-companions");
		driver.get("https://www.airindia.in/");
		driver.findElement(By.id("_depdateeu1")).click();
	//	! is used coz
		while (!driver.findElement(By.xpath(
				"//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//div[@class='ui-datepicker-title']"))
				.getText().contains("February")) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		}
		List<WebElement> dates = driver.findElements(By.className("ui-datepicker-group ui-datepicker-group-last"));
	
		int count = driver.findElements(By.className("ui-datepicker-group ui-datepicker-group-last")).size();
		for(int i = 1; i<= count; i++)
		{ 
			String text = driver.findElements(By.className("ui-datepicker-group ui-datepicker-group-last")).get(i).getText();
			if(text.equalsIgnoreCase("20"));
			{
				driver.findElements(By.className("ui-datepicker-group ui-datepicker-group-last")).get(i).click();
				break;
			}
			
		}
				
		

	}

}	
