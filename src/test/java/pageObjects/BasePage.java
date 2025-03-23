package pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	 WebDriver driver;
	 ChromeOptions options;
	    
	   public BasePage(WebDriver driver)
	     {
			 this.driver=driver;

		     PageFactory.initElements(driver,this);

			 //driver = new ChromeDriver(options);
	     }
	   	   
}





