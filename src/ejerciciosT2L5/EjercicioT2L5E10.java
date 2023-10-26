package ejerciciosT2L5;

import java.util.Scanner;

public class EjercicioT2L5E10 {

	public static void main(String[] args) {

		// numeroA: primer numero introducido por el usuario
		int numeroA;

		// numeroA: segundo numero introducido por el usuario
		int numeroB;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario el numero A
		System.out.println("Inserta el numero A");
		numeroA = sc.nextInt();

		// Do: Pide al usuario el numero B
		do {

			System.out.println("Inserta el numero B. Debe ser mayor que A");
			numeroB = sc.nextInt();

		} while (numeroA > numeroB); // Fin Do While

		// For: i sera el valor de numeroA, debera ser menor o igual a numeroB, e ira
		// sumando 1 en cada iteracion. Se iran mostrando los numeros por pantalla
		for (int i = numeroA; i <= numeroB; i++) {

			System.out.println(i);

		} // Fin For

		// Cierra el Scanner
		sc.close();

	}

}
