package ejerciciosT2L4;

import java.util.Scanner;

public class EjercicioT2L4E04 {

	public static void main(String[] args) {

		/*
		 * NUMERO: valor estatico del numero que se mostrara en pantalla
		 * resultado: resultado del numero por el multiplicador
		 * multiplicador: numero que se ira sumando continuamente hasta que llegue a 10
		 */
		
		int resultado = 0, multiplicador = 0;
		final int NUMERO;
		
		// Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);

		// Pide al usuario por un numero
		System.out.println("Inserta un numero");

		// La respuesta sera guardada en la variable limite
		NUMERO = sc.nextInt();

		/*
		 * Bucle: Mientras que no se alcance el limite, se iran mostrando por pantalla
		 * los numeros a sumar
		 */
		do {

			++multiplicador;

			resultado=NUMERO*multiplicador;
			
			System.out.println(NUMERO + " x " + multiplicador + " = " + resultado);

			//Mientras que el multiplicador sea menor que 10...
		} while (multiplicador<10); // Fin del bucle

		// Cierra el Scanner
		sc.close();

	}

}
