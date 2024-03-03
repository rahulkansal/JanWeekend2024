package com.java.practice;

public class UsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverExample driver;
		String browser="edge";
		if(browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeBrowser();
		 
		}
		else {
			driver = new EdgeBrowser();
		}
		 
		 driver.get();
		 driver.click();
		 driver.sendKeys();
		
	}

}
