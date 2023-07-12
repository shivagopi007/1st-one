package utlity;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baseclass.Facebookdate;

public class Selectutiltiy extends Facebookdate {
	public Selectutiltiy(WebDriver driver) {
		this.driver=driver;
	}
	public void  selectbyindexvalue(WebElement ele,int i) {
		Select obj=new Select(ele);
		 obj.selectByIndex(i);
	
	}
	public void selectbyvalue(WebElement ele,String i) {
		Select obj=new Select(ele);
		obj.selectByValue(i);
	}
	public void selectvisibletext(WebElement ele,String i) {
		Select obj=new Select(ele);
		obj.selectByVisibleText(i);
	}
	

}
