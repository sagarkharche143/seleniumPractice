package selenium_4_features;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dimensions_screenshot {


	/****************Added comment for checking************************/
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
	// if u want to take new tab take WindowType.TAB
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		String coursename = driver.findElement(By.xpath("//a[contains(text(),'All-Access Membership-Complete Access to 25+ Cours')]")).getText();
		driver.switchTo().window(parentwindow);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(coursename);
	// screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File( "sample.png"));
	//Dimensions height and width of element
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		

	}


}
