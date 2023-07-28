package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class eBaySite {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  Reporter.log("Opening Amazon",true);
	  Thread.sleep(40000);
	  driver.close();
  }
}
