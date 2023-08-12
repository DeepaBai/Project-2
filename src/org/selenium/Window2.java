package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbox.sendKeys("oppo k1 back cover for girls");
		
		WebElement clickbtn = driver.findElement(By.id("nav-search-submit-button"));
		
		clickbtn.click();
		
		WebElement product = driver.findElement(By.className("s-image"));
		
		product.click();
		
		Set<String> allwindow  = driver.getWindowHandles();
		
		int count = 1;
		
		for (String eachwindow : allwindow) {
			
			if (count == 2) {
				
				driver.switchTo().window(eachwindow);
			}
			count++;
			
			}
		
		WebElement bynowbtn = driver.findElement(By.id("buy-now-button"));
		
		bynowbtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
