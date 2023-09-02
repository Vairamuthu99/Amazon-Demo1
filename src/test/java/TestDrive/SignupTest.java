package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.SignupPage;


public class SignupTest extends Baseclass {
	
	@Test
	public void SignUp() {

		SignupPage signup = new SignupPage(driver);
		signup.signup("Vairam","9874563210");
		signup.Email(generateNewEmail());
		signup.Password("123456");
		signup.Continue();
		
	}

}
