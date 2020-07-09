package in.co.gorest.hooks;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class GorestHook {

    private EnvironmentVariables envVars;
    
    @Before
    public void configurarElEscenario() {
        String baseUrl = envVars.optionalProperty("restapi.baseurl")
                .orElse("https://gorest.co.in");
        
        setTheStage(new OnlineCast());
        theActorCalled("actor").whoCan(CallAnApi.at(baseUrl));
    }

    @After
    public void cerrarElEscenario() {
        OnStage.drawTheCurtain();
    }
}
