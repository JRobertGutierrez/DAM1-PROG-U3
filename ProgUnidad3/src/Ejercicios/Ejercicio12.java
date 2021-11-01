package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
	/**
	 * Pedir n�meros hasta que se teclee un 0, mostrar la suma de todos los n�meros
	 * introducidos.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();
		suma = numero;// almaceno el valor del primer n�mero en la variable suma

		while (numero != 0) // Mientras sea distinto de cero hago el bucle
		{
			numero++;
			System.out.println("Introduce otro n�mero: ");
			numero = sc.nextInt();
			suma = suma + numero; // Sumo al numero la suma inicial
		}
		// Muestro el valor final de la variable suma
		System.out.println("La suma de todos los n�meros introducidos es: " + suma);

		sc.close();
	}
}