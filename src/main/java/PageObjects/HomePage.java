package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

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
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getToggle() {
		return driver.findElement(toggle);
	}

	public WebElement getHomepageLink() {
		return driver.findElement(homepageLink);
	}

	public WebElement getAccodionLink() {
		return driver.findElement(accodionLink);
	}

	public WebElement getBrowserTabLink() {
		return driver.findElement(browserTabLink);
	}

	public WebElement getButtonsLink() {
		return driver.findElement(buttonsLink);
	}

	public WebElement getCalculatorJsLink() {
		return driver.findElement(calculatorJsLink);
	}

	public WebElement getContactUsLink() {
		return driver.findElement(contactUsLink);
	}

	public WebElement getDatePickerLink() {
		return driver.findElement(datePickerLink);
	}

	public WebElement getDropDownLink() {
		return driver.findElement(dropDownLink);
	}

	public WebElement getFileUploadLink() {
		return driver.findElement(fileUploadLink);
	}

	public WebElement getHiddenElementsLink() {
		return driver.findElement(hiddenElementsLink);
	}

	public WebElement getIframesLink() {
		return driver.findElement(iframesLink);
	}

	public WebElement getLoaderLink() {
		return driver.findElement(loaderLink);
	}

	public WebElement getLoaderTwoLink() {
		return driver.findElement(loaderTwoLink);
	}

	public WebElement getLoginPortalLink() {
		return driver.findElement(loginPortalLink);
	}

	public WebElement getMouseMovementLink() {
		return driver.findElement(mouseMovementLink);
	}

	public WebElement getPopUpsLink() {
		return driver.findElement(popUpsLink);
	}

	public WebElement getSearchLink() {
		return driver.findElement(popUpsLink);
	}

	public WebElement getTablesLink() {
		return driver.findElement(tablesLink);
	}

	public WebElement getTestStoreLink() {
		return driver.findElement(testStoreLink);
	}

	public WebElement getAboutMeLink() {
		return driver.findElement(aboutMeLink);
	}
	
	public WebElement getCookie() throws IOException {
//		this.driver = getDriver();
		return driver.findElement(cookie);
	}
}
