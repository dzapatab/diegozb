package pe.metro.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static pe.metro.exceptions.ErroresAssertion.ERROR_MOSTRANDO_PRODUCTO;
import static pe.metro.userinterfaces.Productos.VER_PRODUCTOS_EN_EL_CARRITO;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import pe.metro.drivers.DriverChrome;
import pe.metro.exceptions.ErroresAssertion;
import pe.metro.models.DatosDeCompra;
import pe.metro.questions.VerificarProducto;
import pe.metro.stepdefinitions.hooks.Hooks;
import pe.metro.tasks.AgregarProducto;
import pe.metro.tasks.BuscarProducto;

public class Metro {
	@Given("^El cliente abre la pagina web metro$")
	public void elClienteAbreLaPaginaWebMetro() {
		Hooks.configurarActor();
		theActorCalled("usuario").whoCan(
				BrowsingTheWeb.with(DriverChrome.web().inTheWebPage("https://www.metro.pe/especiales/cybermetro")));
	}

	@When("^Busca un producto$")
	public void buscaUnProducto(List<DatosDeCompra> datosDeCompra) {
		theActorInTheSpotlight().attemptsTo(BuscarProducto.queQuiereElCliente(datosDeCompra.get(0)));

	}

	@When("^Agrega el producto buscado al carrito de compras$")
	public void agregaElProductoBuscadoAlCarritoDeCompras() {
		theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarrito());

	}

	@Then("^verifica que se encuentre el producto agregado en el carrito de compras$")
	public void verificaQueSeEncuentreElProductoAgregadoEnElCarritoDeCompras(List<DatosDeCompra> datosDeCompra) {
		theActorInTheSpotlight().should(seeThat(VerificarProducto.queApareceEnPantalla(VER_PRODUCTOS_EN_EL_CARRITO),
				equalTo(datosDeCompra.get(0).getTelevisor())).orComplainWith(ErroresAssertion.class,
						ERROR_MOSTRANDO_PRODUCTO));

	}
}
