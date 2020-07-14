package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabsPage {

	private WebDriver driver;
	
	private By AddButton = By.cssSelector("#inventory_container > div > div:nth-child(2) > div.pricebar > button");
	
	private By LabsOnesie = By.cssSelector("#inventory_container > div > div:nth-child(5) > div.pricebar > button");
	
	private By Cart = By.cssSelector("#shopping_cart_container > a > svg");
	
	
	public SwagLabsPage(WebDriver driver) {
		
		this.driver = driver;
		
		
	}

	public void clickAddButton() {
		
		driver.findElement(AddButton).click();
		
	}

	public void clickLabsOnesie() {
		
		driver.findElement(LabsOnesie).click();
		
		
	}

	public void clickCart() {
		
		driver.findElement(Cart).click();
		
	}

	
}
