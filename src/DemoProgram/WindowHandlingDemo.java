package DemoProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement searchbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

		searchbox.sendKeys("Womens Tshirt");

		WebElement searchbtn = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));

		searchbtn.click();

		WebElement tshirt = driver.findElement(By.xpath("(//span[text()='Women T-Shirt'])[1]"));

		tshirt.click();
		Set<String> allwindow = driver.getWindowHandles();

		/*
		 * int windowcount = 1; for (String eachwindow : allwindow) { if (windowcount ==
		 * 2) { driver.switchTo().window(eachwindow); } windowcount++; }
		 */

		Iterator<String> it = allwindow.iterator();
		while (it.hasNext()) {
			String parent = it.next();
			String child = it.next();
			driver.switchTo().window(child);
		}

		// next window
		Thread.sleep(4000);

		WebElement addtocart = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));

		addtocart.click();

	}

}
