package DemoProgram;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.facebook.com/");

		// driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");

		WebElement createbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));

		createbtn.click();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		// WebDriver Wait
		WebDriverWait ww = new WebDriverWait(driver, 4);
		ww.until(ExpectedConditions.elementToBeClickable(createbtn));

		// Fluent Wait
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver);
		f.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(5)).ignoring(Exception.class);

		WebElement femaleradio = driver.findElement(By.xpath("//label[text()='Female']"));

		femaleradio.click();

	}

}
