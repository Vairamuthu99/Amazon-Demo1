package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.AddressPage;


public class AddressTest extends Baseclass {
	
	@Test
	public void Address() {

		AddressPage location = new AddressPage(driver);
		location.Locator();
		location.City("600004");
	}

}
