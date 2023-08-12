package org.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> allrow = driver.findElements(By.xpath("//table[@id='customers']//child::tr"));
		
		for (int i = 0; i < allrow.size(); i++) {
		
			WebElement eachrow = allrow.get(i);
			
			List<WebElement> alltd = eachrow.findElements(By.tagName("td"));
			
			for (int j = 0; j < alltd.size() ; j++) {
				
				WebElement eachtd = alltd.get(j);
				
				String eachtxt = eachtd.getText();
				
				System.out.println(eachtxt);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}