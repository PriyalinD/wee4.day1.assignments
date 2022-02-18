package week4.day1.assignments;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize(); 
    	driver.get("http://www.leafground.com/pages/table.html");
    	List<WebElement>columns=driver.findElements(By.tagName("th"));
    	System.out.println("Number of columns is" + columns.size());
    	List<WebElement>Rows=driver.findElements(By.tagName("tr"));
    	System.out.println("Number of Rows is" + Rows.size());
       WebElement percent=driver.findElement(By.xpath("//table[@id='table_id']//td[text()='Learn to interact with Elements']/following-sibling::td"));
       String text=percent.getText();
       System.out.println(text);
       driver.findElement(By.xpath("/html/body/div/div/div/div[3]/section/div[1]/table/tbody/tr[4]/td[3]/input")).click();
      WebElement check= driver.findElement(By.xpath("//table[@id='table_id']//td[text()='Learn to interact using Keyboard, Actions']/following-sibling::td[1]"));
      check.click();
      String text1=check.getText();
      System.out.println(text1);
      
      
        
}
}
