package FunctionalTesting_EcommerceSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingProductsToCarts_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		List<WebElement> productsList = driver.findElements(By.xpath("//h4[@class='product-name']"));
		Thread.sleep(3000);
		for(int i =0; i< productsList.size(); i++) {
			String productname = productsList.get(i).getText();
			if(productsList.contains("Cucumber")) {
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();		
				break;
			}
		}
		

	}

}
