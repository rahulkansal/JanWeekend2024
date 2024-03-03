package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RetryTest {
	
	@Test(retryAnalyzer=Tests.MyRetry.class)
	public void login() {
		WebDriver driver = null;
		String browser = "edge";

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		driver.get("https:/google.com");

		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Gogle");
		
	
	}
	
	@Test
	public void login1() {
		WebDriver driver = null;
		String browser = "edge";

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		driver.get("https:/google.com");

		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Gogle");
		
	
	}


}
