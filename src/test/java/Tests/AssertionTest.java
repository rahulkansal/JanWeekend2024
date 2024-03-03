package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	@Test
	public void login() {
		WebDriver driver = null;
		String browser = "edge";
		
		SoftAssert softAssert = new SoftAssert();

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		driver.get("https:/google.com");

		String title = driver.getTitle();
		System.out.println(title);
		
		softAssert.assertEquals(title, "Google");
		
		System.out.println("after 1st assert");
		
		softAssert.assertEquals(false, true);
		System.out.println("after 2nd assert");
		
		softAssert.assertAll();
		
		

		
	}

}
