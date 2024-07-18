package com.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	
	@Test
	public void k() throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
//		list <webelement> list=new	driver.findElements(By.xpath("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
			List<WebElement> list= driver.findElements(By.xpath("(//ul[contains(@class,'oxd-main-menu')])//li"));
			for (WebElement i : list) {
				if(i.getText().equals("Admin")) {
					i.click();
				break;}
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Admin");
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			String TotalRecords=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]")).getText();
//		
//			System.out.println(TotalRecords);
//			driver.navigate().refresh();
//			(//div[contains(@class,'oxd-select-text')][2])[2]
				driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')][2])[2]")).click();
//			
				List<WebElement> list2= driver.findElements(By.xpath("//div[@role='listbox']//div"));
				for (WebElement i : list2) {
					System.out.println(i.getText());
					if(i.getText().contains("Disabled")||i.getText().contains("Actif")) {
						i.click(); 
					break;
					}
				}
	}
}
