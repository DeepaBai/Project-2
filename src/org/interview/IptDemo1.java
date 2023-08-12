package org.interview;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IptDemo1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Thread.sleep(5000);

		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		searchbar.sendKeys("Sanitizer");

		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		searchbtn.click();

		driver.findElement(By.xpath("(//span[contains(text(),'Hand Sanitizer Pump, 200ml')])[1]")).click();

		Set<String> allwindowid = driver.getWindowHandles();

		List<String> eachwindow = new LinkedList<>();

		eachwindow.addAll(allwindowid);

		String s = eachwindow.get(1);

		driver.switchTo().window(s);

		Thread.sleep(5000);

		WebElement cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));

		cart.click();

		WebElement buybtn = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));

		buybtn.click();

		WebElement createbtn = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));

		createbtn.click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='countryCode']"));

		Select s2 = new Select(dropdown);

		List<WebElement> alloptions = s2.getOptions();

		for (WebElement eachoption : alloptions) {
			String s3 = eachoption.getText();
			if (s3.equals("MY +60")) {
				eachoption.click();

			}

		}
	}

}
