package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class meeshoTest {
  @Test
  public void meeshowebsite() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.meesho.com/");
	  driver.manage().window().maximize();
	  Reporter.log("Opening Amazon",true);
	  Thread.sleep(40000);
	  driver.close();
  }
}
