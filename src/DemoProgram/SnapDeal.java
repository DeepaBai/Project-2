package DemoProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Thread.sleep(5000);

		List<WebElement> allele = driver.findElements(By.xpath("//div[@id='nav-xshop']//child::a[@class='nav-a  ']"));

		System.out.println(allele.size());

		for (int i = 0; i < allele.size(); i++) {

			WebElement eachele = allele.get(i);

			System.out.println(eachele.getText());

		}

	}

}

// // 509m height Structure
// WebElement strucure = driver
// .findElement(By.xpath("//table[@class='tsc_table_s13']//td//span[contains(text(),'509')]"
// + "//parent::td//preceding-sibling::th"));
//
// System.out.println(strucure.getText());

// city of china
// WebElement city = driver.findElement(
// By.xpath("//table[@class='tsc_table_s13']//td//span[contains(text(),'China')]//parent::td//"
// + "following-sibling::td[1]"));
//
// System.out.println(city.getText());

// Burj Khalifa Height
// WebElement height = driver
// .findElement(By.xpath("//table[@class='tsc_table_s13']//tr//th//span[contains(text(),'Burj')]"
// + "//parent::th//following-sibling::td[3]//span"));
//
// System.out.println(height.getText());

// // 2nd Rank country name
// WebElement rank = driver.findElement(By.xpath(
// "//table[@class='tsc_table_s13']//tr//td//span[text()='2']//parent::td//preceding-sibling::td[4]"));
//
// System.out.println(rank.getText());
