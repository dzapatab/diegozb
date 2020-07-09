package pe.metro.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Productos {
	public static final Target AGREGAR_AL_CARRITO = Target.the("Item que se busco para añadir al carrito")
			.locatedBy("//span[contains (text (), 'Agregar al carrito')]");
		
	public static final Target CARRITO = Target.the("Icono para ver lo que contiene el carrito")
			.locatedBy("//button[@class='btn red minicart__action--toggle-open food-site']");

	public static final Target VER_CARRITO = Target.the("Item que se busco para añadir al carrito")
			.locatedBy("(//span[contains (text (), 'Ver carrito')])[1]");
	
	public static final Target VER_PRODUCTOS_EN_EL_CARRITO = Target.the("Objeto que contiene el articulo buscado dentro del carrito")
			.locatedBy("//div//a[@class='product-item__name']");

}
