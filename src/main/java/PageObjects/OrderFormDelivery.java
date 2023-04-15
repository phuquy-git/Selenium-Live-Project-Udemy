package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormDelivery {

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
	
	public OrderFormDelivery(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getCompany() {
		return driver.findElement(company);
	}

	public WebElement getAddress() {
		return driver.findElement(address);
	}

	public WebElement getAddressComplement() {
		return driver.findElement(addressComplement);
	}

	public WebElement getCity() {
		return driver.findElement(city);
	}

	public WebElement getState() {
		return driver.findElement(state);
	}

	public WebElement getZip() {
		return driver.findElement(zip);
	}

	public WebElement getCountry() {
		return driver.findElement(country);
	}

	public WebElement getPhone() {
		return driver.findElement(phone);
	}

	public WebElement getUse() {
		return driver.findElement(use);
	}

	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
	
	
}
