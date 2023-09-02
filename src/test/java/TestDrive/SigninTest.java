package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.SigninPage;

public class SigninTest extends Baseclass {

	@Test
	public void SignIn() {

		SigninPage signin = new SigninPage(driver);
		signin.signin("msvairamuthu1999@gmail.com", "123456");
		
	}
}