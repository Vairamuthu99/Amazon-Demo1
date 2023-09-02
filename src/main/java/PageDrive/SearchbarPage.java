package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class SearchbarPage extends Utilclass {

	WebDriver driver;

	public SearchbarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbar;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement select;

	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement Mobile;

	@FindBy(xpath = "//input[@id='buy-now-button']")
	WebElement Buy;

	public void Search(String Product) {
		searchbar.sendKeys(Product);
		select.click();
		Mobile.click();
	}

	public void Buything() {
		Buy.click();
	}
}
