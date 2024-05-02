package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase02 {
	@Test
	public void ktmTestCase()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bajajauto.com/");
		
		
		Assert.assertEquals(driver.getTitle(), "Leading manufacturer of bikes & 3-wheelers | Bajaj Auto", "Bajaj Page is Not Displayed.."); 
		Reporter.log("Bajaj Page is  Displayed..", true);
		
		driver.close();
	}
	
}
