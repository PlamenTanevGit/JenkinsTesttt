package JenkinsTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Test3{

	WebDriver driver;
	
	

	
	@Test
	public void t3 () throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = WebDriverManager.chromedriver().create();

		 driver.get("https://bonigarcia.dev/webdrivermanager/");
		 
		 
		
		Assert.assertTrue(true);
		Assert.assertEquals(2,2);

	}

}
