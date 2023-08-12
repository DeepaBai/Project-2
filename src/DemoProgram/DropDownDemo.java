package DemoProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement createbtn = driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]"));

		createbtn.click();

		Thread.sleep(3000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		month.click();

		Select s = new Select(month);

		/*
		 * s.selectByVisibleText("Apr");// apr s.selectByValue("9");// sep
		 * s.selectByIndex(9);// oct
		 */
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			WebElement we = op.get(i);
			String t = we.getText();
			if (t.equals("May")) {
				we.click();
			}
		}

		if (s.isMultiple()) {
			System.out.println("Multiple");
		} else {
			System.out.println("Single");
		}
	}

}
