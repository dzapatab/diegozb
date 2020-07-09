package in.co.gorest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

@Subject("el campo #campo")
public class ValorCampoServicio implements Question<String> {
    private final String campo;

    public ValorCampoServicio(String campo) {
        this.campo = campo;
    }

    @Override
    public String answeredBy(Actor actor) {
        return LastResponse.received().answeredBy(actor).jsonPath().getString(campo);
    }
}
