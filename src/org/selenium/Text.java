package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Text {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/webhp");

		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf']"));

		search.sendKeys("Vel Murugan");

		Actions a = new Actions(driver);

		a.moveToElement(search).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_SHIFT);

		String s = "Vel Murugan";

		for (int i = 0; i < s.length(); i++) {

			r.keyPress(KeyEvent.VK_LEFT);

		}
		// a.doubleClick().perform();

	}
}
