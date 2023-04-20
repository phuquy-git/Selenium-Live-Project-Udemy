package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShoppingCart extends BasePage{

	public WebDriver driver;
	
	By havePromo = By.cssSelector(".promo-code-button .collapse-button");
	By promoTextbox = By.cssSelector("input[name='discount_name']");
	By promoAddBtn = By.cssSelector("[action='http\\:\\/\\/teststore\\.automationtesting\\.co\\.uk\\/cart'] span");
	By proceedToCheckoutBtn = By.cssSelector(".cart-detailed-actions .btn-primary");
	By deleteOne = By.cssSelector(".material-icons.float-xs-left");
	By deleteTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By totalValue = By.cssSelector(".cart-total .value");
	
	public ShoppingCart() throws IOException {
		super();
	}

	public WebElement getHavePromo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(havePromo);
	}

	public WebElement getPromoTextbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(promoTextbox);
	}

	public WebElement getPromoAddBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(promoAddBtn);
	}

	public WebElement getProceedToCheckoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(proceedToCheckoutBtn);
	}

	public WebElement getDeleteOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deleteOne);
	}

	public WebElement getDeleteTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deleteTwo);
	}

	public WebElement getTotalValue() throws IOException {
		this.driver = getDriver();
		return driver.findElement(totalValue);
	}
	
	
}
