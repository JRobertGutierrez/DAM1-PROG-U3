package Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
	/**
	 * Dise�a una aplicaci�n que muestre las tablas de multiplicar del 1 al 10.
	 * (Pido el n�mero de la tabla que quiero imprimir y hago las operaciones)
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();// Almaceno n�mero

		System.out.println("****Tabla del "+numero+"****");
		for (int i = 1; i <= 10; i++)// Para i igual a 0; mientras que i sea menor o igual que 10; a�adimos 1 a i
			System.out.println(numero + " x " + i + " = " + (numero * i));// Muestro el n�mero multiplicado por i
		sc.close();
	}
}
