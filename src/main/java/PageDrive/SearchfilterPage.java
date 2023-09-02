package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class SearchfilterPage extends Utilclass {
	
	WebDriver driver;

	public SearchfilterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
	WebElement Filterbar;
	
	@FindBy(xpath = "//a[@data-menu-id='2']")
	WebElement Selectmenu;
	
	@FindBy(xpath = "//a[@href='/dp/B08KGVYX6F?ref_=nav_em__shopall_show5_0_2_2_6']")
	WebElement Selectproduct;
	
	@FindBy(xpath = "//input[@id='buy-now-button']")
	WebElement Buyproduct;
	
	public void Filter() {
		Filterbar.click();
		Selectmenu.click();
		Selectproduct.click();
		Buyproduct.click();
	}
}
