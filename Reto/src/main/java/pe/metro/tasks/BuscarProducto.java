package pe.metro.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pe.metro.interactions.EsperarDisponibilidad;
import pe.metro.models.DatosDeCompra;

import static pe.metro.userinterfaces.Especiales.BUSQUEDA;
import static pe.metro.userinterfaces.Especiales.PRODUCTO_ELEGIDO;
import static pe.metro.userinterfaces.Especiales.ALERTA_ENTRADA;
import static pe.metro.userinterfaces.Especiales.VER_TODOS_LOS_RESULTADOS;;
public class BuscarProducto implements Task {

	private DatosDeCompra datosDeCompra;

	public BuscarProducto(DatosDeCompra datosDeCompra) {
		this.datosDeCompra = datosDeCompra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ALERTA_ENTRADA));		
		actor.attemptsTo(Enter.theValue(datosDeCompra.getTelevisor()).into(BUSQUEDA));
		actor.attemptsTo(EsperarDisponibilidad.delElemento(VER_TODOS_LOS_RESULTADOS));
		actor.attemptsTo(Click.on(VER_TODOS_LOS_RESULTADOS));
		actor.attemptsTo(Click.on(PRODUCTO_ELEGIDO.of(datosDeCompra.getTelevisor())));
	
	
	}

	public static BuscarProducto queQuiereElCliente(DatosDeCompra datosDeCompra) {
		return Tasks.instrumented(BuscarProducto.class, datosDeCompra);
	}
}
