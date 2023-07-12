package utlity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.Baseclass1;

public class javaScript extends Baseclass1 {
	
		public javaScript(WebDriver driver) {
			this.driver=driver;
		}
	public void scroll(WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver ;
		jse.executeScript("arguments[0].scrollIntoView();", element);
	}
	}


