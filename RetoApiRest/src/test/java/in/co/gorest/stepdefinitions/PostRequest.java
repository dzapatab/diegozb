package in.co.gorest.stepdefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.emptyArray;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import java.util.HashMap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.co.gorest.utils.TestBase;
import io.restassured.response.Response;

public class PostRequest extends TestBase {

	TestAPI testContext;

	public PostRequest(TestAPI testContext) {
		this.testContext = testContext;
	}

	String email = GetRandomString(10) + "@gmail.com";

	@Given("I set header and body to create new user")
	public void i_set_header_and_body_to_create_new_user() {

		HashMap<String, String> hm_header = new HashMap<String, String>();
		hm_header.put("Content-Type", "application/json");

		String body_string = "{\n" 
		+ "	\"gender\":\"male\",\n" 
		+ "	\"last_name\":\"Zapata\",\n"
		+ "	\"first_name\":\"Diego\",\n" 
		+ "	\"email\":\"" + email 
		+ "\"\n" + "}";
		testContext.scn.write("body sent as: " + body_string);

		testContext.req_spec.headers(hm_header).body(body_string);
	}

	@When("I hit the api with post request and end point as {string}")
	public void i_hit_the_api_with_post_request_and_end_point_as(String endPoint) {
		testContext.resp = testContext.req_spec.when().post(endPoint);
		testContext.scn.write("response:  " + testContext.resp.asString());
	}

	@Then("API created a new User in the system")
	public void api_created_a_new_User_in_the_system() {
		testContext.resp.then().statusCode(302).assertThat().body("_meta.success", equalTo(true))
				.body("_meta.code", equalTo(201))
				.body("_meta.message", equalTo(
						"A resource was successfully created in response to a POST request. The Location header contains the URL pointing to the newly created resource."))
				.body("result.first_name", equalTo("Diego")).body("result.last_name", equalTo("Zapata"))
				.body("result.gender", equalTo("male")).body("result.email", equalTo(email))
				.body("result.dob", equalTo(null));

	}

	@Then("I can find the new user in the system when i get the user with last name {string}")
	public void iCanFindTheNewUserInTheSystemWhenIGetTheUserWithLastName(String lastName) {
		String id = testContext.resp.jsonPath().getString("result.id");

		Response resp_get = given().baseUri(server).auth().oauth2(accessToken).when().get("/public-api/users/" + id);
		testContext.scn.write("get reponse after post: " + resp_get.asString());

		resp_get.then().assertThat().statusCode(200)
		.body("_meta.success", equalTo(true))
				.body("_meta.code", equalTo(200))
				.body("_meta.message", equalTo("OK. Everything worked as expected."))
				.body("result", not(emptyArray()))
				.body("result.first_name", equalTo("Diego"))
				.body("result.last_name", equalTo(lastName))
				.body("result.gender", equalTo("male"))
				.body("result.email", equalTo(email))
				.body("result.dob", equalTo(null));
	}

}
