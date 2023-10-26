package ejerciciosT2L5;

import java.util.Scanner;

public class EjercicioT2L5E09 {

	public static void main(String[] args) {

		// numero: numero entero introducido por el usuario
		int numero;

		// contador: contador de numeros divisibles entre el numero introducido
		// por el usuario
		int contador=0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero y registralo en la variable numero
		System.out.println("Inserta un numero");
		numero = sc.nextInt();

		// If 1: si el numero es menor que 1
		if (numero < 1) {

			// Se le informara al usuario que el numero debe ser positivo o no 0
			System.out.println("Tiene que ser un numero positivo o que no sea 0 BURRO");

		} else {

			// For: i empezara en 1, debera ser menor o igual que numero, e ira sumando 1 en
			// cada iteracion
			for (int i = 1; i <= numero; i++) {

				// Si el numero entre i da como resto 0...
				if (numero % i == 0) {
					
					// Se sumara 1 al contador
					contador++;
					
				}

			} // Fin For

		} // Fin If 1
		
		// If 2: Si el contador es mayor que 2...
		if (contador>2) {
			
			// Se le informara que el numero no es primo
			System.out.println("El numero no es primo");
			
		} else {
			
			// If 2.1: Si el numero en cuestion es el 1...
			if (numero==1) {
				
				// Se le informara que el numero no es primo
				System.out.println("El numero no es primo. Motivo: 1 no es primo");
				
			} else {
				
				// Se le informara que el numero no es primo
				System.out.println("El numero es primo");
				
			} // Fin If 2.1
			
		} // Fin If 2

		// Cierra el Scanner
		sc.close();

	}

}
