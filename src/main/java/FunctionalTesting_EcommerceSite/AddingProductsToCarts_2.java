package FunctionalTesting_EcommerceSite;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingProductsToCarts_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int j = 0;
		String[] productsToBeOrder = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		/*
		 * List<WebElement> productsList =
		 * driver.findElements(By.xpath("//h4[@class='product-name']"));
		 * 
		 * for (int i = 0; i < productsList.size(); i++) {
		 * 
		 * String[] productname = productsList.get(i).getText().split("-"); String
		 * formattedProductName = productname[0].trim(); // convert array into arraylist
		 * for search // check productname is present in arraylist or not List
		 * productsToBeOrder2 = Arrays.asList(productsToBeOrder); if	
		 * (productsToBeOrder2.contains(formattedProductName)) { j++;
		 * 
		 * // click on add to cart
		 * driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)
		 * .click();
		 * 
		 * if (j == (productsToBeOrder).length) {
		 * 
		 * break;
		 * 
		 * } }
		 * 
		 * }
		 */

		checkout(driver, productsToBeOrder);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		// explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

	}

	public static void checkout(WebDriver driver, String[] productsToBeOrder) {
		int j = 0;

		List<WebElement> productsList = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < productsList.size(); i++) {

			String[] productname = productsList.get(i).getText().split("-");
			String formattedProductName = productname[0].trim();
			// convert array into arraylist for search
			// check productname is present in arraylist or not
			List productsToBeOrder2 = Arrays.asList(productsToBeOrder);
			if (productsToBeOrder2.contains(formattedProductName)) {
				j++;

				// click on add to cart
			//	driver.findElement(By.xpath("//button[text()='ADD TO CART'"));
			//	Text is changing from add to cart to added for sometime so text not work properly
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == (productsToBeOrder).length) {

					break;

				}
			}

		}

	}

}
