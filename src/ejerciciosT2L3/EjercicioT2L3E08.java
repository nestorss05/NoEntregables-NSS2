package ejerciciosT2L3;

import java.util.Scanner;

public class EjercicioT2L3E08 {

	public static void main(String[] args) {

		/*
		 * Entera altura: se registrara la altura del teclado Entera arbolAlto: guardara
		 * la variable mas alta de todas las alturas
		 */
		int altura = 0, arbolAlto = 0;

		// Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);

		// Pide al usuario la altura de un arbol
		System.out.println("Dime la altura de un arbol");

		// La respuesta se guardara en la variable altura
		altura = sc.nextInt();

		// Bucle: mientras altura no sea -1...
		while (altura != -1) {

			// Si la altura introducida es mayor que arbolAlto...
			if (altura > arbolAlto) {

				// Alto procedera a ser esa altura
				arbolAlto = altura;

			}

			// Pide al usuario la altura de un arbol
			System.out.println("Dime la altura de un arbol");

			// La respuesta se guardara en la variable altura
			altura = sc.nextInt();

		}

		// Muestra la altura del arbol mas alto
		System.out.println("Altura del arbol mas alto: "+arbolAlto+" metros");

		// Cierra el Scanner
		sc.close();

	}

}
