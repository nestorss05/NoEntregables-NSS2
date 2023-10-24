package ejerciciosT2L4;

import java.util.Scanner;

public class EjercicioT2L4E07 {

	public static void main(String[] args) {

		//num1: Primer numero introducido por el usuario
		int num1;
		
		//num2: Segundo numero introducido por el usuario
		int num2;
		
		//resultado: Resultado de las operaciones entre num1 y num2 
		float resultado = 0f;
		
		//salir: Booleana que se mantendra falsa hasta que 
		boolean salir = false;
		
		
		String opcion;
		
		//Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);

		// Pide al usuario que registre dos numeros
		System.out.println("Inserta dos numeros");

		// Guarda los dos resultados en sus respectivas variables, num1 y num2
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Se usara un nextLine para que el siguiente Scanner funcione
		sc.nextLine();
		do {

			// Do: Muestra las opciones y haz elegir al usuario una opcion, para que haga
			// una operacion determinada
			System.out.println("A. SUMAR LOS NUMEROS");
			System.out.println("B. RESTAR LOS NUMEROS");
			System.out.println("C. MULTIPLICAR LOS NUMEROS");
			System.out.println("D. DIVIDIR LOS NUMEROS");
			System.out.println("E. SALIR");

			// Nota: se pasara todo a mayusculas con toUpperCase
			opcion = sc.nextLine().toUpperCase();

			// Inicio Switch desde los casos A-E y otros
			switch (opcion) {

			case "A" -> {

				// A: Sumara los dos numeros
				resultado = (float) num1 + num2;

				// Muestra el resultado por pantalla
				System.out.println(resultado);

			} // Fin A

			case "B" -> {

				// B: Restara los dos numeros
				resultado = (float) num1 - num2;

				// Muestra el resultado por pantalla
				System.out.println(resultado);

			} // Fin B

			case "C" -> {

				// C: Multiplicara los dos numeros
				resultado = (float) num1 * num2;

				// Muestra el resultado por pantalla
				System.out.println(resultado);

			} // Fin C

			case "D" -> {

				// D: Dividira los dos numeros
				resultado = (float) num1 / num2;

				// Muestra el resultado por pantalla
				System.out.println(resultado);

			} // Fin D

			case "E" -> {

				// E: Sale del programa
				salir = true;

			} // Fin E

			default -> {

				// Otro: Opcion invalida
				System.out.println("La opcion elegida es invalida. Elige otra opcion valida.");

			} // Fin default

			} // Fin Switch

		} while (salir == false); // Fin Do While

		// Cierra el Scanner
		sc.close();

	}

}
