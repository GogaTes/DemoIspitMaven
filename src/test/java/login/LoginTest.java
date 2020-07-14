package login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LgPage;


public class LoginTest {
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//executable//chromedriver.exe");
	    
		ChromeOptions option= new ChromeOptions();
	//	option.addArguments("incognito");
	   
		driver= new ChromeDriver(option);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	    driver.manage().window().maximize();
	   
	    driver.get("https://www.saucedemo.com/");
	   	
	}
		
		
	
	@Test(priority = 1)
	public void loginWithout () {
		
		LgPage login= new LgPage(driver);
		   
	    login.clickLgButton();
		
	    driver.navigate().refresh();
	}
	
	@Test(priority = 2)
	public void leaveUserNameEmpty () throws Exception {
		
		LgPage login= new LgPage(driver);
	    
	    login.fillInPassword("secret_sauce");
	  //  Thread.sleep(5000);
	    
	    login.clickLgButton();  
	    
	    driver.navigate().refresh();
   
	}
	
	
	@Test(priority = 3)
	public void leavePasswordEmpty () {
		
		LgPage login= new LgPage(driver);
	    
		login.fillInUsername("standard_user");
	    
	    login.clickLgButton();
	}	
	

}
