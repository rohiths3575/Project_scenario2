package scenario2;

import java.time.Duration;

import org.apache.poi.sl.usermodel.PlaceableShape;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.pages.adminPageFactory;
import com.pages.loginPageFactory;

public class test extends baseclass {

	WebDriver driver;
	
	
	@BeforeClass
//	@Parameters("browser")
	public void Beforemethod(String nameofthebrowser) {
		
		lp.login();
//		ad.Oncounting(driver);
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
//	(priority = 1)
	@Test
	public void Counting() {

		ad.Oncounting(driver);
	} 
	
	@Test//(priority = 2)
	public void  searchByUserName() {
		Counting();
		ad.Textfield(driver);
		driver.navigate().refresh();  
	}
	
	@Test//(priority = 3)
	public void searchByUserRole() {
		Counting();
		ad.Byrole(driver);
		driver.navigate().refresh();
	}
	
	@Test//(priority = 4 )
	public void  searchByUserStatus() {
		Counting();
		ad.ByStatusEnabled(driver);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ad.ByStatusDisabled(driver);
	}
	
	
	
}



//package scenario2;
//
//import java.time.Duration;
//
//import org.apache.poi.sl.usermodel.PlaceableShape;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.pages.adminPageFactory;
//import com.pages.loginPageFactory;
//
//public class test {
//
//	WebDriver driver;//=new ChromeDriver();
////	driver=
//	
//	adminPageFactory ad=new adminPageFactory();
//	
//	
//	@Test
//	public void login() {
//		System.out.println("Before method");
//	}
//	@Test
//	public void aftermethod() 
//	{
//	System.out.println("After method");
//	}
//
//	@Test	(priority = 0)
//	public void Counting() {
//		login();
//		System.out.println("by1");
//		aftermethod();
//	} 
//	
//	@Test(priority = 1)
//	public void  searchByUserName() {
//		
//		System.out.println("by2"); 
//	}
//	
//	@Test(priority = 2)
//	public void searchByUserRole() {
//		System.out.println("by3");
//	}
//	
//	@Test(priority = 3)
//	public void  searchByUserStatus() {
//		System.out.println("by4");
//	}
//	
//	
//	
//}
