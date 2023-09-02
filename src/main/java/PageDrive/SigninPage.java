package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class SigninPage extends Utilclass {

	WebDriver driver;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement signin;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement EnterEmail;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement Continue;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement Passwword;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement Submit;

	public void signin(String MailID , String Pass ) {
		signin.click();
		EnterEmail.sendKeys(MailID);
		Continue.click();
		Passwword.sendKeys(Pass);
		Submit.click();
		
	}
}
