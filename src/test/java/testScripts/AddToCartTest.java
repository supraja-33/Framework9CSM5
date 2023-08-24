package testScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddToCartTest extends BaseClass {
	@Test
	public void addToCartTest() throws InterruptedException {
	Map<String, String>map=excel.getData("Sheet1", "Add Address");
	welcome.clickLoginButton();
	login.LoginToApp(map.get("Email"), map.get("Password"));
	Thread.sleep(2000);
	home.mouseHoverToElectronic(webutil);
	Thread.sleep(2000);
	home.clickHeadPhonesLink();
	headphone.clickAddToCart();
	Thread.sleep(2000);
	Assert.assertEquals(headphone.getAddToCartText(), "ADDED");
	String itemName=headphone.getItemName();
	headphone.clickAddToIcon();
	Assert.assertTrue( cart.getCartItem().eqaulsIgnoreCase(itemName));
	}
	
}
