package Extras;

import java.util.Scanner;

public class BloquesConsola {
	/**
	 * Pedir un n�mero N, y mostrar todos los n�meros del 1 al N. Voy haciendo bloques de
	 * los n�meros que yo crea conveniente en este ejemplo he puesto de 10 en 10
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0, cont = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();

		if (numero >= 1) {
			for (int i = 1; i <= numero; i++) {
				System.out.print(i + " ");
				// ********Block start**********//
				cont++;
				if (cont == 10) {
					System.out.println("\n");
					cont = 0;
				} // **********Block end**********//
			}
		}
		System.out.println("Has salido del programa");
		sc.close();
	}
}
