package ejerciciosT2_4;

public class EjercicioT2_4_02 {

	public static void main(String[] args) {

		// numero: valor del numero que se mostrara en pantalla
		short numero = 0;

		// Inicio del bucle
		do {

			// Si el resto del numero entre 2 no es cero...
			if (numero % 2 == 0) {
				
				// Muestra el numero por pantalla
				System.out.println(numero);
			
			} // Fin del if

			// Suma 1 al numero
			++numero;

			// Mientras que el numero sea mayor o igual que 200

		} while (numero <= 200); // Fin del bucle

	}

}
