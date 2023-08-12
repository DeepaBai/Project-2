package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	
	driver.get("https://www.snapdeal.com/");
	
	//first window 		//only parent
	String oldwindow = driver.getWindowHandle();
	
	WebElement searchbox = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
	
	searchbox.sendKeys("iphone 7");
	
	
	WebElement searchclick = driver.findElement(By.xpath("//span[text()='Search']//parent::button"));
	
	searchclick.click();
	
	Thread.sleep(3000);
	
	WebElement product1 = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
	
	product1.click();
	
	
	//new window 					//all window
	Set<String> newwindow = driver.getWindowHandles();
	
	int sizeofallwindow = driver.getWindowHandles().size();
	
	System.out.println("Total window opened : "+sizeofallwindow);
	
	for(String eachwindow : newwindow) {
		
		if (!eachwindow.equals(oldwindow)) {
			
			driver.switchTo().window(eachwindow);
				
		}
		
		}
	
	WebElement addtocart = driver.findElement(By.xpath("(//span[@class='intialtext'])[2]"));
	
	addtocart.click();
	
	
	
	
}
}