package Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
	/**
	 * Leer un n�mero e indicar si es positivo o negativo. El proceso se repetir� hasta
	 * que se introduzca un 0
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();

		while (numero != 0) {

			if (numero >= 0)
				System.out.println("El n�mero " + numero + " es positivo");
			else
				System.out.println("El n�mero " + numero + " es negativo");
			System.out.println("Introduce otro n�mero: ");
			numero = sc.nextInt();
		}
		System.out.println("Has salido del programa");

		sc.close();
	}
}