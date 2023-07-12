package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.Baseclass1;

public class Links extends Baseclass1{
	public Links(WebDriver driver) {
		this.driver=driver;
	}
      By link=By.tagName("a");
      By scroll=By.xpath("//a[contains(text(),'Google+')]");
      By headerlinks=By.xpath("//ul[@class='top-menu']");
      By Radiobuttons=By.xpath("//ul[@class='poll-options']");
      

      
      public int totalcount() {
    	 List<WebElement> tc=driver.findElements(link);
    	 int count =tc.size();
    	 System.out.println(count);
    	 return count;
    	 
      }
      public int visiblecount() {
    	  List<WebElement> ts=driver.findElements(link);
    	 int total=ts.size();
    	 int visible=0;
    	 for(WebElement ele:ts ) {
    		 if(ele.isDisplayed()) {
    			visible++; 
    		 }
    		 
    	 }
    	 System.out.println(visible);
    	 return visible;
      }
      public int invisble() {
    	  List<WebElement> tc=driver.findElements(link);
     	 int count =tc.size();
     	 List<WebElement> ts=driver.findElements(link);
    	 int total=tc.size();
    	 
     	int  invis=count-total;  
     	System.out.println(invis);
     	return invis;
      
      }	
      public void alltext() {
    	  List<WebElement> tc=driver.findElements(link);
    	  for(WebElement obj:tc) {
    		  System.out.println(obj.getText());
    	  }
    	  
      }
      public WebElement down() {
    		WebElement element=driver.findElement(scroll);
    		return element;
      
}
      public void menulinkstext() {
    	 List<WebElement>Hlinks= driver.findElements(headerlinks);
    	 for(WebElement obj1:Hlinks) {
    		System.out.println( "Header links are:"+obj1.getText()+" ");
    	 }
      }
      public WebElement sc() {
    WebElement	elements=  driver.findElement(By.xpath(null));
    return elements;
      }
      public void Radio() {
    List <WebElement> rbuttons= driver.findElements(Radiobuttons);
    for(WebElement rb:rbuttons) {
    	System.out.println("Radio buttons are:"+rb.getText()+"   ");
    	
    }
    	  
      }
      
}



