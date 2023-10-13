package ejerciciosT2_3;

import java.util.Scanner;

public class EjercicioT2_3_01 {
	
	public static void main(String[] args) {
		
		//Registro y doy valor a las enteras num y numt
		//num guardara el valor que pondra el usuario, y numt guardara cada valor de num y los ira sumando.
		int num = 0, numt = 0;
		
		//Enciende el Scanner para leer datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle: Mientras que num sea igual o mayor que 0...
		while (num>=0) {
			
			//La respuesta de num se sumara a lo que haya en numt
			numt = numt+num;
			
			//Pide al usuario un numero
			System.out.println("Escribe un numero");
			
			//Se guaradara la respuesta en la variable num
			num = sc.nextInt();
			
		}
		
		//El programa te mostrara la suma de todos los numeros introducidos, excepto el negativo.
		System.out.println(numt);
		
		//Cierra el Scanner
		sc.close();
		
	}
	
}
