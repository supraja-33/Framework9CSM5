package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SighUpPage {
	//Declaration
	@FindBy(id="First Name")
	private WebElement firstNameTF;
	@FindBy(id="Last Name")
	private WebElement LastNameTF;
	@FindBy(xpath="//div[@id='Gender']/descendant::label/span[2]")
	private List<WebElement> genderRadioButtons;
	@FindBy(id="Phone Number")
	private WebElement phonenNumberTF;
	@FindBy(id="Email Address")
	private WebElement emailAddressTF;
	@FindBy(id="Password")
	private WebElement passwordTF;
	@FindBy (id="Confirm Password")
	private WebElement ConfirmPasswordTF;
	@FindBy (id="Terms and Conditions")
	private WebElement termsAndConditionsCheckBox;
	@FindBy(xpath="//button[text='Register']")
	private WebElement registerButtonElement;
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement registerButton;
	//Initialization
	public SighUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public void createUserAccount(String firstName,String lastName,String expectedGender,String phoneNum, String email,String password) {
	  firstNameTF.sendKeys(firstName);
	   LastNameTF.sendKeys(lastName);
	   
	for(WebElement element:  genderRadioButtons) {
		String gender=element.getText();
		if(gender.equals("expectedconditions")) {
			element.click();
			break;
		}
	}
	phonenNumberTF.sendKeys(phoneNum);
	emailAddressTF.sendKeys(email);
	passwordTF.sendKeys(password);
	ConfirmPasswordTF.sendKeys(password);
	termsAndConditionsCheckBox.click();
	try {
		Thread.sleep(3000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
		
	}
	registerButton.click();
	}

}
