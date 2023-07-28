package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  Reporter.log("Opening Flipkart",true);
	//  Assert.fail();
	  Thread.sleep(70000);
	  driver.close();  
  }
  
}
