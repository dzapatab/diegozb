package in.co.gorest.tasks;


import java.util.HashMap;
import java.util.Map;

import in.co.gorest.utils.CrearBody;
import in.co.gorest.utils.CrearCorreo;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class RealizarPeticion implements Task  {
	private String path;
	
	public RealizarPeticion(String path) 
	{
		this.path=path;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo( 	        		
	        		Post.to(path)
	                .with(  requestSpecification -> requestSpecification.headers(buildHeaders())
	                        .body(
	                        		CrearBody.conLaPlantilla("src/test/resources/templates/datosbasicos.json")
	                                .yElCorreo(CrearCorreo.GetRandomString(10)+"@hotmail.com")
	                                ).relaxedHTTPSValidation()));	         
	        SerenityRest.lastResponse().body().prettyPrint();   
	}

	   private Map<String, Object> buildHeaders() {
	        Map<String, Object> headers = new HashMap<>();
	        headers.put("Content-Type", "application/json");
	        headers.put("Authorization", "Bearer HTnPGhobc6TwQ9ManvI5zKZu9Hg7wGHzceNq");

	        return headers;
	    }
    public static RealizarPeticion usuarios(String path) {
        return Tasks.instrumented(RealizarPeticion.class,path);
    }

}
