package Tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Baseclass.Baseclass1;
import pages.Links;

import utlity.javaScript;

public class Tc_links_001 extends Baseclass1 {
	
	Links lp;
	
@Test(priority = 1,description = "counting total links")
public void t1() {
	 lp=new Links(driver);
	lp.totalcount();
	
}
@Test(priority = 2,description = "counting visible links")
public void t2() {
	 lp=new Links(driver);
	 lp.visiblecount();
}
@Test(priority = 3,description = "counting invisble links")
public void t3() {
	 lp=new Links(driver);
	 lp.invisble();
	
}
@Test(priority = 4,description = "get all text")
public void t4() {
	 lp=new Links(driver);
	 lp.alltext();
	
}
@Test(priority = 5,description = "validating the scrolling button")
public void t5() {
	 lp=new Links(driver);
	WebElement element=lp.sc();
	javaScript jr=new javaScript(driver);
	jr.scroll(element);
	 
	
	 
}
@Test(priority = 6,description = "Validating header links")
public void t6() {
	lp=new Links(driver);
	lp.menulinkstext();
	lp.Radio();
}


}




