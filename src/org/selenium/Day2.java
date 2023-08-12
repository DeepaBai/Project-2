package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//method 1
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		username.sendKeys("ideepabai2000@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("Deepa@24");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		login.click();
		
		Thread.sleep(10000);
		
		driver.close();
		
		
		//method2
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.redbus.in/");
		
		WebElement from = driver1.findElement(By.xpath("(//input[@class='db'])[1]"));
		
		from.sendKeys("September 25 1994");
		
		WebElement to = driver1.findElement(By.xpath("//input[@id='dest']"));
		
		to.sendKeys("April 24 2000");
		
		Thread.sleep(3000);
		
		driver1.quit();
		
		
		//method4
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver driver4 = new ChromeDriver();
		
		driver4.get("https://www.swiggy.com/");
		
		WebElement location = driver4.findElement(By.xpath("//input[@class='_381fS _1oTLG _3BIgv']"));
		
		location.sendKeys("Ambur");
		
		Thread.sleep(3000);
		
		driver4.quit();
		
		
		
		//method3
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
				
		WebDriver driver3 = new ChromeDriver();
				
		driver3.get("https://www.google.com/");
				
		WebElement search = driver3.findElement(By.xpath("//input[@name='q']"));
				
		search.sendKeys("GreensTechnology"+Keys.ENTER);
				
		Thread.sleep(3000);
				
		driver3.quit();
		
		
		//method 5
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver driver5 = new ChromeDriver();
		
		driver5.get("https://www.icicibank.com/");
		
		WebElement customerid = driver5.findElement(By.xpath("//input[@id='search-chatInput']"));
		
		customerid.sendKeys("2425");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
