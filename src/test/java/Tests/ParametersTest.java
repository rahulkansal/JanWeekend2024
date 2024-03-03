package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParametersTest {

	
	@Parameters({ "browser","url" })
	@Test
	public void login(String browserValue, String urlValue) {
		WebDriver driver = null;
		String browser = browserValue;
		
		SoftAssert softAssert = new SoftAssert();

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		driver.get(urlValue);

		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google");
	}
	
}
