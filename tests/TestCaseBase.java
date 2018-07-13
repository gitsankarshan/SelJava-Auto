package com.testersconnect.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCaseBase {

	String HS_URL = "https://app.hubspot.com/";
	public static WebDriver driver;

	@BeforeTest
	public void init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanky\\eclipse-workspace\\HS_POM\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.navigate().to(HS_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);// TimeUnit is a class

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	@AfterTest
	public void cleanup() {
		// driver.quit();
	}
}
