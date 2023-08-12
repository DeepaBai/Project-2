package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		WebElement porur = driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));

		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].scrollIntoView()", porur);

		WebElement header = driver.findElement(By.id("client-logo"));

		Thread.sleep(3000);

		j.executeScript("arguments[0].scrollIntoView()", header);

	}
}
