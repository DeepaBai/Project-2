package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(5000);

		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));

		WebElement otp = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].setAttribute('value','deepa')", email);

		Object p = j.executeScript("return arguments[0].getAttribute('value')", email);

		System.out.println(p);

		// String name = email.getAttribute("value");
		//
		// System.out.println(name);

		j.executeScript("arguments[0].click()", otp);

	}

}
