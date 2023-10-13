package ejerciciosT2_3;

import java.util.Scanner;

public class EjercicioT2_3_03 {

	public static void main(String[] args) {

		/*
		 * Registro y doy valor a las enteras num y numt num guardara el valor que
		 * pondra el usuario, y numTotal guardara cada valor de num y los ira sumando.
		 * La variable contador sera un contador para los numeros positivos que se
		 * introduzcan
		 */
		int num = 0, numTotal = 0, contador = 0;

		// Enciende el Scanner para leer datos del teclado
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero
		System.out.println("Escribe un numero");

		// Se guaradara la respuesta en la variable num
		num = sc.nextInt();

		// Bucle: Mientras que num sea igual o mayor que 0...
		while (num >= 0) {

			// La respuesta de num se sumara a lo que haya en numTotal
			numTotal = numTotal + num;

			// El contador empezara a ir sumando 1
			++contador;

			// Pide al usuario un numero
			System.out.println("Escribe un numero");

			// Se guaradara la respuesta en la variable num
			num = sc.nextInt();

		}

		/*
		 * El programa te mostrara la media de todos los numeros introducidos, excepto
		 * el negativo. Para ello, se mostrara la division de numTotal entre contador
		 */
		System.out.println((float) numTotal / contador);

		// Cierra el Scanner
		sc.close();

	}

}
