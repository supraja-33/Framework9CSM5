package testScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class RegisterShopperTest extends BaseClass {
	@Test
	public void createAccountTest() throws InterruptedException {
		welcome.clickLoginButton();
		login.clickCreateAccountButton();
		
	  
	Map<String, String> map=excel.getData("Sheet1","ShopperRegistration");
	  int randomNum=jutil.generateRandomNum(100);
	  String email=randomNum + map.get("Email Address");
	  String pwd=map.get("password")+randomNum;
	  
	  signup.createUserAccount(map.get("FirstName"),map.get("LastName"),map.get("Gender"),map.get("PhoneNumber"),email,pwd);
	          Thread.sleep(1000);
	          welcome.clickLoginButton();
	          login.LoginToApp(email,pwd);
	          Thread.sleep(2000);
	          Assert.assertTrue(driver.getTitle().contains("Home"));
		
		
	}

}
