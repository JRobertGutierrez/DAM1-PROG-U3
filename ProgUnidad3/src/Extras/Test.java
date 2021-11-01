package Extras;

public class Test {
	/**
	 * Test para obtener el mensaje de la excepci�n aritm�tica by zero cuando dividimos
	 * un n�mero entre 0. Si igualo la variable b a 2 por ejemplo, mostrar�a el resultado
	 * 5 o si la igualo a 5 mostrar�a 2, pero siempre que dividamos entre 0 saltar� la
	 * excepci�n. 
	 * 
	 * Con getMessage() obtenemos los valores del error
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int a = 10, b = 0, c;

		try {
			c = a / b;

		} catch (ArithmeticException e) {
			System.out.println("Error. " + e.getMessage()); // Obtiene valores
			return;
		}
		System.out.println("Resultado:" + c);
	}
}
