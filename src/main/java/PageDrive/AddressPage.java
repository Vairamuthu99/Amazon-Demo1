package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class AddressPage extends Utilclass {

	WebDriver driver;

	public AddressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='nav-global-location-popover-link']")
	WebElement Addressbar;
	
	@FindBy(xpath = "//input[@id='GLUXZipUpdateInput']")
	WebElement Pincode;
	
	@FindBy(xpath = "//input[@aria-labelledby='GLUXZipUpdate-announce']")
	WebElement Apply;
	
	public void Locator() {
		Addressbar.click();
	
	}

	public void City(String city) {
		Pincode.sendKeys(city);
		Apply.click();
		
	}
}
