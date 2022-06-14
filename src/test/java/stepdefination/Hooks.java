package stepdefination;

import base.MainClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends MainClass{
	
	@Before
	public void loadBrowser() {
		initialized();
	}
	
	@After
	public void closeBrowser() {
		tearDown();

}

}
