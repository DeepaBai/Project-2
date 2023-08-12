package DemoProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(5000);

		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
			System.out.println("pop up not displayed");

		}

		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));

		searchbox.sendKeys("Sanitizer");

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		List<WebElement> allelement = driver.findElements(
				By.xpath("//*[@class=\"_32g5_j\"]//parent::div[@class=\"_4ddWXP\"]//a[@class=\"s1Q9rs\"]"));

		System.out.println(allelement.size());
		for (int i = 0; i < allelement.size(); i++) {

			WebElement eachelement = allelement.get(i);

			System.out.println(eachelement.getText());

		}
	}
}
