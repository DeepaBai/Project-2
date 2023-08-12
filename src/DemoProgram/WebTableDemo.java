package DemoProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));

		String t = table.getText();

		// System.out.println(t);

		List<WebElement> allrows = table.findElements(By.tagName("tr"));

		for (WebElement eachrow : allrows) {

			List<WebElement> alldata = eachrow.findElements(By.tagName("td"));

			for (int i = 0; i < alldata.size(); i++) {

				WebElement eachdata = alldata.get(i);

				String t2 = eachdata.getText();

				if (t2.equals("Roland Mendel")) {

					System.out.println(t2);

				}

			}

		}

	}
}