package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookdate {	public static WebDriver driver;
@BeforeClass
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}  
@AfterClass
public void teardown() throws InterruptedException {
	Thread.sleep(5000);
	//driver.quit();

}
} 


