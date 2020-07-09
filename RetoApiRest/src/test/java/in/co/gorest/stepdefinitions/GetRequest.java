package in.co.gorest.stepdefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.emptyArray;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.co.gorest.utils.TestBase;
public class GetRequest extends TestBase {

TestAPI testContext;
	
	public GetRequest(TestAPI testContext) {
		this.testContext = testContext;
	}
	
	@Given("Go rest API is up and running")
	public void goRestAPIIsUpAndRunning() {
		testContext.req_spec= given().baseUri(server).auth().oauth2(accessToken);
			
	}

	@When("I hit the api with get request and end point as {string}")
	public void iHitTheApiWithGetRequestAndEndPointAs(String endPoint) {
		testContext.resp= testContext.req_spec.when().get(endPoint);
		testContext.scn.write("Response of the request is: " + testContext.resp.asString() +"<br>" );

	}

	

}
