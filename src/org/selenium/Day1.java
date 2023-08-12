package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1 {
	
	public static void main(String[] args){
		
		//Firefox
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.quit();
	
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Documents\\Selenium properties\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("https://www.facebook.com/");
		
		driver1.close();
		
	
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Documents\\Selenium properties\\geckodriver.exe");
		
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("https://www.amazon.in");
	
		driver2.quit();
	
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Documents\\Selenium properties\\geckodriver.exe");
		
		WebDriver driver3 = new FirefoxDriver();
		
		driver3.get("http://greenstech.in/selenium-course-content.html");
	
		driver3.quit();
		
		
		//Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver cdriver1=new ChromeDriver();
		
		cdriver1.get("http://www.greenstechnologys.com/");
		
		cdriver1.quit();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		ChromeDriver cdriver2 = new ChromeDriver();
		
		cdriver2.get("http://gmail.com/");
		
		cdriver2.quit();
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		ChromeDriver cdriver3 = new ChromeDriver();
		
		cdriver3.get("http://www.flipkart.com/");
		
		cdriver3.quit();
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");
		
		WebDriver cdriver4 = new ChromeDriver();
		
		cdriver4.get("http://greenstech.in/selenium-course-content.html");
		
		cdriver4.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
