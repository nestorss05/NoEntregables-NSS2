package ejerciciosT2L5;

import java.util.Scanner;

public class EjercicioT2L5E01 {

	public static void main(String[] args) {

		// numeroLimite: Numero insertado por el usuario para poner limite a numero
		int numeroLimite;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero");
		numeroLimite = sc.nextInt();

		// Cierra el Scanner
		sc.close();

		// For: i empieza en 1, debera ser menor que numeroLimite, y se ira sumando 1 en
		// cada iteracion
		for (int i = 1; i <= numeroLimite; i++) {

			// Muestra el numero por pantalla
			System.out.println(i);

		} // Fin For

	}

}
