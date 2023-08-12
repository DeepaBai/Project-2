package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));

		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();

	}

}
