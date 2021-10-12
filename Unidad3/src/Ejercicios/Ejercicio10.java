package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	/**
	 * Pedir n�meros hasta que se teclee uno negativo, y mostrar cu�ntos n�meros se han
	 * introducido.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0, cont = 0;
		System.out.println("Introduce un n�mero: ");
		n = sc.nextInt();

		while (n >= 0) {
			cont++;
			System.out.println("Introduce otro n�mero: ");
			n = sc.nextInt();
		}
		System.out.println("Has introducido " + cont + " n�meros");
		System.out.println("Has salido del programa");

		sc.close();
	}
}