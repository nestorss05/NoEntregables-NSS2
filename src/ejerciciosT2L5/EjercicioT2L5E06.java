package ejerciciosT2L5;

public class EjercicioT2L5E06 {

	public static void main(String[] args) {

		// sumaImpares: Numero impar que se ira sumando de 2 en 2
		int sumaImpares = 1;

		// numeroFinal: Suma de los 10 numeros
		int numeroFinal = 0;

		// For: La variable i empieza en 1, debera ser menor que 10, y se ira
		// sumando 1 en cada iteracion

		// Cada numero que se almacene en numero se ira almacenando en numeroFinal
		for (int i = 1; i <= 10; i++) {

			numeroFinal += sumaImpares;
			sumaImpares += 2;

		} // Fin For

		// Muestra el resultado por pantalla
		System.out.println(numeroFinal);

	}

}
