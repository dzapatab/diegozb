package pe.metro.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Especiales {

	
	public static final Target BUSQUEDA = Target.the("Barra de busqueda").
			locatedBy("//input[@id='search-autocomplete-input']");
	
	public static final Target PRODUCTO_ELEGIDO = Target.the("Item que se busco para añadir al carrito")
			.locatedBy("//a[contains (text (), '{0}')]");
	
	
	public static final Target VER_TODOS_LOS_RESULTADOS = Target.the("Ver todos los resultados")
			.locatedBy("//span[contains (text (), 'Ver todos los resultados')]");
	
	public static final Target ALERTA_ENTRADA = Target.the("Item que se busco para añadir al carrito")
			.locatedBy("//button[@id ='onesignal-popover-cancel-button']");
	
	
}
