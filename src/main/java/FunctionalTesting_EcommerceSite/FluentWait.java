package FunctionalTesting_EcommerceSite;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
		
		
		
		
		
		
		 
				
		

	}

}