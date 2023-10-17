package ejerciciosT2_4;

import java.util.Scanner;

public class EjercicioT2_4_03 {

	public static void main(String[] args) {

		/*
		 * numero: contador para ir sumando los numeros hacia respuesta
		 * resultado: suma de todos los numeros de 1 hasta la variable numero 
		 * limite: limite que se introducira por teclado
		 */
		int numero = 0, resultado = 0, limite = 0;

		// Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);

		// Pide al usuario por un numero
		System.out.println("Inserta un numero");

		// La respuesta sera guardada en la variable limite
		limite = sc.nextInt();

		/*
		 * Bucle: Mientras que no se alcance el limite, se iran mostrando por pantalla
		 * los numeros a sumar
		 */
		do {

			++numero;

			/*
			 * If: Muestra el numero por pantalla: Aparte del numero: Si el numero es el
			 * limite, no mostrara un signo mas. En el caso contrario, si se mostrara un
			 * signo mas
			 */
			if (numero == limite) {
				System.out.print(numero);
			} else {
				System.out.print(numero + "+");
			} // Fin del if

			resultado = resultado + numero;

		} while (numero != limite); // Fin del bucle

		// Resultado final
		System.out.print("=" + resultado);

		// Cierra el Scanner
		sc.close();

	}

}
