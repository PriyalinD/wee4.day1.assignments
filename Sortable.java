package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize(); 
    	driver.get("http://www.leafground.com/pages/sorttable.html");
    	List<WebElement> list =  driver.findElements(By.xpath("//td[2]"));
    	
    List<String>beforesort=new ArrayList<String>();
    for(WebElement name: list)
    {
    	String namebeforesorting=name.getText().trim();
    	beforesort.add(namebeforesorting);
    }
    Collections.sort(beforesort);
    System.out.println(beforesort);
    
    WebElement h=driver.findElement(By.xpath("//th[text()='Name']"));
    	h.click();
    	List<WebElement>list2=driver.findElements(By.xpath("//td[2]"));
    	List<String>aftersort=new ArrayList<String>();
    	for(WebElement name1:list2)
    	{
    		String nameaftersorting=name1.getText().trim();
    		aftersort.add(nameaftersorting);
    		
    	}
    	boolean ststus=beforesort.equals(aftersort);
    	if(ststus==true)
    	{
    	System.out.println("table sort properly");	
    	}
    	else
    	{
    		System.out.println("table not sort properly");
    	}
}
	
	
}