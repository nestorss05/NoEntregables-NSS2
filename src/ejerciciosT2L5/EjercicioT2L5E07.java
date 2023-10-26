package ejerciciosT2L5;

import java.util.Scanner;

public class EjercicioT2L5E07 {

	public static void main(String[] args) {

		// numero: numero introducido por el usuario que acabara siendo el resultado
		// final
		int numero;

		// Abre el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero para registrarlo en la variable numero
		System.out.println("Escribe un numero");
		numero = sc.nextInt();

		/*
		 * For: i empezara con el valor introducido menos 1,
		 * i no puede ser 0 y se ira restando 1 a este en cada iteracion
		 * Despues, se procedera a ir multiplicando la variable numero por
		 * i continuamente hasta la finalizacion del bucle. 
		 * 
		 * 
		 * Ejemplo
		 * 
		 * numero = 5. i pasa a ser 4, y se multiplica por 5 (5*4=20)
		 * Despues, i sera 3, y se multiplicara por el resultado anterior
		 * (R=60), posteriormente el resultado anterior, y asi hasta llegar a 0, donde el
		 * bucle dejara de ejecutarse, teniendo en este caso un resultado de 20 (5*4*3*2*1=120)
		 */
		for (int i = numero - 1; i != 0; i--) {

			numero = numero * i;

		} // Fin for

		// Muestra el resultado final
		System.out.println(numero);

		// Cierra el Scanner
		sc.close();

	}

}
