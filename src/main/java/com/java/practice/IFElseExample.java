package com.java.practice;

public class IFElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser ="Opera";
		
		if(browser.equals("chrome")) {
			System.out.println("chrome browser");
		}
		else if(browser.equals("edge")) {
			System.out.println("edge browser");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox browser");
		}
		else {
			System.out.println("default browser");
		}
		
		
		
		switch(browser) {
		case "chrome":
			System.out.println("chrome browser");
			break;
		case "edge":
			System.out.println("edge browser");
			break;	
		case "firefox":
		case "Opera":	
			System.out.println("firefox browser");
			break;	
		default :
			System.out.println("default browser");
		}

	}

}
