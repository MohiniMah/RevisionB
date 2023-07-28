package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void A() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Reporter.log("Opening Amazon",true);
	  Thread.sleep(40000);
	  driver.close();
	  
  }
}
