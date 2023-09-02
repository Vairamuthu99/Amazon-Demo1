package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.SearchfilterPage;

public class SearchfilterTest extends Baseclass {
	
	@Test
	public void product() {

		SearchfilterPage filter = new SearchfilterPage(driver);
		filter.Filter();
		
	}

}
