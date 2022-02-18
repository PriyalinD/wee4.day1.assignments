package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize(); 
		driver.get("http://www.leafground.com/pages/TextChange.html");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement btn=	driver.findElement(By.id("btn"));
	wait.until(ExpectedConditions.textToBePresentInElement(btn,"Click ME!"));
	btn.click()	;
	Alert alert=driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
}
}