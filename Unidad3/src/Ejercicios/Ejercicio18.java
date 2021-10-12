package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
	/**
	 * Pedir 10 n�meros. Mostrar la media de los n�meros positivos, la media de los
	 * n�meros negativos y la cantidad de ceros (yo hago la prueba con 5 n�meros).
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0, posSum = 0, negSum = 0, ceros = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un n�mero: ");
			numero = sc.nextInt();

			if (numero > 0)
				posSum = posSum + numero; // Positivos

			else
				negSum = negSum + numero;// Negativos

			char[] digitos = String.valueOf(numero).toCharArray();

			for (char digito : digitos) {// Ceros

				if (digito == '0') {

					++ceros;
				}
			}
		}
		System.out.println("La suma de positivos es " + posSum);
		System.out.println("La suma de negativos es " + negSum);
		System.out.println("He encontrado " + ceros + " ceros");
		sc.close();
	}
}

/*
 * MI EXPLICACI�N: Dentro del bucle for donde voy aumentando de 7 en 7 he creado un
 * array de tipo char que he llamado digitos, donde voy a ir almacenando cada n�mero.
 * 
 * Con valueOf devuelvo la representacion de String del n�mero entero y con
 * toCharArray convierto el String a un nuevo car�cter del Array.
 * 
 * Despu�s con el bucle forEach voy a buscar los ceros car�cter a car�cter y cada vez
 * que encuentro uno incremento la variable ceros.
 * 
 * Por �ltimo muestro todos los ceros que he encontrado.
 */