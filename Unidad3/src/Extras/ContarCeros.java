package Extras;

public class ContarCeros {
	/**
	 * Programa que cuenta los ceros que hay en una cantidad de n�meros, en esta prueba
	 * voy a contar los que hay en los multiplos de 7 hasta 1000, aunque podemos variar
	 * el n�mero en el bucle y poner lo que necesitemos obtener.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int ceros = 0;

		for (int numero = 0; numero <= 1000; numero += 7) {

			char[] digitos = String.valueOf(numero).toCharArray();

			for (char digito : digitos) {

				if (digito == '0') {

					++ceros;
				}
			}
		}
		System.out.println("Cantidad de ceros: " + ceros);
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