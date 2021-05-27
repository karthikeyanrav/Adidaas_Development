package com.adidaas.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	@FindBy(xpath = "//input[@id='UserId']")
	private WebElement emailtextbox;
	public WebElement getemailtextbox() {
		return emailtextbox;
	}
	
	@FindBy(xpath = "//input[@id='UserPassword']")
	private WebElement passwordtextbox;
	public WebElement getpasswordtextbox() {
		return passwordtextbox;
	}
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginbutton;
	public WebElement getloginbutton() {
		return loginbutton;
	}
	
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
