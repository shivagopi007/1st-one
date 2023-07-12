package Tests;

import org.testng.annotations.Test;

import Baseclass.Baseclass1;
import pages.Registration;

public class Tc_reg_001 extends Baseclass1{
	Registration rp;
	@Test(priority = 1,description = "Validating the registerlink")
	public void regclick() throws InterruptedException {
		Thread.sleep(3000);
		
   rp= new Registration(driver);
	rp.register();

	}
	@Test(priority = 2,description = "validating the firstname")
	public void text() {
		rp=new Registration(driver);
		rp.values1();
	}
		@Test(priority = 3,description = "valiodating the register button")
		public void click() {
			rp=new Registration(driver);
			rp.Regbutton();
			
		
		
	}
}
