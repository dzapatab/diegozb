package pe.metro.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static pe.metro.userinterfaces.Productos.AGREGAR_AL_CARRITO;
import static pe.metro.userinterfaces.Productos.CARRITO;
import static pe.metro.userinterfaces.Productos.VER_CARRITO;
public class AgregarProducto implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(Click.on(AGREGAR_AL_CARRITO));
	actor.attemptsTo(Click.on(CARRITO));
	actor.attemptsTo(Click.on(VER_CARRITO));
		
	}
	public static AgregarProducto alCarrito() {
		return Tasks.instrumented(AgregarProducto.class);
	}
}
