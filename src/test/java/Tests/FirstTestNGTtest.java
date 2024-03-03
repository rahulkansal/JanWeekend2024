package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstTestNGTtest {

	@Test(invocationCount = 2, threadPoolSize = 2, invocationTimeOut = 2000)
	public void TC_Login() {

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

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		// driver.manage().window().minimize();
		// driver.manage().window().fullscreen();

	}

	@Test(timeOut=20000)
	public void TC_Login1() {

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

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		// driver.manage().window().minimize();
		// driver.manage().window().fullscreen();

	}

}
