package ejerciciosT2_4;

import java.util.Scanner;

public class EjercicioT2_4_06 {

	public static void main(String[] args) {

		// respuesta1: eleccion del Jugador 1
		String respuesta1;

		// respuesta2: eleccion del Jugador 1
		String respuesta2;

		// juego: Debe ser S para que el juego pueda seguir ejecutandose
		String juego;

		// Abre el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle 1: Mientras que juego sea S
		do {

			// Bucle 2A: Jugador 1: Pregunta al usuario su jugada
			do {
				System.out.println("Jugador 1. Piedra, papel o tijera");
				respuesta1 = sc.nextLine().toUpperCase();
				if (respuesta1.equals("PAPELERA")) {
					// Papelera NO
					System.out.println("Que pesaito con la papelera, ¿no?");
				}
			} while (!(respuesta1.equals("PIEDRA")) && (!(respuesta1.equals("PAPEL")))
					&& (!(respuesta1.equals("TIJERA")))); // Fin del bucle 2A

			// Bucle 2B: Jugador 2: Pregunta al usuario su jugada
			do {
				System.out.println("Jugador 2. Piedra, papel o tijera");
				respuesta2 = sc.nextLine().toUpperCase();
				if (respuesta2.equals("PAPELERA")) {
					// Papelera NO
					System.out.println("Que pesaito con la papelera, ¿no?");
				}
			} while (!(respuesta2.equals("PIEDRA")) && (!(respuesta2.equals("PAPEL")))
					&& (!(respuesta2.equals("TIJERA")))); // Fin del bucle 2B

			// Switch 1: Respuestas TODAS 1
			switch (respuesta1) {
			case "PIEDRA" -> {
				// Switch 2A: Respuesta 2: PIEDRA
				switch (respuesta2) {
				case "PIEDRA" -> {
					System.out.println("EMPATE");
				}
				case "PAPEL" -> {
					System.out.println("HA GANADO EL JUGADOR 2");
				}
				case "TIJERA" -> {
					System.out.println("HA GANADO EL JUGADOR 1");
				}
				} // Fin Switch 2A
			}
			case "PAPEL" -> {
				// Switch 2B: Respuesta 2: PAPEL
				switch (respuesta2) {
				case "PIEDRA" -> {
					System.out.println("HA GANADO EL JUGADOR 1");
				}
				case "PAPEL" -> {
					System.out.println("EMPATE");
				}
				case "TIJERA" -> {
					System.out.println("HA GANADO EL JUGADOR 2");
				}
				} // Fin Switch 2B
			}
			case "TIJERA" -> {
				// Switch 2C: Respuesta 2: TIJERA
				switch (respuesta2) {
				case "PIEDRA" -> {
					System.out.println("HA GANADO EL JUGADOR 2");
				}
				case "PAPEL" -> {
					System.out.println("HA GANADO EL JUGADOR 1");
				}
				case "TIJERA" -> {
					System.out.println("EMPATE");
				}
				} // Fin Switch 2C
			}
			} // Fin Switch 1

			System.out.println("¿Quieres volver a jugar?");
			juego = sc.nextLine().toUpperCase();

		} while (juego.equals("S")); // Fin Bucle 1
		sc.close();
	}

}
