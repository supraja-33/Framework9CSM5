package testScripts;

import java.util.Map;

import org.testng.Assert;

import genericLibraries.BaseClass;

public class AddAddressTest extends BaseClass{
	public void addAddressTest() throws InterruptedException {
		Map<String, String> map= excel.getData("Sheet1","Add Adress");
		welcome.clickLoginButton();
		login.LoginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		home.clickProfileButon();
		Thread.sleep(2000);
		home.selectMyProfile();
		Thread.sleep(2000);
		myProfile.clickMyAddresses();
		myaddress.clickAddAddress();
		address.addAddressDetails(webutil, map);
		Thread.sleep(2000);
		Assert.assertEquals(myaddress.getsuccessMessage(), "successfully added");
		Thread.sleep(2000);
		
		
		
	}
	

}
