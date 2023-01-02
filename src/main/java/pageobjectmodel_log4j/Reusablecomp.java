package pageobjectmodel_log4j;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reusablecomp {
	WebDriver driver;
	public Reusablecomp(WebDriver driver) {
		this.driver=driver;
	}
	public void popup() {
		//driver.findElement(By.className("cky-btn-accept")).click();
//		Alert Acceptcookies = driver.switchTo().alert();
//		Acceptcookies.accept();
		driver.findElement(By.xpath("//button[@aria-label='Accept All']")).click();
	}

}
