package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase03 {
	@Test
	public void ktmTestCase()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tvsmotor.com/");
		
		
		Assert.assertEquals(driver.getTitle(), "Best Two Wheeler In India- Bike, Scooter, Motorcycle | TVS Motor", "TVS Motorcycle Page is Not Displayed.."); 
		Reporter.log("TVS Motorcycle Page is  Displayed..", true);
		
		driver.close();
	}
	
}
