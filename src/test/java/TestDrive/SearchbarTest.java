package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.SearchbarPage;

public class SearchbarTest extends Baseclass {

	@Test
	public void product() {

		SearchbarPage search = new SearchbarPage(driver);
		search.Search("ipad 10th generation");
		Switchclass();
		search.Buything();
	}
}
