package cart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LgPage;
import pages.SwagLabsPage;

public class PickCartsTest {
	
private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//executable//chromedriver.exe");
	    
		ChromeOptions option= new ChromeOptions();
		//option.addArguments("incognito");
	   
		driver= new ChromeDriver(option);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	    driver.manage().window().maximize();
	   
	    driver.get("https://www.saucedemo.com/");
	   	
	}
		
	
	@Test 
	public void logInNormal () {

	   	LgPage login= new LgPage(driver);
	    
		 login.fillInUsername("standard_user");
		 login.fillInPassword("secret_sauce");
		 
		 login.clickLgButton(); 

		 SwagLabsPage cart = new SwagLabsPage(driver);
		 
		 
       cart.clickAddButton();
       
       cart.clickLabsOnesie();
       
       cart.clickCart();
       
       String textLabsBike = driver.findElement(By.cssSelector("#item_0_title_link > div")).getText();
       System.out.println("Display: 1. item name is: "  + textLabsBike);
       
       String textBikePrice = driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.item_pricebar > div")).getText();
       System.out.println("Display: 1. item price is: "  + textBikePrice);
       
       String textBikeQuantity = driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_quantity")).getText();
       System.out.println("Display: 1. item quantity is: "  + textBikeQuantity);
       
       
       
       String textLabsOnesie = driver.findElement(By.cssSelector("#item_2_title_link > div")).getText();
       System.out.println("Display: 2. item name is: "  + textLabsOnesie);
       
       String textOnesiePrice = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div")).getText();
       System.out.println("Display: 2. item price is: "  + textOnesiePrice);
       
       String textOnesieQuantity = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[1]")).getText();
       System.out.println("Display: 2. item quantity is: "  + textOnesieQuantity);
	
		 }	
	
	

}
