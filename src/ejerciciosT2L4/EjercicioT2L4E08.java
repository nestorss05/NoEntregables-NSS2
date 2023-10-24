package ejerciciosT2L4;

import java.util.Scanner;

public class EjercicioT2L4E08 {

	public static void main(String[] args) {

		// t1 y t2: datos de los dos numeros a pasar a formato numerico
		String t1;
		String t2;

		// num1 y num2: que seran los numeros convertidos de los Strings
		int num1 = 0;
		int num2 = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do While 1: Hasta que no saque un resultado valido, no se procedera en el
		// programa
		do {

			// Pide al usuario por cuanto has sacado en la primera tirada
			System.out.println("Cuanto has sacado en la primera tirada");

			// Registra la respuesta en la variable t1
			t1 = sc.nextLine().toUpperCase();

		} while (!t1.equals("UNO") && !t1.equals("DOS") && !t1.equals("TRES") && !t1.equals("CUATRO")
				&& !t1.equals("CINCO") && !t1.equals("SEIS")); // Fin Do While 1

		// Do While 2: Hasta que no saque un resultado valido, no se procedera en el
		// programa
		do {

			// Pide al usuario por cuanto has sacado en la segunda tirada
			System.out.println("Cuanto has sacado en la segunda tirada");

			// Registra la respuesta en la variable t2
			t2 = sc.nextLine().toUpperCase();

		} while (!t2.equals("UNO") && !t2.equals("DOS") && !t2.equals("TRES") && !t2.equals("CUATRO")
				&& !t2.equals("CINCO") && !t2.equals("SEIS")); // Fin Do While 2

		// Switch T1: Se pasara el numero 1 de String a Entero
		switch (t1) {

		// UNO = num1 sera el valor 1
		case "UNO" -> {
			num1 = 1;
		} // Fin Switch T1-1

		// DOS = num1 sera el valor 2
		case "DOS" -> {
			num1 = 2;
		} // Fin Switch T1-2

		// TRES = num1 sera el valor 3
		case "TRES" -> {
			num1 = 3;
		} // Fin Switch T1-3

		// CUATRO = num1 sera el valor 4
		case "CUATRO" -> {
			num1 = 4;
		} // Fin Switch T1-4

		// CINCO = num1 sera el valor 5
		case "CINCO" -> {
			num1 = 5;
		} // Fin Switch T1-5

		// SEIS = num1 sera el valor 6
		case "SEIS" -> {
			num1 = 6;
		} // Fin Switch T1-6

		} // Fin Switch T1

		// Switch T2: Se pasara el numero 2 de String a Entero
		switch (t2) {

		// UNO = num2 sera el valor 1
		case "UNO" -> {
			num2 = 1;
		} // Fin Switch T2-1

		// DOS = num2 sera el valor 2
		case "DOS" -> {
			num2 = 2;
		} // Fin Switch T2-2

		// TRES = num2 sera el valor 3
		case "TRES" -> {
			num2 = 3;
		} // Fin Switch T2-3

		// CUATRO = num2 sera el valor 4
		case "CUATRO" -> {
			num2 = 4;
		} // Fin Switch T2-4

		// CINCO = num2 sera el valor 5
		case "CINCO" -> {
			num2 = 5;
		} // Fin Switch T2-5

		// SEIS = num2 sera el valor 6
		case "SEIS" -> {
			num2 = 6;
		} // Fin Switch T2-6

		} // Fin Switch T2

		// Muestra el resultado de la suma de los dos dados
		System.out.println(num1 + num2);

		// Cierra el Scanner
		sc.close();

	}

}
