package DemoProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);

		Robot rb = new Robot();

		WebElement emailbox = driver.findElement(By.xpath("//input[@id='email']"));

		emailbox.sendKeys("ideepabai200");

		WebElement passbox = driver.findElement(By.id("pass"));

		Actions mte = ac.moveToElement(emailbox);

		Actions dc = mte.doubleClick();

		Thread.sleep(3000);

		dc.contextClick().perform();

		for (int i = 0; i < 3; i++) {

			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
		}

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		ac.moveToElement(passbox).perform();
		ac.contextClick().perform();

		for (int i = 0; i < 4; i++) {

			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
		}
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}