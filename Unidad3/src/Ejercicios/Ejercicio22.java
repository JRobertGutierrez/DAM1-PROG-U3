package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
	/**
	 * Pedir 5 n�meros e indicar si alguno es m�ltiplo de 3.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		int numero = 0, cont1 = 0, multi3 = 0;
		Scanner sc = new Scanner(System.in);

		while (cont1 < 5) {
			System.out.println("Introduce un n�mero: ");
			numero = sc.nextInt();
			cont1++;

			if (numero % 3 == 0)
				multi3++;
		}
		sc.close();
		System.out.println("La cantidad de n�meros m�ltiplos de 3 es: " + multi3);
	}
}
