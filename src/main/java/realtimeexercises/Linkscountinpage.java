package realtimeexercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkscountinpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//1. total link on whole page--> link always given in anchortag inside div or href so take tagname as "a" blindly
		System.out.println(driver.findElements(By.tagName("a")).size());
		// 2.link count in footer
		//Limiting the driver to footer 
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3.link count in perticular column in footer
		WebElement columndriver = driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4. click on each link in column and check it is opening or  not and print title of each link
		// press control and click on link to open in seperate tab
		for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonfootercollink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonfootercollink);
			Thread.sleep(5000);
			// opened all link in seperate tab	
		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it =window.iterator();
		// printing title of each tab
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		

	}

}
