package ejerciciosT2_4;

import java.util.Random;
import java.util.Scanner;

public class EjercicioT2_4_05 {

	public static void main(String[] args) {

		// aleatorio: estatica a la que se guardara el numero aleatorio
		int numeroAleatorio;

		// numero: respuesta del usuario
		int numero = 0;

		// Abre el Scanner y guardalo en la variable sc
		Scanner sc = new Scanner(System.in);

		// Abre el Random y guardalo en la variable aleatorio
		Random aleatorio = new Random();

		/*
		 * Bucle: Mientras que el numero no haya sido adivinado, se le preguntara
		 * continuamente al usuario por un numero
		 */

		do {

			// Se le asignara a ALEATORIO un numero aleatorio entre 1 y 100, pero continuamente
			numeroAleatorio = aleatorio.nextInt(1, 101);
			System.out.println("Adivina un numero");
			numero = sc.nextInt();
			if (numero < numeroAleatorio) {
				System.out.println("Mayor");
			}
			if (numero > numeroAleatorio) {
				System.out.println("Menor");
			}

		} while (numero != numeroAleatorio); // Fin del bucle

		//Se informara que los numeros son iguales y que has ganado
		System.out.println("Igual. GG");

		// Cierra el Scanner
		sc.close();

	}

}
