package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {

	WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	WebElement un;
	@FindBy(xpath = "//input[@name='password']")
	WebElement pw;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement sub;
	public loginPageFactory(WebDriver d) {
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void login( ) {
		un.sendKeys("Admin");
		pw.sendKeys("admin123");
		sub.click();
	}
}
