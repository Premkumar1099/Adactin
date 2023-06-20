package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import practice.comBaseclass.Baseclass;

public class Hooks extends Baseclass {

	@Before
	public void beforeHooks() {
		System.out.println("Am Before Hooks");
	}

	@After
	public void afterHooks(Scenario scenario) {
		scenario.attach(takescreenshotForReport(), "image/png", "screenshot");

		//driverQuit();
	}

}
