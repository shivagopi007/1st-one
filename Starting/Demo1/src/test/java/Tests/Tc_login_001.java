package Tests;

import org.testng.annotations.Test;

import Baseclass.Baseclass1;
import pages.Login;

public class Tc_login_001 extends Baseclass1{
	Login lp;
	@Test(priority = 1,description = "Validating the login link")
	public void loginlink() {
		lp=new Login(driver);
		lp.click();
		
	}
	@Test(priority = 2,description = "validating fields")
	public void text1()
	{
		lp=new Login(driver);
		lp.value();
		
	}
	

}
