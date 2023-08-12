package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestProgram {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		searchbox.sendKeys("high heels for women");

		WebElement click = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		click.click();

		WebElement slipperlink = driver.findElement(By.xpath("//span[contains(text(),'TOP Moda Hannah-1 Fashion')]"));

		slipperlink.click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", dropdown);

		Select s = new Select(dropdown);

		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			if (options.get(i).getText().equals("6.5")) {

				// js.executeScript("arguments[0].click()", dropdown);
				options.get(i).click();
			}
		}

		WebElement uncheck = driver.findElement(By.xpath("//input[@id='fbtCheck-2']"));

		uncheck.click();

		WebElement addtocart = driver.findElement(By.xpath("//input[@name='submit.addToCart']"));

		addtocart.click();
	}
}