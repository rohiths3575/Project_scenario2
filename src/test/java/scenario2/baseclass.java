package scenario2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.pages.adminPageFactory;
import com.pages.loginPageFactory;

public class baseclass {
	WebDriver driver;//=new ChromeDriver();
//	driver=
	
	adminPageFactory ad=new adminPageFactory();
	loginPageFactory lp;
	@BeforeTest
	public void setupbrowser() {
		
			driver =new ChromeDriver();
			
			lp=new loginPageFactory(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
}
