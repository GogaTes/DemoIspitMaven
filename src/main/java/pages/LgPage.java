package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LgPage {
	
	private WebDriver driver;

	//private By LgButton = By.className("btn_action");
	private By LgButton = By.id("login-button");
	
	private By Password = By.id("password");
	
	private By Username = By.id("user-name");
	
	
	public LgPage(WebDriver driver) {
		
		this.driver = driver;
	}


    public void clickLgButton() {
		
		driver.findElement(LgButton).click();
		
	}




	public void fillInPassword(String pass) {
		
		driver.findElement(Password).sendKeys(pass);
		
		
	}


	public void fillInUsername(String name) {
		
		driver.findElement(Username).sendKeys(name);
		
	}
}
