package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitDisappear {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize(); 
		driver.get("http://www.leafground.com/pages/disapper.html");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn")));
	    WebElement ele=	driver.findElement(By.xpath("/html/body/div/div/div[3]/div[3]/p/strong"));
	    System.out.println(ele.getText());
	  
	}
		

	}
	

