package ejerciciosT2_1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		//Registra la variable num, que guardara el numero que registrara el usuario
		int num;
		
		//Inicia el Scanner para registrar los datos por el teclado
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario que inserte un numero
		System.out.println("Inserta un numero. El numero introducido tiene que estar entre 0 y 99.999");
		
		//La respuesta sera guardada en la variable num
		num = sc.nextInt();
		
		//Rango: 0 a 99.999
		//Si el numero esta en el rango...
		if (num>=0 && num<=99999) {
			
			//Se procedera a comprobar cuantas cifras tiene el numero
			if (num>=0 && num<=9) {
				//Si el numero introducido es un numero entre 0 y 9, se le informara de que tiene 1 cifra
				System.out.println("El numero introducido tiene 1 cifra");
			}
			
			else if (num>=10 && num<=99) {
				//Si el numero introducido es un numero entre 10 y 99, se le informara de que tiene 2 cifras
				System.out.println("El numero introducido tiene 2 cifras");
			}
			
			else if (num>=100 && num<=999) {
				//Si el numero introducido es un numero entre 100 y 999, se le informara de que tiene 3 cifras
				System.out.println("El numero introducido tiene 3 cifras");
			}
			
			else if (num>=1000 && num<=9999) {
				//Si el numero introducido es un numero entre 1000 y 9999, se le informara de que tiene 4 cifras
				System.out.println("El numero introducido tiene 4 cifras");
			}
			
			else {
				//Si el numero introducido es un numero entre 10000 y 99999, se le informara de que tiene 5 cifras
				System.out.println("El numero introducido tiene 5 cifras");
			}
			
		}
		
		//En caso de que el numero este fuera del rango...
		else {
			
			//Se le informara al usuario que el numero no esta en el rango permitido
			System.out.println("El numero introducido no esta en el rango de 0 a 99.999");
		
		}
		
		//Cierra el Scanner.
		sc.close();

	}

}
