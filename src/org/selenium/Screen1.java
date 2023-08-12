package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen1 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium properties\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File s = ts.getScreenshotAs(OutputType.FILE);

		File f = new File("C:\\Users\\HP\\Documents\\Selenium properties\\greens.jpg");

		FileUtils.copyFile(s, f);
	}
}
