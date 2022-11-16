package AjaxWindowsIframes_MouseKeyboardActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles();
		// to repeat 
		Iterator<String>iterate= window.iterator();
		// parent and child window
		String parentWindow = iterate.next();
		String childWindow = iterate.next();
		
		// if there will three window would open you have to use iterate.next() one more time
		
		// to shift the driver focus from parent to child window
		driver.switchTo().window(childWindow);
		
		//grabbing the text from child window
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		// Parse the string to get actual text you want ==> Debug-->Right click --> watch

		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(email);
		
		//to shift the driver focus from child to parent window
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		

	}

}
