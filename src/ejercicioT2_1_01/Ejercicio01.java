package ejercicioT2_1_01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Registra la variable entera num, para almacenar el numero
		int num;
		
		//Inicia el Scanner para registrar los datos por el teclado
		Scanner sc = new Scanner(System.in);
		
		//Se le pedira al usuario que introduzca un numero
		System.out.println("Introduce un numero");
		
		//El numero introducido se guardara en la variable num
		num = sc.nextInt();
		
		//Si el resto del numero entre 2 es 1...
		if (num%2==1) {
			
			//Se le informara al usuario que el numero introducido es impar
			System.out.println("El numero es impar");
		
		}
		
		//Si no es asi...
		
		else {
			
			//Se le informara al usuario que el numero introducido es par
			System.out.println("El numero es par");
		
		}
		
		//Cierra el Scanner.
		sc.close();
	
	}

}
