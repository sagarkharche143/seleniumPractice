package realtimeexercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.get("https://www.path2usa.com/travel-companions");
		driver.get("https://www.airindia.in/");
		driver.findElement(By.id("_depdateeu1")).click();
		
		WebElement currentdate = driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']"));
		currentdate.click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();

	}

}
