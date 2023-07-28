package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SnapDeal {
  @Test
  public void snap() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.snapdeal.com/");
	  driver.manage().window().maximize();
	  Reporter.log("Opening Snapdeal",true);
	  Thread.sleep(40000);
	  driver.close();
  }
}
