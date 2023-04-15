package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopHomepage {

	public WebDriver driver;
	
	By productOne = By.linkText("Hummingbird Printed T-Shirt");
	By productTwo = By.linkText("Hummingbird Printed Sweater");
	By productThree = By.linkText("The Best Is Yet To Come'...");
	By productFour = By.linkText("The Adventure Begins Framed...");
	By productFive = By.linkText("Today Is A Good Day Framed...");
	By productSix = By.linkText("Mug The Best Is Yet To Come");
	By productSeven = By.linkText("Mug The Adventure Begins");
	By productEight = By.linkText("Mug Today Is A Good Day");
	
	public ShopHomepage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProductOne() {
		return driver.findElement(productOne);
	}

	public WebElement getProductTwo() {
		return driver.findElement(productTwo);
	}

	public WebElement getProductThree() {
		return driver.findElement(productThree);
	}

	public WebElement getProductFour() {
		return driver.findElement(productFour);
	}

	public WebElement getProductFive() {
		return driver.findElement(productFour);
	}

	public WebElement getProductSix() {
		return driver.findElement(productSix);
	}

	public WebElement getProductSeven() {
		return driver.findElement(productSeven);
	}

	public WebElement getProductEight() {
		return driver.findElement(productEight);
	}
	
	
}
