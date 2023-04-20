package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.OrderFormDelivery;
import PageObjects.OrderFormPayment;
import PageObjects.OrderFormPersInfo;
import PageObjects.OrderFormShippingMethod;
import PageObjects.ShopContentPanel;
import PageObjects.ShopHomepage;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;
import base.ExtentManager;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks{

	public OrderCompleteTest() throws IOException {
		
		super();
	}
	
	@Test
	public void endToEndTest() throws IOException, InterruptedException {
		
		ExtentManager.log("Starting OrderCompleteTest...");
		
		HomePage home = new HomePage();
		home.getCookie().click();
		ExtentManager.pass("Have successfully reached story homepage");
		home.getTestStoreLink().click();
		
		ShopHomepage shopHome = new ShopHomepage();
		shopHome.getProductOne().click();
		ExtentManager.pass("Have successfully clicked on product");
		
		ShopProductPage shopProduct = new ShopProductPage();
		ExtentManager.pass("Have successfully reached shop product page");
		Select sizes = new Select(shopProduct.getSizeOption());
		sizes.selectByVisibleText("M");
		ExtentManager.pass("Have successfully selected product size");
		shopProduct.getQuantityIncrease().click();
		ExtentManager.pass("Have successfully increased quantity");
		shopProduct.getAddToCartBtn().click();
		ExtentManager.pass("Have successfully added item to cart");
		
		Thread.sleep(5000);
		
		ShopContentPanel shopContent = new ShopContentPanel();
		shopContent.getProceedToCheckoutBtn().click();
		
		ShoppingCart shoppingCart = new ShoppingCart();
		ExtentManager.pass("Have successfully reached shopping cart page");
		shoppingCart.getHavePromo().click();
		ExtentManager.pass("Have successfully selected the promo button");
		shoppingCart.getPromoTextbox().sendKeys("20OFF");
		shoppingCart.getPromoAddBtn().click();
		Thread.sleep(5000);
		shoppingCart.getProceedToCheckoutBtn().click();
		ExtentManager.pass("Have successfully selected the check out button");
		
		OrderFormPersInfo info = new OrderFormPersInfo();
		info.getMrTitle().click();
		info.getFirstName().sendKeys("testtest");
		info.getLastName().sendKeys("testtest");
		info.getEmail().sendKeys("testtest@gmail.com");
		info.getAgreeTerm().click();
		ExtentManager.pass("Have successfully entered customer details");
		Thread.sleep(5000);
		info.getContinueBtn().click();
		
		OrderFormDelivery deli = new OrderFormDelivery();
		deli.getAddress().sendKeys("hoahaoq10");
		deli.getCity().sendKeys("hcm");
		Select states = new Select(deli.getState());
		states.selectByVisibleText("AP");
		deli.getZip().sendKeys("70000");
		Thread.sleep(5000);
		deli.getContinueBtn().click();
		ExtentManager.pass("Have successfully entered delivery info");
		
		OrderFormShippingMethod ship = new OrderFormShippingMethod();
		ship.getDeliveryMsgTextbox().sendKeys("thank you!");
		Thread.sleep(5000);
		ship.getContinueBtn().click();
		ExtentManager.pass("Have successfully selected shipping method");
		
		
		OrderFormPayment pay = new OrderFormPayment();
		pay.getPayByCheck().click();
		pay.getTermsAndConditions().click();
		Thread.sleep(5000);
		pay.getOrderBtn().click();
		Thread.sleep(5000);
		ExtentManager.pass("Have successfully placed order");
	}
}















