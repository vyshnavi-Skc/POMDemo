package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.ItemPage;
import pages.ShoppingCartPage;

public class PlaceOrderTest extends TestBase {
	HomePage homepage;	
	ItemPage itemPage;
	ShoppingCartPage shoppingCartPage;
	@BeforeTest
	public void launchApp() {
		initialize();
	}

  @Test
  public void searchItemtest() {
	  homepage = new HomePage();
	  homepage.searchItem("Parry Hotter");
	  itemPage =new ItemPage();
	  itemPage.viewItemDetail();
	  itemPage.addItem();
  }
  //@Test(dependsOnMethods="applyCouponTest")
  public void checkoutTest() {
	  shoppingCartPage= new ShoppingCartPage();
	  shoppingCartPage.checkOut();
  }
  @Test(dependsOnMethods="searchItemtest")
  public void applyCouponTest() {
	  shoppingCartPage= new ShoppingCartPage();
	  shoppingCartPage.applyCoupon();
  }
  @Test(dependsOnMethods={"searchItemtest","applyCouponTest"})
  public void emptyCartTest() {
	  shoppingCartPage= new ShoppingCartPage();
	  shoppingCartPage.emptyCart();
  }
}
