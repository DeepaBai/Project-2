package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));

		WebElement pswd = driver.findElement(By.id("pass"));

		WebElement login = driver.findElement(By.name("login"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','Deepa Bai')", username);

		js.executeScript("arguments[0].setAttribute('value','Deepa@24')", pswd);

		js.executeScript("arguments[0].click()", login);

	}

}
