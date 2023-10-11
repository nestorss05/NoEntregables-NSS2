package ejercicioT2_3_04;

import java.util.Scanner;

public class EjercicioT2_3_04 {

public static void main(String[] args) {
		
		//Registro y doy valor a las enteras num y numt
		//num guardara el valor que pondra el usuario.
		int num = 1;
		
		//Enciende el Scanner para leer datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle: Mientras que num no sea 0...
		while (num!=0) {
			
			//Pide al usuario un numero
			System.out.println("Escribe un numero");
			
			//Se guaradara la respuesta en la variable num
			num = sc.nextInt();
			
			//Se revisara si el numero es impar o no. (primero se revisara si es 0 o no)
			if (num!=0) {
				
				//Si el numero introducido es par:
				if (num%2==0) {
					
					//Se le informara al usuario que su numero es par
					System.out.println("El numero introducido es par.");
				
				}
				
				//Si el numero introducido es impar
				else {
					
					//Se le informara al usuario que su numero es impar
					System.out.println("El numero introducido es impar.");
				
				}
			
			}
			
		}
		
		//Cierra el Scanner
		sc.close();
		
	}

}
