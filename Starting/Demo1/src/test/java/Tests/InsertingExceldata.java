package Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utlity.Datafromexcel;

public class InsertingExceldata  {
	WebDriver driver;
	@Test(dataProvider = "data")
	public void t1(String title ,String user,String pass) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		if (title.equalsIgnoreCase("valid-valid")) {
			String exp="shiva101012402037@gmail.com";
			WebElement ele=driver.findElement(By.xpath("//a[@class='account']"));
			String act=ele.getText();
			Assert.assertEquals(act, exp,"passed");
		}
		else if(title.equalsIgnoreCase("valid-invalid")) {
			String exp="shiva101012402037@gmail.com";
			WebElement ele=driver.findElement(By.xpath("//a[@class='account']"));
			String act=ele.getText();
			Assert.assertEquals(act, exp,"wrong");
		}
		 if(title.equalsIgnoreCase("invalid-valid")) {
			String exp="shiva101012402037@gmail.com";
			WebElement ele=driver.findElement(By.xpath("//a[@class='account']"));
			String act=ele.getText();
			Assert.assertEquals(act, exp,"wrong");
		}
		else if(title.equalsIgnoreCase("invalid-invalid")) {
			String exp="shiva101012402037@gmail.com";
			WebElement ele=driver.findElement(By.xpath("//a[@class='account']"));
			String act=ele.getText();
			Assert.assertEquals(act, exp,"wrong");
		}

		
	}
	
	@DataProvider(name="data")

	public String[][] getdata() throws IOException{
		Datafromexcel eu=new Datafromexcel("C:\\Users\\DELL\\Desktop\\shiva.xlsx");
		int rows=eu.getRow("Demo");
		int col=eu.getcell("Demo", 0);
		String[][] values=new String[rows][col];
		for(int i=1;i<rows;i++) {
			for(int j=1;j<col;j++) {
				values[i][j]=eu.getdata("Demo", i, j);
				
			}
			
		}
		return values;
	}

}

	


