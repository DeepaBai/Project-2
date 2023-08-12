package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();

		Thread.sleep(3000);

		Alert a = driver.switchTo().alert();

		a.dismiss();

	}

}
