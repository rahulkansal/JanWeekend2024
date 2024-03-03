package Tests;

import org.testng.annotations.Test;

public class PrirityTest {
	
	@Test
	public void login() {
		
		System.out.println("login");
	}
	
	
	@Test(priority=-5)
	public void product() {
		
		System.out.println("product");
	}

	
	@Test(priority=-2)
	public void cart() {
		
		System.out.println("cart");
	}

	
	@Test(priority=0)
	public void payment() {
		
		System.out.println("payment");
	}
	
	@Test(priority=4)
	public void checkouts() {
		
		System.out.println("checkouts");
	}
	
	


}
