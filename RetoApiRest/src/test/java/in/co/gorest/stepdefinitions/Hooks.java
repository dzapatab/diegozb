package in.co.gorest.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	TestAPI testContext;
	
	public Hooks(TestAPI testContext) {
		this.testContext = testContext;
	}

	@Before
	public void SetUp(Scenario s) {
		this.testContext.scn = s;
	}
	
	@After
	public void CleanUp() {
		testContext.req_spec=null;
		testContext.resp=null;
	}
}
