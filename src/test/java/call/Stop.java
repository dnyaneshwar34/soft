package call;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Stop {
	
	WebDriver driver;
  @Test
  public void verifyflipkart() {
	  
	  WebDriverManager.chromedriver().setup();
	 	driver = new ChromeDriver();
	 	options();}
		//Reporter.log("opening flipkart",true);
		  void options() {
		driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().deleteAllCookies();
	  
	  driver.quit();
	  
	  
	  
	  
  }
}
