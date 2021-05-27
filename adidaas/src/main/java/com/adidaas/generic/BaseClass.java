package com.adidaas.generic;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
		
	}
	public static WebDriver driver;
	@BeforeTest
	public void enterBrowser() throws IOException {
		Reporter.log("enterBrowser",true);
		FileLib f = new FileLib();
		String url = f.getProperty("url");
		Scanner sc = new Scanner(System.in);
		String browser = sc.nextLine();
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	
	@AfterTest
	public void Logout() {
		Reporter.log("Logout",true);
	}
	
	
}
