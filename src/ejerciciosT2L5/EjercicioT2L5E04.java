package ejerciciosT2L5;

import java.util.Scanner;

public class EjercicioT2L5E04 {

	public static void main(String[] args) {

		// numeroLimite: Numero insertado por el usuario para poner limite a numero
		int numeroLimite;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero");
		numeroLimite = sc.nextInt();

		// Cierra el Scanner
		sc.close();

		// For: i empieza en 3 (puesto a que 1 y 2 no son multiplos de 3),
		// debera ser menor que numeroLimite, y se ira sumando 3 en cada iteracion
		for (int i = 3; i <= numeroLimite; i = i + 3) {

			// Muestra el numero por pantalla
			System.out.println(i);

		} // Fin For

	}

}
