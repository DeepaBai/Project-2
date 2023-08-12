package DemoProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("deepabai");

		driver.navigate().refresh();

		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().back();

		driver.navigate().forward();

	}

}
