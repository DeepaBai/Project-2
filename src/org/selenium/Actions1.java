package org.selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag5000 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement dropdebit = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions ac = new Actions(driver);
		
		Actions dragAndDrop = ac.dragAndDrop(drag5000, dropdebit);
		
		dragAndDrop.perform();
		
		WebElement drag5km = driver.findElement(By.xpath("(//a[@class='button button-orange'])[3]"));
		
		WebElement dropcredit = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		ac.dragAndDrop(drag5km, dropcredit).perform();
		
}
	}
