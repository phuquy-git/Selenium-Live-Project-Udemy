package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPayment {

	public WebDriver driver;

	By payByCheck = By.cssSelector("[data-module-name='ps_checkpayment']");
	By payByWire = By.cssSelector("[data-module-name='ps_wirepayment']");
	By termsAndConditions = By.cssSelector("#checkout-payment-step [method] .ps-shown-by-js");
	By orderBtn = By.cssSelector(".btn-primary.center-block");
	
	public OrderFormPayment(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPayByCheck() {
		return driver.findElement(payByCheck);
	}

	public WebElement getPayByWire() {
		return driver.findElement(payByWire);
	}

	public WebElement getTermsAndConditions() {
		return driver.findElement(termsAndConditions);
	}

	public WebElement getOrderBtn() {
		return driver.findElement(orderBtn);
	}
	
	
}
