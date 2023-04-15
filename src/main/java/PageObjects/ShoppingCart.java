package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

	public WebDriver driver;
	
	By havePromo = By.cssSelector(".promo-code-button .collapse-button");
	By promoTextbox = By.cssSelector("input[name='discount_name']");
	By promoAddBtn = By.cssSelector("[action='http\\:\\/\\/teststore\\.automationtesting\\.co\\.uk\\/cart'] span");
	By proceedToCheckoutBtn = By.cssSelector(".cart-detailed-actions .btn-primary");
	By deleteOne = By.cssSelector(".material-icons.float-xs-left");
	By deleteTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By totalValue = By.cssSelector(".cart-total .value");
	
	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getHavePromo() {
		return driver.findElement(havePromo);
	}

	public WebElement getPromoTextbox() {
		return driver.findElement(promoTextbox);
	}

	public WebElement getPromoAddBtn() {
		return driver.findElement(promoAddBtn);
	}

	public WebElement getProceedToCheckoutBtn() {
		return driver.findElement(proceedToCheckoutBtn);
	}

	public WebElement getDeleteOne() {
		return driver.findElement(deleteOne);
	}

	public WebElement getDeleteTwo() {
		return driver.findElement(deleteTwo);
	}

	public WebElement getTotalValue() {
		return driver.findElement(totalValue);
	}
	
	
}
