package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		Thread.sleep(3000);
	
		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
	
		driver.switchTo().frame(frame);
		
		WebElement customerid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		customerid.sendKeys("12345678");
		
		WebElement continuebtn = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		
		continuebtn.click();
		
}

}