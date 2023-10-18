package ejerciciosT2_3;

import java.util.Scanner;

public class EjercicioT2_3_07 {

	public static void main(String[] args) {

		// num: numero aleatorio generado por el ordenador
		int num = (int) (Math.random() * 100 + 1);
		
		// respuesta: respuesta dada por el usuario
		int respuesta = 0;

		// Inicia el Scanner para registrar datos por el teclado
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero
		System.out.println("Escribe un numero");

		// La respuesta se guardara en la variable respuesta
		respuesta = sc.nextInt();
		
		// Bucle: mientras que no hayas ganado o no pongas -1 como respuesta...
		while (num != respuesta && respuesta != -1) {

			/*
			 * Si no has acertado, se revisara si el numero a adivinar es mayor que la
			 * respuesta
			 */
			if (num > respuesta) {

				// Se le informara que el numero a adivinar es mayor que tu respuesta
				System.out.println("Mayor");

			}

			// Si es menor que la respuesta...
			else {

				// Se le informara que el numero a adivinar es menor que tu respuesta
				System.out.println("Menor");

			}
			
			// Pide al usuario un numero
			System.out.println("Escribe un numero");

			// La respuesta se guardara en la variable respuesta
			respuesta = sc.nextInt();

		}

		// Si respuesta es igual a numero
		if (respuesta == num) {

			// Has adivinado el numero, enhorabuena.
			System.out.println("GG");

		}
		
		// Si optas por poner -1...
		if (respuesta == -1) {

			// Si, hasta el programa es mas constante que tu, y te lo va a soltar en tu cara
			System.out.println("¿En serio te vas a rendir ya? Madre mia, que fuerte..");

		}
		
		// Cierra el Scanner
		sc.close();

	}

}
