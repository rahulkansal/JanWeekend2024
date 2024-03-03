package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null ;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/howto/howto_js_rangeslider.asp");
		
		WebElement element = driver.findElement(By.id("id2"));
		
	/*	element.click();
		
		for(int i=0;i<7;i++) {
			element.sendKeys(Keys.ARROW_RIGHT);
		} */
		
		int width = element.getSize().getWidth(); // total pixels for slider
		double percent = width/(100 - 0);// to calculate pixels for 1 value in slider
		int totalPixelstoSlide = (int)percent * (65-50); // get total pixels to slide for given values
			
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, totalPixelstoSlide, 0).perform();
		
	}

}
