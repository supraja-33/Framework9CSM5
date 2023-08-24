package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPages.AddressFormPage;
import pomPages.CartPage;
import pomPages.HeadPhonesPage;
import pomPages.HomePage;
import pomPages.MyProfilePage;
import pomPages.ShoppersStackLoginPage;
import pomPages.SighUpPage;
import pomPages.WelcomePage;
import pomPages.myAddressesPage;

public class BaseClass {
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDriverUtility webutil;
	public WebDriver driver;
	public static WebDriver sdDriver;
	
	
	
	protected WelcomePage welcome;
	protected ShoppersStackLoginPage login;
	protected HomePage home;
	protected SighUpPage signup;
	protected MyProfilePage myProfile;
	protected myAddressesPage myaddress;
	protected HeadPhonesPage headphone;
	protected CartPage cart;
	protected AddressFormPage address;
	
	@BeforeClass
	public void classConfiguration() {
		
		property=new PropertiesUtility();
		excel=new ExcelUtility();
		jutil=new JavaUtility();
		webutil=new WebDriverUtility();
		
		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		excel.excelInit(IConstantPath.EXCEL_PATH);
	}
	@BeforeMethod
	public void methodConfiguration() {
		driver=webutil.navigateToApp(property.getData("Browser"), property.getData("url"), Long.parseLong(property.getData("time")));
	sdDriver=driver;
	
	welcome=new WelcomePage(driver);
	login=new ShoppersStackLoginPage(driver);
	home=new HomePage(driver);
	signup=new SighUpPage(driver);
	myProfile=new MyProfilePage(driver);
	myaddress=new myAddressesPage(driver);
	signup=new SighUpPage(driver);
	myProfile=new MyProfilePage(driver);
	myaddress = new myAddressesPage(driver);
	headphone=new HeadPhonesPage(driver);
	cart= new CartPage(driver);
	address=new AddressFormPage(driver);
	}
	@AfterMethod
	public void methodTeardown() {
		home.clickProfileButon();
		home.clickLogout();
		webutil.closeAllBrowsers();
		
	}
	@AfterClass
	public void classTeardown() {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
}
	
