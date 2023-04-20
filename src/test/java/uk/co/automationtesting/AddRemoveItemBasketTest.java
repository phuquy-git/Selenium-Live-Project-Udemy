package uk.co.automationtesting;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import PageObjects.HomePage;
import PageObjects.ShopContentPanel;
import PageObjects.ShopHomepage;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;
import base.ExtentManager;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks{

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}
	
	@Test
	public void addRemoveItem() throws IOException, InterruptedException {
		
		ExtentManager.log("Starting AddRemoveItemBasketTest...");
		
		HomePage home = new HomePage();
		home.getCookie().click();
		ExtentManager.pass("Reached the shop homepage");
		home.getTestStoreLink().click();
		
		ShopHomepage shopHome = new ShopHomepage();
		shopHome.getProductOne().click();
		
		ShopProductPage shopProduct = new ShopProductPage();
		
		Select sizes = new Select(shopProduct.getSizeOption());
		sizes.selectByVisibleText("M");
		ExtentManager.pass("Have successfully selected product size");
		
		shopProduct.getQuantityIncrease().click();
		ExtentManager.pass("Have successfully increased quantity");
		shopProduct.getAddToCartBtn().click();
		ExtentManager.pass("Have successfully added product to basket");
		Thread.sleep(5000);
		
		ShopContentPanel shopContent = new ShopContentPanel();
		shopContent.getContinueShoppingBtn().click();
		shopProduct.getHomePage().click();
		shopHome.getProductTwo().click();
		shopProduct.getAddToCartBtn().click();
		shopContent.getProceedToCheckoutBtn().click();
		
		ShoppingCart cart = new ShoppingCart();
		cart.getDeleteTwo().click();

		
		waitForElementInvisible(cart.getDeleteTwo(), 10);
		
		System.out.println(cart.getTotalValue().getText());
		
		try {
			// using an assertion to make sure the total amount is what we are expecting
			Assert.assertEquals(cart.getTotalValue().getText(), "$45.23");
			ExtentManager.pass("The total amount matches the expected amount");
		} catch(AssertionError e) {
			Assert.fail("Cart amount did not match the expected amount, it found " + cart.getTotalValue().getText() 
					+ " expected $45.23");
			ExtentManager.fail("The total amount did not match the expected amount. ");
		}
		
		
		
	}

	
}
