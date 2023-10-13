package ejerciciosT2_3;

import java.util.Scanner;

public class EjercicioT2_3_07 {

	public static void main(String[] args) {

		/*
		 * Se registra la variable respuesta, que sera la respuesta dada por el usuario
		 * Tambien se registra num, que sera el numero aleatorio: La variable num
		 * incluye Math.random, que generara un numero aleatorio. es 100 a 1, Puesto a
		 * que se empieza desde 0, y queremos que el numero aleatorio sea entre 1 y 100.
		 */
		int num = (int) (Math.random() * 100 + 1), respuesta = 0;

		// Se registra la booleana ganaste, que indicara si has ganado o no
		boolean ganaste = false;

		// Inicia el Scanner para registrar datos por el teclado
		Scanner sc = new Scanner(System.in);

		// Bucle: mientras que no hayas ganado o no pongas -1 como respuesta...
		while (ganaste == false) {

			// Pide al usuario un numero
			System.out.println("Escribe un numero");

			// La respuesta se guardara en la variable respuesta
			respuesta = sc.nextInt();

			// Si respuesta es igual a numero
			if (respuesta == num) {

				// Has adivinado el numero, enhorabuena.
				System.out.println("GG");

				// Se procedera a hacer un break para acabar el juego.
				ganaste = true;

			}

			// Si optas por poner -1...
			else if (respuesta == -1) {

				// Si, hasta el programa es mas constante que tu, y te lo va a soltar en tu cara
				System.out.println("¿En serio te vas a rendir ya? Madre mia, que fuerte..");

				// Despues, se procedera a hacer un break para acabar con el bucle.
				break;

			}

			/*
			 * Si no has acertado, se revisara si el numero a adivinar es mayor que la
			 * respuesta
			 */
			else if (num > respuesta) {

				// Se le informara que el numero a adivinar es mayor que tu respuesta
				System.out.println("Mayor");

			}

			// Si es menor que la respuesta...
			else {

				// Se le informara que el numero a adivinar es menor que tu respuesta
				System.out.println("Menor");

			}

		}

		// Cierra el Scanner
		sc.close();

	}

}
