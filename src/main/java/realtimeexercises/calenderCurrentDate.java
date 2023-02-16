package realtimeexercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderCurrentDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.get("https://www.path2usa.com/travel-companions");
		driver.get("https://www.airindia.in/");

		driver.findElement(By.id("_depdateeu1")).click();
		Thread.sleep(1000);
		WebElement currentdate = driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']"));
		currentdate.click();
	//	driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")).click();

		/*
		 * driver.findElement(By.id("_depdateeu1")).click(); 
		 * Date dateobj = new Date();
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss"); String
		 * formattedDate = sdf.format(dateobj); System.out.println(formattedDate);
		 */
	}

}
