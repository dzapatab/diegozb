package in.co.gorest.questions;



import net.serenitybdd.screenplay.Question;

public class LaRespuestaDelServicio {
    private LaRespuestaDelServicio() {
    }

    public static Question<String> obtenerCampo(String campo) {
        return new ValorCampoServicio(campo);
    }
}