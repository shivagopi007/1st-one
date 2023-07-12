package Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex1 {



		@BeforeSuite
		
		public void beforesuite()
		{
		System.out.println("Before Suite");	
		}
		
		@BeforeTest
		public void beforetest()
		{
			System.out.println("Before Test ");
		}
		
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("Before Class=");
		}
		
		@BeforeMethod
		public void beforemethod()
		{
			 System.out.println("Before Method");
		}
		
		@Test
		public void test()
		{
			System.out.println("Test Method");
		}
		
		@Test
		public void test2()
		{
			System.out.println("Test Method2");
		}
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("aftermethod");
		}
		
		@AfterClass
		public void afterclass()
		{
			System.out.println("After Class");
		}

		@AfterTest
		public void aftertest()
		{
			System.out.println("After class");
		}
		@AfterSuite
		public void aftersuite() 
		
		{
			System.out.println("Aftersutite");
		}
		
}
