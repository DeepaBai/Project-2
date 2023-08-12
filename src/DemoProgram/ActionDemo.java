package DemoProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);
		//
		// WebElement emailbox = driver.findElement(By.id("email"));
		//
		// emailbox.sendKeys("deepa");
		//
		// Actions mte = ac.moveToElement(emailbox);
		//
		// mte.doubleClick().perform();
		//
		// mte.contextClick().perform();

		WebElement drag = driver.findElement(By.xpath("//a[text()=' BANK ']"));

		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		ac.dragAndDrop(drag, drop).perform();

	}

}
