package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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
import base.BasePage;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends BasePage{

	public OrderCompleteTest() throws IOException {
		
		super();
	}

	@BeforeTest
	public void setup() throws IOException {
		
		driver = getDriver();
		driver.get(getUrl());
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver = null;
	}
	
	@Test
	public void endToEndTest() throws IOException, InterruptedException {
		
		HomePage home = new HomePage(driver);
		home.getCookie().click();
		home.getTestStoreLink().click();
		
		ShopHomepage shopHome = new ShopHomepage(driver);
		shopHome.getProductOne().click();
		
		ShopProductPage shopProduct = new ShopProductPage(driver);
		
		Select sizes = new Select(shopProduct.getSizeOption());
		sizes.selectByVisibleText("M");
		
		shopProduct.getQuantityIncrease().click();
		shopProduct.getAddToCartBtn().click();
		
		Thread.sleep(5000);
		
		ShopContentPanel shopContent = new ShopContentPanel(driver);
		shopContent.getProceedToCheckoutBtn().click();
		
		ShoppingCart shoppingCart = new ShoppingCart(driver);
		shoppingCart.getHavePromo().click();
		shoppingCart.getPromoTextbox().sendKeys("20OFF");
		shoppingCart.getPromoAddBtn().click();
		Thread.sleep(5000);
		shoppingCart.getProceedToCheckoutBtn().click();
		
		OrderFormPersInfo info = new OrderFormPersInfo(driver);
		info.getMrTitle().click();
		info.getFirstName().sendKeys("testtest");
		info.getLastName().sendKeys("testtest");
		info.getEmail().sendKeys("testtest@gmail.com");
		info.getAgreeTerm().click();
		Thread.sleep(5000);
		info.getContinueBtn().click();
		
		OrderFormDelivery deli = new OrderFormDelivery(driver);
		deli.getAddress().sendKeys("hoahaoq10");
		deli.getCity().sendKeys("hcm");
		Select states = new Select(deli.getState());
		states.selectByVisibleText("AP");
		deli.getZip().sendKeys("70000");
		Thread.sleep(5000);
		deli.getContinueBtn().click();
		
		OrderFormShippingMethod ship = new OrderFormShippingMethod(driver);
		ship.getDeliveryMsgTextbox().sendKeys("thank you!");
		Thread.sleep(5000);
		ship.getContinueBtn().click();
		
		
		OrderFormPayment pay = new OrderFormPayment(driver);
		pay.getPayByCheck().click();
		pay.getTermsAndConditions().click();
		Thread.sleep(5000);
		pay.getOrderBtn().click();
		Thread.sleep(5000);
	}
}















