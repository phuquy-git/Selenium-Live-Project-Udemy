package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormDelivery extends BasePage{

public WebDriver driver;
	
	By firstName = By.cssSelector(".form-fields input[name='firstname']");
	By lastName = By.cssSelector(".form-fields [name='lastname']");
	By company = By.cssSelector("[name='company']");
	By address = By.cssSelector("[name='address1']");
	By addressComplement = By.cssSelector("[name='address2']");
	By city = By.cssSelector("[name='city']");
	By state = By.cssSelector("[name='id_state']");
	By zip = By.cssSelector("[name='postcode']");
	By country = By.cssSelector("[name='id_country']");
	By phone = By.cssSelector("[name='phone']");
	By use = By.cssSelector("input#use_same_address");
	By continueBtn = By.cssSelector("[name='confirm-addresses']");
	
	public OrderFormDelivery() throws IOException {
		super();
	}

	public WebElement getFirstName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(firstName);
	}

	public WebElement getLastName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(lastName);
	}

	public WebElement getCompany() throws IOException {
		this.driver = getDriver();
		return driver.findElement(company);
	}

	public WebElement getAddress() throws IOException {
		this.driver = getDriver();
		return driver.findElement(address);
	}

	public WebElement getAddressComplement() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addressComplement);
	}

	public WebElement getCity() throws IOException {
		this.driver = getDriver();
		return driver.findElement(city);
	}

	public WebElement getState() throws IOException {
		this.driver = getDriver();
		return driver.findElement(state);
	}

	public WebElement getZip() throws IOException {
		this.driver = getDriver();
		return driver.findElement(zip);
	}

	public WebElement getCountry() throws IOException {
		this.driver = getDriver();
		return driver.findElement(country);
	}

	public WebElement getPhone() throws IOException {
		this.driver = getDriver();
		return driver.findElement(phone);
	}

	public WebElement getUse() throws IOException {
		this.driver = getDriver();
		return driver.findElement(use);
	}

	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	
	
}
