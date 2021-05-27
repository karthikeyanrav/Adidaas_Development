package com.adidaas.testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginModule {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, Exception, IOException {
		FileInputStream fis2 = new FileInputStream("./src/test/resources/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://adidaas-useradm-dev.azurewebsites.net/LogIn/LogUser");


		int RowNum = wb.getSheet("InvalidLogin").getLastRowNum();
		int CellNum = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
		for (int i = 1; i <= RowNum; i++) {
			String UN = wb.getSheet("InvalidLogin").getRow(i).getCell(0).toString();
			for (int j = 2; j <= CellNum; j++) {
				String PWD = wb.getSheet("InvalidLogin").getRow(i).getCell(1).toString();


				driver.findElement(By.xpath("//input[@id='UserId']")).sendKeys(UN);
				driver.findElement(By.xpath("//input[@id='UserPassword']")).sendKeys(PWD);
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				System.out.println(UN + "   " + PWD);
				
			}

		}

	}
}