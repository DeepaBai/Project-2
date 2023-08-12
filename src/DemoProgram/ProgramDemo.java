package DemoProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		WebElement emailbox = driver.findElement(By.xpath("//input[@id='email']"));

		emailbox.sendKeys("ideepabai200");

		WebElement passbox = driver.findElement(By.xpath("//input[@id='pass']"));

		passbox.sendKeys("Deepa@24");

		/*
		 * WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		 * 
		 * btn.click();
		 */

		WebElement createbn = driver.findElement(By.xpath("//a[text()='Create new account']"));

		createbn.click();

		Thread.sleep(4000);

		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));

		radio.click();

		driver.close();

	}
}
