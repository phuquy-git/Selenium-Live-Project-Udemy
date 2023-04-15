package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormShippingMethod {

	public WebDriver driver;

	By deliveryMsgTextbox = By.cssSelector("#delivery_message");
	By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");
	
	public OrderFormShippingMethod(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDeliveryMsgTextbox() {
		return driver.findElement(deliveryMsgTextbox);
	}

	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
	
	
}
