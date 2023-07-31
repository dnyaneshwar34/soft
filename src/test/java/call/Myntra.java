package call;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	WebDriver driver;
  @Test
  public void verifymyngtra() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.myntra.com/");
	  driver.manage().deleteAllCookies();
	  driver.quit();
	  
	  
  }
}
