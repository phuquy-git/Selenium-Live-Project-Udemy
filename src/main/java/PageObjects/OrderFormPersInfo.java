package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPersInfo extends BasePage{

	public WebDriver driver;
	
	By mrTitle = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
	By mrsTitle = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
	By firstName = By.cssSelector("[name='firstname']");
	By lastName = By.cssSelector("[name='lastname']");
	By email = By.cssSelector("form#customer-form > section input[name='email']");
	By password = By.cssSelector("form#customer-form > section input[name='password']");
	By birthday = By.cssSelector("[name='birthday']");
	By receiveOffer = By.cssSelector("[name='optin']");
	By signUp = By.cssSelector("[name='newsletter']");
	By agreeTerm = By.cssSelector("[name='psgdpr']");
	By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");
	
	public OrderFormPersInfo() throws IOException {
		super();
	}

	public WebElement getMrTitle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(mrTitle);
	}

	public WebElement getMrsTitle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(mrsTitle);
	}

	public WebElement getFirstName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(firstName);
	}

	public WebElement getLastName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(lastName);
	}

	public WebElement getEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(email);
	}

	public WebElement getPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(password);
	}

	public WebElement getBirthday() throws IOException {
		this.driver = getDriver();
		return driver.findElement(birthday);
	}

	public WebElement getReceiveOffer() throws IOException {
		this.driver = getDriver();
		return driver.findElement(receiveOffer);
	}

	public WebElement getSignUp() throws IOException {
		this.driver = getDriver();
		return driver.findElement(signUp);
	}

	public WebElement getAgreeTerm() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agreeTerm);
	}

	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	
	
}
