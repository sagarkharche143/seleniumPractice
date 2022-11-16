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
		
		//System.out.println(productsList);
		Thread.sleep(3000);
		for(int i =0; i< productsList.size(); i++) {
			String productname = productsList.get(i).getText();
			productname.split("-");
			String formattedname  = productname.trim();
			
			System.out.println(formattedname);
			if(formattedname.contains("Cucumber")) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();		
				break;
			}
		}
		

	}

}
