package fbpack;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\chromedriver.exe";
    public WebDriver driver ; 
     
  @Test
  
	  public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
	  
  }

