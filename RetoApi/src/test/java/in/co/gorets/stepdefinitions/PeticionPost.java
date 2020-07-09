package in.co.gorets.stepdefinitions;

import static in.co.gorest.exceptios.ErroresAssertion.ERROR_VALIDANDO_DATA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.Matchers;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.co.gorest.exceptios.ErroresAssertion;
import in.co.gorest.questions.LaRespuestaDelServicio;
import in.co.gorest.tasks.RealizarPeticion;
import net.serenitybdd.screenplay.GivenWhenThen;

public class PeticionPost {

	@When("^I hit the api with post request and end point as \"([^\"]*)\"$")
	public void iHitTheApiWithPostRequestAndEndPointAs(String path) {
    	theActorInTheSpotlight().attemptsTo(RealizarPeticion.usuarios(path));

	}

	@Then("^API created a new User in the system$")
	public void apiCreatedANewUserInTheSystem() {
		  theActorInTheSpotlight().should(GivenWhenThen
	                .seeThat(LaRespuestaDelServicio.obtenerCampo("_meta.code"),Matchers.equalTo("201")));
		  
		  theActorInTheSpotlight().should(GivenWhenThen
	                .seeThat(LaRespuestaDelServicio.obtenerCampo("_meta.success"),Matchers.equalTo("true")));
	}

	@Then("^I can find the new user in the system when i get the user with last name \"([^\"]*)\"$")
	public void iCanFindTheNewUserInTheSystemWhenIGetTheUserWithLastName(String apellido) {
		  theActorInTheSpotlight().should(GivenWhenThen
	                .seeThat(LaRespuestaDelServicio.obtenerCampo("result.last_name"),Matchers.equalTo(apellido))
	                .orComplainWith(ErroresAssertion.class, ERROR_VALIDANDO_DATA));
	}


}
