package Tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class EnableTC {
	
	@Test(enabled = true)
	public void test() {
		System.out.println("test");
	}
	
	//@Ignore
	@Test
	public void test1() {
		System.out.println("test1");
	}

	
	@Test
	public void test2() {
		
		System.out.println("test2");
	}


}
