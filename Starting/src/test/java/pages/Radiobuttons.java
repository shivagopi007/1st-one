package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Baseclass.Baseclass1;

public class Radiobuttons extends Baseclass1 {
	WebDriver driver;
	public Radiobuttons(WebDriver driver) {
		this.driver=driver;
	}
	By l1=By.xpath("//li[@class='answer'][1]");
	By l2=By.xpath("//li[@class='answer'][2]");
	By l3=By.xpath("//li[@class='answer'][3]");
	By l4=By.xpath("//li[@class='answer'][4]");
	By all=By.xpath("//ul[@class='poll-options']");
	
	public void excellent() {
		driver.findElement(l1).click();
	}
	public void all() {
	java.util.List<WebElement> all1=driver.findElements(all);
	}

}
