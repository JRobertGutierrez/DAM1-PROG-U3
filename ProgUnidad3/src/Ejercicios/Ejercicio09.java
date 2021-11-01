package Ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
	/**
	 * Leer n�meros hasta que se introduzca un 0. Para cada uno indicar si es par o
	 * impar.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero = 0;

		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();

		while (numero != 0) {
			if (numero % 2 == 0)
				System.out.println("El n�mero " + numero + " es par");
			else
				System.out.println("El n�mero " + numero + " es impar");
			System.out.println("Introduce otro n�mero: ");
			numero = sc.nextInt();
		}
		System.out.println("Has salido del programa");
		sc.close();
	}
}
