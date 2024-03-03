package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

	@Test
	public void serverStartedOk() {  
		Assert.assertEquals(false, true);
	}
	
	
	@Test(dependsOnMethods = { "serverStartedOk" }, alwaysRun = true)
	public void method1() {
		
		System.out.println("test case");
	}

	
}
