package locators_all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.get("https://git-scm.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

	}

}
