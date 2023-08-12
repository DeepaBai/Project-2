package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		WebElement alertbox = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));

		alertbox.click();

		WebElement alertok = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));

		alertok.click();

		Alert a = driver.switchTo().alert();

		a.accept();

	}

}
