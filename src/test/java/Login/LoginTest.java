package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Capability.Capabilitybase;

public class LoginTest extends Capabilitybase{
	
	@Test
	public void TC_Login() {
				
		baseClass.maximize(extentTest, "Maximize the broweser");

		baseClass.get(testData.get("url"));
		
		login.enterUserAndPassword(testData.get("username"), testData.get("password"));		
		login.clickLoginButton();
	}
	
	@Test
	public void TC_Login_1() {
				
		driver.manage().window().maximize();

		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		
		driver.findElement(By.id("text")).sendKeys("rahulkansla");
		driver.findElement(By.id("password")).sendKeys("dsfdsfsdf");
		
		driver.findElement(By.id("login-button")).click();

	}

}
