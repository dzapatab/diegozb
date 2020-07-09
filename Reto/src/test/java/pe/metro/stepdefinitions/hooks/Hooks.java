package pe.metro.stepdefinitions.hooks;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {
	  @Before
	    public static void configurarActor() {
	        OnStage.setTheStage(new OnlineCast());
	        theActorCalled("usuario");
	    }
}
