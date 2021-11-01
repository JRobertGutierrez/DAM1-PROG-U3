package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
	/**
	 * Pedir n�meros hasta que se introduzca uno negativo y calcular la media.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 1;
		int suma = 0;
		int contador = 0;

		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();

		while (numero >= 0) {

			suma += numero;
			contador++;

			System.out.println("Introduce un n�mero: ");
			numero = sc.nextInt();
		}
		System.out.println("La media de los n�meros: " + (suma / contador));
		sc.close();
	}
}
