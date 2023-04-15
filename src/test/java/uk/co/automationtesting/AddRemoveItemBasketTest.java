package uk.co.automationtesting;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import PageObjects.HomePage;
import PageObjects.ShopContentPanel;
import PageObjects.ShopHomepage;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;
import base.BasePage;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends BasePage{

	public AddRemoveItemBasketTest() throws IOException {
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
	public void addRemoveItem() throws IOException, InterruptedException {
		
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
		shopContent.getContinueShoppingBtn().click();
		shopProduct.getHomePage().click();
		shopHome.getProductTwo().click();
		shopProduct.getAddToCartBtn().click();
		shopContent.getProceedToCheckoutBtn().click();
		
		ShoppingCart cart = new ShoppingCart(driver);
		cart.getDeleteTwo().click();

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(cart.getDeleteTwo()));
		
		System.out.println(cart.getTotalValue().getText());
		
		Assert.assertEquals(cart.getTotalValue().getText(), "$45.23");
	}

	
}
