package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAddressesPage {
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressButton;
	
	//initialization
	public myAddressesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void clickAddAddress() {
		addAddressButton.click();
	}
	
	public String getsuccessMessage() {
		return getsuccessMessage().gettext();
	}

}
