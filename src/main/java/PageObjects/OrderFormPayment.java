package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPayment extends BasePage{

	public WebDriver driver;

	By payByCheck = By.cssSelector("[data-module-name='ps_checkpayment']");
	By payByWire = By.cssSelector("[data-module-name='ps_wirepayment']");
	By termsAndConditions = By.cssSelector("#checkout-payment-step [method] .ps-shown-by-js");
	By orderBtn = By.cssSelector(".btn-primary.center-block");
	
	public OrderFormPayment() throws IOException {
		super();
	}

	public WebElement getPayByCheck() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payByCheck);
	}

	public WebElement getPayByWire() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payByWire);
	}

	public WebElement getTermsAndConditions() throws IOException {
		this.driver = getDriver();
		return driver.findElement(termsAndConditions);
	}

	public WebElement getOrderBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(orderBtn);
	}
	
	
}
