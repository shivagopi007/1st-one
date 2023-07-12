 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.Baseclass1;

public class Registration extends Baseclass1 {
	public Registration(WebDriver driver) {
		this.driver=driver;
	}
	By reglink= By.xpath("//a[@class='ico-register']");
	By gender= By.id("gender-male");
	By first=By.name("FirstName");
	By second=By.name("LastName");
	By email=By.xpath("//input[@id='Email']");
	By pass=By.xpath("//input[@id='Password']");
	By confirmpass=By.xpath("//input[@id='ConfirmPassword']");
	By regclick=By.name("register-button");
	By con=By.xpath("//input[@value='Continue']");
	
	
	
	
	
	
	public void register() {
		driver.findElement(reglink).click();
		driver.findElement(gender).click();
		driver.findElement(regclick).click();
		driver.findElement(con).click();
	}
		public void values1() {
		driver.findElement(first).sendKeys("shiva");
		driver.findElement(second).sendKeys("raju");
		driver.findElement(email).sendKeys("shiva101012402037@gmail.com");
		driver.findElement(pass).sendKeys("Shiva@123");
		driver.findElement(confirmpass).sendKeys("Shiva@123");
		}
		
		public void Regbutton() {
			driver.findElement(regclick).click();
		}
	

}


	
		
	
	

