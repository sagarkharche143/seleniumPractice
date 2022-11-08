package FunctionalTesting_EcommerceSite;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingProductsToCarts_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] productsToBeOrder = { "Cucumber", "Brocolli", "Beetroot","Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		List<WebElement> productsList = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < productsList.size(); i++) {

			String[] productname = productsList.get(i).getText().split("-");

			// Brocolli - 1 Kg
			// Brocolli - 0th index
			// 1 Kg - 1st index

			String formattedProductName = productname[0].trim();
			// convert array into arraylist for search
			// check productname is present in arraylist or not
			List productsToBeOrder2 = Arrays.asList(productsToBeOrder);
			if (productsToBeOrder2.contains("formattedProductName")) {
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j ==productsToBeOrder.length) {

				}
				break;

			}
		}

	}

}
