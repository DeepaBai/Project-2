package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

		create.click();
		
		Thread.sleep(3000);
		
		WebElement monthdropdown = driver.findElement(By.xpath("//select[@id='month']"));
		
		monthdropdown.click();
		
		Select s = new Select (monthdropdown);
		
		s.selectByIndex(5);

		s.selectByValue("2");
		
		s.selectByVisibleText("Apr");
	
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);
		
		List<WebElement> monthoptions = s.getOptions();
		
		for(WebElement eachoption : monthoptions) {
			
			String s1 = eachoption.getText();
			
			System.out.println(s1);
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
	}
}
