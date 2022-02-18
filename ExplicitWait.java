package week4.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver(); 
    driver.manage().window().maximize(); 
	driver.get("http://www.leafground.com/pages/appear.html");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
    WebElement element=   driver.findElement(By.xpath("(//div[@class='flex']//button)[3]"));
    element.click();
    System.out.println(element.getText());
  
}
	

}
