package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));

		WebElement userid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));

		userid.sendKeys("12345");

		WebElement login = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));

		login.click();

	}
}