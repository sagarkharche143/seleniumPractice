package locators_all;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String name = "Sagar";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		 Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
	//	driver.findElement(By.xpath("//button[text()='Reset Login'")).click();
	//	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String Passwordtext = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] passwordarray = Passwordtext.split("'");
		/*Please use temporary password 'rahulshettyacademy' to Login
		0th index - Please use temporary password 
		1st index - rahulshettyacademy' to Login*/
		String[] passwordarray1 = passwordarray[1].split("'");
		/*0th index - rahulshettyacademy
		1st index -  to Login*/
		String password = passwordarray1[0];
		return password;
	}

}
