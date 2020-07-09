package pe.metro.exceptions;

public class ErroresAssertion extends AssertionError {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public static final String ERROR_MOSTRANDO_PRODUCTO = "No se mostró el producto elegido en el front";
	
	
	public ErroresAssertion(String message) {
		   super(message);

	    }
	 
	    public ErroresAssertion(String message, Throwable testErrorException) {
	        super(message, testErrorException);

	    }
}
