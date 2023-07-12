package Tests;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Baseclass.Facebookdate;
import pages.DateFacebook;
import utlity.Selectutiltiy;

public class TC_001_facebook extends Facebookdate {
	 Selectutiltiy d1;
	 DateFacebook fb;
	@Test(priority = 1)
	public void day() throws InterruptedException {
		fb=new DateFacebook(driver);
		fb.click();
		Thread.sleep(4000);
		d1=new  Selectutiltiy(driver);
		WebElement d2=fb.day();
	
		 d1.selectbyindexvalue(d2, 25);
		 Thread.sleep(5000);
		}
	
	
	@Test(priority = 2)
	public void month() throws InterruptedException {
		
		Thread.sleep(4000);
		d1=new  Selectutiltiy(driver);
		WebElement d2=fb.month();
		d1.selectbyvalue(d2, "8");
		Thread.sleep(5000);
		
	}
	@Test(priority = 3)
	public void year() throws InterruptedException {
	
		Thread.sleep(4000);
		d1=new  Selectutiltiy(driver);
		WebElement d2=fb.yea();
		d1.selectvisibletext(d2, "1996");
	}
} 


