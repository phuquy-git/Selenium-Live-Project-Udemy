package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage{

	public WebDriver driver;
	
	By sizeOption = By.cssSelector("[data-product-attribute='1']");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By quantityDecrease = By.cssSelector(".touchspin-down");
	By addToCartBtn = By.cssSelector("[data-button-action]");
	By homePage = By.cssSelector("ol > li:nth-of-type(1) > a > span");
	
	public ShopProductPage() throws IOException {
		super();
	}

	public WebElement getSizeOption() throws IOException {
		this.driver = getDriver();
		return driver.findElement(sizeOption);
	}

	public WebElement getQuantityIncrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityIncrease);
	}

	public WebElement getQuantityDecrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityDecrease);
	}

	public WebElement getAddToCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addToCartBtn);
	}

	public WebElement getHomePage() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homePage);
	}
	
	
}
