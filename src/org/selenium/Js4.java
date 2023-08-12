package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		WebElement user = driver.findElement(By.className("login_input"));

		WebElement password = driver.findElement(By.id("password"));

		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','Lion')", user);

		js.executeScript("arguments[0].setAttribute('value','Tiger')", password);

		js.executeScript("arguments[0].click()", login);

		driver.quit();
	}

}
