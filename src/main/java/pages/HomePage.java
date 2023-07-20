package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

/**
 * @author Administrator
 *
 */
public class HomePage extends TestBase{
@FindBy(name="searchbar")
WebElement searchBox;

@FindBy(id="button-search")
WebElement searchBtn;

@FindBy(id="cart")
WebElement cartBtn;

public HomePage() {
	PageFactory.initElements(driver, this);
}

/**
 * @param strItem
 */
/**
 * @param strItem
 */
/**
 * @param strItem
 */
public void searchItem(String strItem) {
	searchBox.sendKeys(strItem);
	searchBtn.click();
	
}
public void viewCart() {
	cartBtn.click();
}
}
