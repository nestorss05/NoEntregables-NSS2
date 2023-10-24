package ejerciciosT2L4;

import java.util.Random;	
import java.util.Scanner;

public class EjercicioT2L4E05 {

	public static void main(String[] args) {

		// aleatorio: variable a la que se guardara el numero aleatorio
		int numeroAleatorio;

		// numeroMinimo: numero minimo que podria adivinar la maquina. Por defecto es 1
		int numeroMinimo = 1;

		// numeroMaximo: numero minimo que podria adivinar la maquina. Por defecto es
		// 101
		int numeroMaximo = 101;

		// respuesta: la respuesta del ordenador
		String respuesta;

		// Abre el Scanner y guardalo en la variable sc
		Scanner sc = new Scanner(System.in);

		// Abre el Random y guardalo en la variable aleatorio
		Random aleatorio = new Random();

		//Informale que solo adivinaras numeros del 1 al 100
		System.out.println("Piensa en un numero del 1 al 100. Yo procedere a adivinarlo. ");
		
		/*
		 * Bucle: Mientras que el numero no haya sido adivinado por el ordenador, se le
		 * preguntara continuamente al usuario por un numero
		 */

		do {

			// Se le asignara a ALEATORIO un numero aleatorio entre 1 y 100, pero
			// continuamente, hasta que la maquina lo adivine

			numeroAleatorio = aleatorio.nextInt(numeroMinimo, numeroMaximo);

			// Te dira que el numero que penso, y te preguntara si vale o no
			System.out.println("He pensado en el numero " + numeroAleatorio + ". ¿Es igual, es mayor o es menor?");
			respuesta = sc.nextLine().toUpperCase();

			if (respuesta.equals("MAYOR")) {
				numeroMinimo = numeroAleatorio+1;
			} else if (respuesta.equals("MENOR")) {
				numeroMaximo = numeroAleatorio;
			} else if (!respuesta.equals("IGUAL")){
				System.out.println("Respuesta invalida.");
			}

		} while ((!respuesta.equals("IGUAL")) && numeroMinimo != numeroMaximo);
		// Fin del bucle

		// If: si el numero minimo es igual que el maximo
		if (numeroMinimo == numeroMaximo) {
			
			// Se informara que eres un troleador cara
			System.out.println("Eres un troleador cara");
			
		} else {
			
			// Se informara que los numeros son iguales y que has ganado
			System.out.println("Ja, lo he adivinado");
			
		} // Fin del If
		
		// Cierra el Scanner
		sc.close();

	}

}
