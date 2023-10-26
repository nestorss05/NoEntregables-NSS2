package ejerciciosT2L5;

import java.util.Scanner;

public class EjercicioT2L5E05 {

	public static void main(String[] args) {

		// numero: Numero insertado por el usuario para poner limite a numero
		int numero;

		// media: Media entre los 10 numeros
		float media = 0f;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For: i empieza en 1, debera ser menor que 10, y se ira sumando 1 en
		// cada iteracion

		// El programa pedira al usuario que inserte un numero, y lo acumulara en media
		for (int i = 1; i <= 10; i++) {

			System.out.println("Escribe un numero");
			numero = sc.nextInt();
			media = media + numero;

		} // Fin For

		// Divide todos los numeros entre 10 y muestralo por pantalla
		media = media / 10;
		System.out.println(media);

		// Cierra el Scanner
		sc.close();

	}

}
