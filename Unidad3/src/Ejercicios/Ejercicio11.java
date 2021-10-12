package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	/*
	 * Realizar un juego para adivinar un n�mero. Para ello generar un n�mero N aleatorio
	 * entre 1 y 20, y luego ir pidiendo n�meros indicando �mayor� o �menor� seg�n sea
	 * mayor o menor con respecto a N. El proceso termina cuando el usuario acierta
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Genero un n�mero aleatorio del 1 al 20
		int secreto = (int) (Math.random() * 20) + 1;
		// System.out.println("El n�mero secreto generado es el "+secreto);
		int numero = 0;

		do {
			System.out.println("Introduce un n�mero del 1 al 20: ");
			numero = sc.nextInt();

			if (numero > secreto)// Si n�mero es mayor que secreto
				System.out.println("El n�mero secreto es menor");

			if (numero < secreto)// Si n�mero es menor que secreto
				System.out.println("El n�mero secreto es mayor");

		} while (numero != secreto);// Mientras el n�mero es distinto del secreto vuelve

		System.out.println("El n�mero correcto, enhorabuena");

		sc.close();
	}
}