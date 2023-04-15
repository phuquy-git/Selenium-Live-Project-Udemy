package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage {

	public WebDriver driver;
	
	By sizeOption = By.cssSelector("[data-product-attribute='1']");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By quantityDecrease = By.cssSelector(".touchspin-down");
	By addToCartBtn = By.cssSelector("[data-button-action]");
	By homePage = By.cssSelector("ol > li:nth-of-type(1) > a > span");
	
	public ShopProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSizeOption() {
		return driver.findElement(sizeOption);
	}

	public WebElement getQuantityIncrease() {
		return driver.findElement(quantityIncrease);
	}

	public WebElement getQuantityDecrease() {
		return driver.findElement(quantityDecrease);
	}

	public WebElement getAddToCartBtn() {
		return driver.findElement(addToCartBtn);
	}

	public WebElement getHomePage() {
		return driver.findElement(homePage);
	}
	
	
}
