package scenario2;

import java.time.Duration;

import org.apache.poi.sl.usermodel.PlaceableShape;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.pages.adminPageFactory;
import com.pages.loginPageFactory;

public class Admin {

	WebDriver driver;//=new ChromeDriver();
//	driver=
	
	adminPageFactory ad=new adminPageFactory();
	
	
	@BeforeMethod
	@Parameters("browser")
	public void Beforemethod(String nameofthebrowser) {
		if(nameofthebrowser.equals("chrome"))
		driver =new ChromeDriver();
		if(nameofthebrowser.equals("firefox"))
			driver =new FirefoxDriver();
		loginPageFactory lp=new loginPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.login();
//		ad.Oncounting(driver);
	}
//	@BeforeMethod
//	public void Beforemethod() {
//	
//			driver =new ChromeDriver();
//		loginPageFactory lp=new loginPageFactory(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		lp.login();
////		ad.Oncounting(driver);
//	}
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
