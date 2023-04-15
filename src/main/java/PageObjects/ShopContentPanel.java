package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel {

	public WebDriver driver;
	
	By continueShoppingBtn = By.cssSelector(".btn.btn-secondary");
	By proceedToCheckoutBtn = By.cssSelector(".cart-content-btn .btn-primary");
	
	public ShopContentPanel(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getContinueShoppingBtn() {
		return driver.findElement(continueShoppingBtn);
	}

	public WebElement getProceedToCheckoutBtn() {
		return driver.findElement(proceedToCheckoutBtn);
	}
	
	
} 
