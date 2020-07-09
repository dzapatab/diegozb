package in.co.gorest.stepdefinitions;

import cucumber.api.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPI {

	protected RequestSpecification req_spec=null;
    protected Response resp=null;
    protected String newUserID = null;
    protected Scenario scn=null;
    
}
