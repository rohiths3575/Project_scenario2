package com.pages;

import java.time.Duration;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminPageFactory {
 
	WebDriver driver;
//	@FindBy(xpath = "(//ul[contains(@class,'oxd-main-menu')])//li")
//	By data1;
	private By data1=By.xpath("(//ul[contains(@class,'oxd-main-menu')])//li");
	private By subbutton= By.xpath ("//button[@type='submit']");
	private By records= By.xpath ("(//span[@class='oxd-text oxd-text--span'])[1]");
	private By usernametext= By.xpath ("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By userRole= By.xpath ("(//div[@class='oxd-select-text-input'])[1]");
	private By userStatus=By.xpath("(//div[contains(@class,'oxd-select-text')][2])[2]");
	private By data2= By.xpath("(//div[@role='listbox'])[1]//div");
	private By data3=By.xpath("//div[@role='listbox']//div");
//	@FindBy(xpath = "(//div[@role='listbox'])[2]")
//	WebElement userStatus;
	
	
	
	public void Oncounting(WebDriver driver) {
		List<WebElement> list= driver.findElements(data1);
		System.out.println(list.size());
		for (WebElement i : list) {
			if(i.getText().equals("Admin")) {
				i.click();
			break;
			}
		}
	}
		public void  Textfield(WebDriver driver) { 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(usernametext).sendKeys("Admin");
		driver.findElement(subbutton).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String TotalRecords=driver.findElement(records).getText();
	
		System.out.println("Records found with username Admin="+TotalRecords);
		}
		
		public void Byrole(WebDriver driver) {
			driver.findElement(userRole).click();
				List<WebElement> list2= driver.findElements(data2);
				for (WebElement i : list2) {
					if(i.getText().equals("Admin")) {
						i.click();
					break;
					}
				}
				driver.findElement(subbutton).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String TotalRecords=driver.findElement(records).getText();
				System.out.println("Records found with Role Admin="+TotalRecords);
		}
		
		public void ByStatusEnabled(WebDriver driver) {
			driver.findElement(userStatus).click();
			List<WebElement> list= driver.findElements(data3);
			for (WebElement i : list) {
				if(i.getText().equals("Enabled")) {
					i.click();
				break;
				}
			}
			driver.findElement(subbutton).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String TotalRecords=driver.findElement(records).getText();
			System.out.println("Records found with Enabled status="+TotalRecords);
	}
		public void ByStatusDisabled(WebDriver driver) {
			driver.findElement(userStatus).click();
			List<WebElement> list= driver.findElements(data3);
			for (WebElement i : list) {
				if(i.getText().equals("Disabled")) {
					i.click();
				break;
				}
			}
			driver.findElement(subbutton).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String TotalRecords=driver.findElement(records).getText();
			System.out.println("Records found with Disabled status="+TotalRecords);
		}
			
		}
	
