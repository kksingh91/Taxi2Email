package EmailApp.TestCases;

import org.testng.annotations.Test;

import EmailApp.Utility.Taxi2Utility;

public class Taxi2Test  extends Taxi2Utility{
	
	@Test(enabled = true, priority = 0)
	public void Taxi2Airport() {
		openBrowser("Chrome");
		emailLoginId();
		processWait();
		
	}

}
