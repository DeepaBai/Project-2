package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://toolsqa.com/");

		WebElement down = driver.findElement(By.xpath("//div[@class='col-12 static-pages-link text-center']"));

		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].scrollIntoView()", down);

		WebElement up = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));

		Thread.sleep(3000);

		j.executeScript("arguments[0].scrollIntoView()", up);
	}

}
