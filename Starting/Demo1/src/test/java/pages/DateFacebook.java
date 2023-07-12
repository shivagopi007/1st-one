package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Baseclass.Facebookdate;

public class DateFacebook extends Facebookdate {
	public DateFacebook(WebDriver driver) {
		this.driver=driver;
	}
	By click= By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
	By date=By.xpath("//select[@id='day']");
	By mon=By.xpath("//select[@id='month']");
	By year=By.xpath("//select[@id='year']");
	
	public void click() {
		driver.findElement(click).click();
	}
	public WebElement day() {
		
     WebElement day1= driver.findElement(date);
     return day1;
	}
	public WebElement month() {
		WebElement month1=driver.findElement(mon);
		return month1;
	}
	public WebElement yea() {
		WebElement year1=driver.findElement(year);
		return year1;
	}
	
	
	
	}

