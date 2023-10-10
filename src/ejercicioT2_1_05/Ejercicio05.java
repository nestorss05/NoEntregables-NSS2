package ejercicioT2_1_05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Registra las variables enteras num1, num2 y num3, donde se guardaran los numeros insertados por el usuario
		int num1, num2, num3;
				
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
		
		//Pide al usuario el numero 3
		System.out.println("Inserta el numero 3");
						
		//La respuesta se guardara en la variable num2
		num3 = sc.nextInt();
				
		//Si num1 es mayor que num2 y num3...
		if (num1>num2 && num1>num3) {
					
			//Se comprobara si num2 es mayor que num3
			if (num2>num3) {
				
				//Se mostrara en pantalla el siguiente orden de numeros: num1, num2, num3
				System.out.println(num1 + "\n" + num2 + "\n" + num3);
			
			}
			
			//En caso de que num3 sea mayor que num2...
			else {
				
				//Se mostrara en pantalla el siguiente orden de numeros: num1, num3, num1
				System.out.println(num1 + "\n" + num3 + "\n" + num2);
			}
				
		}
				
		//Si no es asi, se comprobara si num2 es mayor que num1 y num3
		else if (num2>num1 && num2>num3){
			
			//Se comprobara si num1 es mayor que num3
			if (num1>num3) {
				
				//Se mostrara en pantalla el siguiente orden de numeros: num2, num1, num3
				System.out.println(num2 + "\n" + num1 + "\n" + num3);
			
			}
			
			//En caso de que num3 sea mayor que num1...
			else {
				
				//Se mostrara en pantalla el siguiente orden de numeros: num2, num3, num1
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
			
			}
					
		}
		
		//En caso de que num3 sea mayor que num1 y num2...
		else {
			
			//Se comprobara si num1 es mayor que num2
			if (num1>num2) {
				
				//Se mostrara en pantalla el siguiente orden de numeros: num3, num1, num2
				System.out.println(num3 + "\n" + num1 + "\n" + num2);
			
			}
			
			//En caso de que num2 sea mayor que num1...
			else {
				
				//Se mostrara en pantalla el siguiente orden de numeros: num3, num2, num1
				System.out.println(num3 + "\n" + num2 + "\n" + num1);
			
			}
			
		}
				
		//Cierra el Scanner.
		sc.close();
		
	}

}
