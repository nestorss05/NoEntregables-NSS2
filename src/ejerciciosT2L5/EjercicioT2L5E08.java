package ejerciciosT2L5;

import java.util.Scanner;

public class EjercicioT2L5E08 {

	public static void main(String[] args) {

		// nota: notas introducidas por el usuario
		float nota;

		// suspensos: alumnos suspensos que tengan menos de un 5
		int suspensos = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: i empieza en 5 (son 5 alumnos), no puede ser 0 y se ira restando 1 en
		// cada iteracion

		// Se le pedira al usuario que inserte la nota del alumno. Posteriormente se
		// comprobara si ha suspendido, que en caso de ser asi, se le sumara 1 a la
		// variable suspensos
		for (int i = 5; i != 0; i--) {

			System.out.println("Inserta la nota de un alumno");
			nota = sc.nextInt();

			if (nota < 5) {
				suspensos++;
			}

		} // Fin For

		// Si suspensos no es 0...
		if (suspensos != 0) {
			
			// Se le informara los suspensos del curso
			System.out.println("Hay " + suspensos + " alumnos que suspendieron y no sobrevivieron al curso");
		
		} else {
			
			// Se le informara que nadie suspendio
			System.out.println("No hay suspensos, todos han sobrevivido al curso");
		
		}

		// Cierra el Scanner
		sc.close();

	}

}
