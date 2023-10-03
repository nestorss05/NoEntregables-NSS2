package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		//Registra las variables enteras num1 y num2, que almacenaran los datos que introducira el usuario
		int num1, num2;
		
		//Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Se le pedira al usuario un numero
		System.out.println("Introduce un numero");
		
		//El numero introducido se guardara en la variable num1
		num1=sc.nextInt();
		
		//Se le pedira al usuario otro numero
		System.out.println("Introduce otro numero");
		
		//El numero introducido se guardara en la variable num1
		num2=sc.nextInt();
		
		//Si num1 es igual a num2...
		
		if (num1==num2) {
			
			//Se le informara al usuario que los dos numeros son iguales
			System.out.println("Los numeros son iguales");
		
		}
		
		//Si no es asi...
		
		else {
			
			//Se le informara al usuario que los dos numeros no son iguales
			System.out.println("Los numeros no son iguales");
		
		}
		
		//Cierra el Scanner
		sc.close();
		
	}
	
}
