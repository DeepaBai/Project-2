package DemoProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		WebElement a1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));

		a1.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		WebElement a2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));

		a2.click();

		WebElement a3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

		a3.click();

		Alert alert2 = driver.switchTo().alert();

		alert2.dismiss();

		WebElement a4 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));

		a4.click();

		WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));

		prompt.click();

		Alert alert3 = driver.switchTo().alert();

		alert3.accept();

	}
}
