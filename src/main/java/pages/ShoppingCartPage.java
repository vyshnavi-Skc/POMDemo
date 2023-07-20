package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartPage extends TestBase{
	
	@FindBy(css="div.cart > button.call-to-action")
	WebElement chkoutBtn;
	@FindBy(css="input#billing-coupon")
	WebElement applyCouponCheckbox;
	
	@FindBy(css="#coupon")
	WebElement applyCouponTextBox;
	
	@FindBy(css="input#coupon+button")
	WebElement applyCouponButton;
	
	@FindBy(css="input#coupon+button+p")
	WebElement inValidCoupon;
	
	@FindBy(css="div.cart>button.call-to-action+button")
	WebElement emptyCart;
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	public void checkOut() {
		chkoutBtn.click();
	}
	public void emptyCart() {
		emptyCart.click();
	}
	public void applyCoupon() {
		applyCouponCheckbox.click();
		applyCouponTextBox.sendKeys("coupon");
		applyCouponButton.click();
		inValidCoupon.isDisplayed();
	}
	
	

}
