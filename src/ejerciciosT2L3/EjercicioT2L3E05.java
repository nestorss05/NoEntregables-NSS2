package ejerciciosT2L3;

import java.util.Scanner;

public class EjercicioT2L3E05 {

	public static void main(String[] args) {

		/*
		 * num guardara el valor que pondra el usuario, numPositivo guardara cada valor
		 * // de num que sea positivo y los ira sumando, mientras que numNegativo hara
		 * la // misma funcion // pero para los negativos. // contador sera el contador
		 * que tiene que llegar a 10, contadorCeros el // contador de los // ceros,
		 * contadorNegativos el de los numeros negativos.
		 */
		int num = 0, numPositivo = 0, numNegativo = 0, contador = 0, contadorCeros = 0, contadorNegativos = 0;

		// Enciende el Scanner para leer datos del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle: Hasta que el contador llegue a 10...
		while (contador < 10) {

			// Pide al usuario un numero
			System.out.println("Escribe un numero");

			// Se guaradara la respuesta en la variable num
			num = sc.nextInt();

			// Lo primero que se hara es sumar 1 al contador
			++contador;

			// Bucle: si el numero insertado es positivo...
			if (num > 0) {

				// La respuesta de num se sumara a lo que haya en numPositivo
				numPositivo = numPositivo + num;

			}

			// Else: si el numero es negativo...
			else if (num < 0) {

				// La respuesta de num se sumara a lo que haya en numNegativo
				numNegativo = numNegativo + num;

				// Tambien se sumara 1 al contador de numeros negativos
				++contadorNegativos;

			}

			// Else: si el numero es 0...
			else {

				// El contador de ceros procedera a sumarse uno mas
				++contadorCeros;

			}

		}

		// El programa te mostrara la suma de todos los numeros positivos introducidos.
		System.out.println("Suma de numeros positivos: " + numPositivo);

		// Despues, el programa te mostrara la media de los diez numeros introducidos.
		System.out.println("Media de numeros negativos: " + (float) numNegativo / contadorNegativos);

		// Por ultimo, el programa te mostrara la cantidad de ceros que has introducido
		System.out.println("Has introducido " + contadorCeros + " ceros");

		// Cierra el Scanner
		sc.close();

	}

}
