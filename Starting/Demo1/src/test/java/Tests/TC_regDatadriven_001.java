package Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utlity.Datafromexcel;

public class TC_regDatadriven_001 {
	WebDriver driver ;
	@Test(dataProvider = "data1")
	public void reg(String scenario,String firstname,String lastname,String email,String password,String cpassword) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys(firstname);
		driver.findElement(By.name("LastName")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(cpassword);
		driver.findElement(By.name("register-button")).click();
	}

	
	@DataProvider(name="data1")
	public String[][] getdata() throws IOException{
		Datafromexcel eu=new Datafromexcel("‪C:\\Users\\DELL\\Desktop\\drop.xlsx");
		int rows=eu.getRow("shiva");
		int col=eu.getcell("shiva", 1);
		String[][] value=new String[rows][col];
		for(int i=1;i<rows;i++) {
			for(int j=0;j<col;j++) {
				value[i][j]=eu.getdata("shiva", i, j);
		
	}

	}
		return value;
	}
}
