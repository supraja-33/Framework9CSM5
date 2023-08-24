package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStackLoginPage {
	//Declaration
	@FindBy(id="Email")
	private WebElement emailTF;
	@FindBy(id="Password")
	private WebElement passwordTF;
	@FindBy(name="Login")
	private WebElement LoginButton;
	@FindBy(id="Create Account")
	private WebElement createAccountButton;
	
	//Initialization
	public ShoppersStackLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public void LoginToApp(String email,String password) {
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		LoginButton.click();
	}
	public void clickCreateAccountButton() {
		createAccountButton.click();  
	}

}
