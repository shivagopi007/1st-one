package Tests;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utlity.Datafromexcel;

public class Tc_exceldata_001 {
	@Test(priority = 1)
	public void exceldata() throws IOException {
		Datafromexcel de=new Datafromexcel("C:\\Users\\DELL\\Desktop\\shiva.xlsx");
		int rows=de.getRow("Demo");
		System.out.println("Total no of Rows"+rows);
		int coms=de.getcell("Demo", 2);
		System.out.println("Total no of colms"+coms);
		String datas=de.getdata("Demo", 2, 3);
		System.out.println("Total data "+datas);
		
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<coms;j++) {
				String totaldata=de.getdata("Demo", i, j);
				System.out.print(totaldata+" ");
			}
			System.out.println();
		}
		
	}
@Test(priority = 2,description = "")
public void values() throws IOException {
	Datafromexcel de=new Datafromexcel("C:\\Users\\DELL\\Desktop\\shiva.xlsx");
	String Shiva=de.getvalues("Demo");
	System.out.println("data is"+"  "+Shiva);
}
@Test(dataProvider="data")  
	public void t1(String usernmae,String password) {
		
	}
	
}

