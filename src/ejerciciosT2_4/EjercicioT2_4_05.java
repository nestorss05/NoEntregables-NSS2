package ejerciciosT2_4;

import java.util.Random;
import java.util.Scanner;

public class EjercicioT2_4_05 {

	public static void main(String[] args) {

		// ALEATORIO: estatica a la que se guardara el numero aleatorio
		final int ALEATORIO;

		// numero: respuesta del usuario
		int numero = 0;

		// Abre el Scanner y guardalo en la variable sc
		Scanner sc = new Scanner(System.in);

		// Abre el Random y guardalo en la variable aleatorio
		Random aleatorio = new Random();

		// Se le asignara a ALEATORIO un numero aleatorio entre 1 y 100
		ALEATORIO = aleatorio.nextInt(1, 101);

		/*
		 * Bucle: Mientras que el numero no haya sido adivinado, se le preguntara
		 * continuamente al usuario por un numero
		 */

		do {

			System.out.println("Adivina un numero");
			numero = sc.nextInt();
			if (numero < ALEATORIO) {
				System.out.println("Mayor");
			}
			if (numero > ALEATORIO) {
				System.out.println("Menor");
			}

		} while (numero != ALEATORIO); // Fin del bucle

		//Se informara que los numeros son iguales y que has ganado
		System.out.println("Igual. GG");

		// Cierra el Scanner
		sc.close();

	}

}
