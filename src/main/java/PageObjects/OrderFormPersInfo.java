package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPersInfo {

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
	
	public OrderFormPersInfo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getMrTitle() {
		return driver.findElement(mrTitle);
	}

	public WebElement getMrsTitle() {
		return driver.findElement(mrsTitle);
	}

	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getBirthday() {
		return driver.findElement(birthday);
	}

	public WebElement getReceiveOffer() {
		return driver.findElement(receiveOffer);
	}

	public WebElement getSignUp() {
		return driver.findElement(signUp);
	}

	public WebElement getAgreeTerm() {
		return driver.findElement(agreeTerm);
	}

	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
	
	
}
