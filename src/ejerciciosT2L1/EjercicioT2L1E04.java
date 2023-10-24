package ejerciciosT2L1;

import java.util.Scanner;

public class EjercicioT2L1E04 {
	
	public static void main(String[] args) {
		
		//Registra las variables enteras num1 y num2, donde se guardaran los numeros insertados por el usuario
		int num1, num2;
		
		//Inicia el Scanner para leer datos por el teclado
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario el numero 1
		System.out.println("Inserta el numero 1");
		
		//La respuesta se guardara en la variable num1
		num1 = sc.nextInt();
		
		//Pide al usuario el numero 2
		System.out.println("Inserta el numero 2");
		
		//La respuesta se guardara en la variable num2
		num2 = sc.nextInt();
		
		//Si num1 es mayor que num2...
		if (num1>num2) {
			
			//Se mostrara en pantalla num1, y despues num2
			System.out.println(num1 + "\n" + num2);
		
		}
		
		//Si no es asi...
		else {
			
			//Se mostrara en pantalla num2, y despues num1
			System.out.println(num2 + "\n" + num1);
			
		}
		
		//Cierra el Scanner.
		sc.close();
	}
	
}
