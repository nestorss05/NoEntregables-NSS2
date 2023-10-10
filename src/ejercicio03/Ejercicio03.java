package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//Registra la variable float num, que registrara el numero insertado por el usuario
		float num;
		
		//Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario que inserte un numero
		System.out.println("Introduce un numero");
		
		//El numero insertado por el usuario se guardara en la variable num
		num = sc.nextFloat();
		
		//Si el numero es mayor que -1, menor que 1, y no es 0...
		if (-1<num && num<1 && num!=0) {
			
			//Se le informara al usuario que el numero es casi 0
			System.out.println("El numero es casi 0");
		
		}
		
		//Si no es asi...
		else {
			
			//Se le informara al usuario que el numero no es casi 0
			System.out.println("El numero no esta en el rango.");
			
			//De paso, tambien se le informara al usuario el rango de numeros permitidos
			System.out.println("El rango de casi 0 es, o mayor que -1, o menor que 1. El 0 no forma parte del rango.");
		
		}
		
		//Cierra el Scanner.
		sc.close();

	}
}
