package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class SignupPage extends Utilclass  {
	
	WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement signup;
	
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	WebElement CreateAccount;
	
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	WebElement FLName;
	
	@FindBy(xpath = "//input[@id='ap_phone_number']")
	WebElement MobileNo;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement EmailID;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement Continue;

	public void signup(String Name, String Number) {
		signup.click();
		CreateAccount.click();
		FLName.sendKeys(Name);
		MobileNo.sendKeys(Number);
	}
	public void Email(String Mail) {
		EmailID.sendKeys(Mail);
		
	}
	public void Password(String Pass) {
		Password.sendKeys(Pass);
		Continue.click();
	}	
	public void Continue() {
		Continue.click();
	}	
}
