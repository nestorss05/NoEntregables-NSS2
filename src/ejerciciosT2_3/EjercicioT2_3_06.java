package ejerciciosT2_3;

import java.util.Scanner;

public class EjercicioT2_3_06 {

	public static void main(String[] args) {

		/*
		 * Se registraran las siguientes variables enteras:
		 * edad: la edad introducida por el usuario
		 * edadTotal: la suma de todas las edades introducidas por el usuario, menos la ultima negativa
		 * contador: el contador de cuantas edades has introducido
		 * mayorEdad: el contador de cuantos alumnos son mayores de edad
		 */
		int edad = 0, edadTotal = 0, contador = 0, mayorEdad = 0;

		// Se registra el scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);

		// Pide al usuario la edad de un alumno
		System.out.println("Dime la edad de un alumno");

		// La respuesta se guaradara en la variable edad
		edad = sc.nextInt();

		// Bucle: mientras que la edad sea mayor o igual que 0...
		while (edad >= 0) {

			// Se empezara a sumar el contador
			++contador;

			// De paso, la edad total tambien se suma con esta variable
			edadTotal = edadTotal + edad;

			// Si la edad es mayor o igual a 18...
			if (edad >= 18) {

				// Se sumara 1 al contador de la variable mayoredad
				++mayorEdad;

			}
			
			// Pide al usuario la edad de un alumno
			System.out.println("Dime la edad de un alumno");

			// La respuesta se guaradara en la variable edad
			edad = sc.nextInt();
						
		}

		/*
		 * Se mostrara la edad conjunta de todos los alumnos Sin embargo, quiero que no
		 * hayan faltas de ortografia, por lo que se utilizara un if/else para modificar
		 * minimamente la frase
		 */
		if (contador == 1) {

			// Si el contador es 1, se hablara en singular
			System.out.println("Edad de " + contador + " alumno: " + edadTotal);

		}

		else {

			// Si el contador es 1, se hablara en plural
			System.out.println("Edad de " + contador + " alumnos juntos: " + edadTotal);

		}

		// Se mostrara la media de la edad de los alumnos
		System.out.println("Edad media de los alumnos: " + edadTotal / contador);

		// Se mostrara la cantidad de alumnos que son mayores de edad
		System.out.println("Alumnos mayores de edad: " + mayorEdad);

		// Cierra el Scanner
		sc.close();

	}

}
