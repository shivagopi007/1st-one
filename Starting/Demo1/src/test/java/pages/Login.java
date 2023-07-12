package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Baseclass.Baseclass1;

public class Login extends Baseclass1 {
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	By loginlink=By.xpath("//a[@class='ico-login']");
	By email=By.xpath("//input[@id='Email']");
	By pass=By.xpath("//input[@id='Password']");
	
public void click() {
	driver.findElement(loginlink).click();

}
public void value() {
	driver.findElement(email).sendKeys("shiva101012402037@gmail.com");
	driver.findElement(pass).sendKeys("Shiva@123");
}
}
