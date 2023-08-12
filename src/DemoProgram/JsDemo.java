package DemoProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement emailbox = driver.findElement(By.id("email"));
		WebElement passbox = driver.findElement(By.id("pass"));
		WebElement loginbox = driver.findElement(By.xpath("//button[text()='Log in']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('value','ideepabai')", emailbox);
		jse.executeScript("arguments[0].setAttribute('value','Deep@24')", passbox);
		jse.executeScript("arguments[0].click()", loginbox);
		Object e = jse.executeScript("return arguments[0].getAttribute('value')", emailbox);
		System.out.println(e);
		WebElement siv = driver.findElement(By.xpath("//a[text()='Contact uploading and non-users']"));
		jse.executeScript("arguments[0].scrollIntoView()", siv);

	}
}
