package pageobjectmodel_log4j;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class turkeyappvisa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Turkey turkey = new Turkey(driver);
		turkey.openurl();
		Reusablecomp reusecomp = new Reusablecomp(driver);
		reusecomp.popup();
		turkey.applyonline();
		turkey.applyonlinetoturkeyapp();

	}

}
