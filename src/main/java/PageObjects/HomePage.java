package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class HomePage extends BasePage{

	public WebDriver driver;
	
	By toggle = By.cssSelector(".toggle");
	By homepageLink =  By.linkText("HOMEPAGE");
	By accodionLink =  By.linkText("ACCORDION");
	By browserTabLink =  By.linkText("BROWSER TABS");
	By buttonsLink =  By.linkText("BUTTONS");
	By calculatorJsLink =  By.linkText("CALCULATOR (JS)");
	By contactUsLink =  By.linkText("CONTACT US FORM TEST");
	By datePickerLink =  By.linkText("DATE PICKER");
	By dropDownLink =  By.linkText("DROPDOWN CHECKBOX RADIO");
	By fileUploadLink =  By.linkText("FILE UPLOAD");
	By hiddenElementsLink =  By.linkText("HIDDEN ELEMENTS");
	By iframesLink =  By.linkText("IFRAMES");
	By loaderLink =  By.linkText("LOADER");
	By loaderTwoLink =  By.linkText("LOADER TWO");
	By loginPortalLink =  By.linkText("LOGIN PORTAL TEST");
	By mouseMovementLink =  By.linkText("MOUSE MOVEMENT");
	By popUpsLink =  By.linkText("POP UPS & ALERTS");
	By searchLink =  By.linkText("PREDICTIVE SEARCH");
	By tablesLink =  By.linkText("TABLES");
	By testStoreLink =  By.linkText("TEST STORE");
	By aboutMeLink =  By.linkText("ABOUT ME");
	By cookie = By.cssSelector(".close-cookie-warning > span");
	
	public HomePage() throws IOException {
		super();
	}

	public WebElement getToggle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(toggle);
	}

	public WebElement getHomepageLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homepageLink);
	}

	public WebElement getAccodionLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(accodionLink);
	}

	public WebElement getBrowserTabLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(browserTabLink);
	}

	public WebElement getButtonsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(buttonsLink);
	}

	public WebElement getCalculatorJsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(calculatorJsLink);
	}

	public WebElement getContactUsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(contactUsLink);
	}

	public WebElement getDatePickerLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(datePickerLink);
	}

	public WebElement getDropDownLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(dropDownLink);
	}

	public WebElement getFileUploadLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(fileUploadLink);
	}

	public WebElement getHiddenElementsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(hiddenElementsLink);
	}

	public WebElement getIframesLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(iframesLink);
	}

	public WebElement getLoaderLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loaderLink);
	}

	public WebElement getLoaderTwoLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loaderTwoLink);
	}

	public WebElement getLoginPortalLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginPortalLink);
	}

	public WebElement getMouseMovementLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(mouseMovementLink);
	}

	public WebElement getPopUpsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(popUpsLink);
	}

	public WebElement getSearchLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(popUpsLink);
	}

	public WebElement getTablesLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(tablesLink);
	}

	public WebElement getTestStoreLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(testStoreLink);
	}

	public WebElement getAboutMeLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(aboutMeLink);
	}
	
	public WebElement getCookie() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cookie);
	}
}
