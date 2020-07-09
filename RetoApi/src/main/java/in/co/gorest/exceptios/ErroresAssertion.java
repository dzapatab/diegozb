package in.co.gorest.exceptios;

public class ErroresAssertion extends AssertionError{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public static final String ERROR_VALIDANDO_DATA = "No se validó la data correctamente";
	
	
	public ErroresAssertion(String message) {
		   super(message);

	    }
	 
	    public ErroresAssertion(String message, Throwable testErrorException) {
	        super(message, testErrorException);

	    }
}
