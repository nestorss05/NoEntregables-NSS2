package ejercicioT2_3_07;

import java.util.Scanner;

public class EjercicioT2_3_07 {

	public static void main(String[] args) {
		
		/*Se registra la variable resp, que sera la respuesta dada por el usuario
		Tambien se registra num, que sera el numero aleatorio:
		La variable num incluye Math.random, que generara un numero aleatorio. es 100 a 1, Puesto a que se empieza desde 0, y queremos que el numero aleatorio sea entre 1 y 100.*/
		int num=(int)(Math.random()*100+1), resp;
		
		//Se registra la booleana gana, que indicara si has ganado o no (por ahora no has ganado crack)
		boolean gana=false;
		
		//Inicia el Scanner para registrar datos por el teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle: mientras que no hayas ganado...
		while (gana==false) {
			
			//Pide al usuario un numero
			System.out.println("Escribe un numero");
			
			//La respuesta se guardara en la variable resp
			resp = sc.nextInt();
			
			//Si resp es igual a numero
			if (resp==num) {
				
				//Has adivinado el numero, enhorabuena.
				System.out.println("GG");
				
				//Ahora la variable gana sera true.
				gana=true;
				
			}
			
			//Si no has acertado, se revisara si el numero a adivinar es mayor que la respuesta
			else if (num>resp) {
				
				//Se le informara que el numero a adivinar es mayor que tu respuesta
				System.out.println("Mayor");
				
			}
			
			//Si es menor que la respuesta...
			else {
				
				//Se le informara que el numero a adivinar es menor que tu respuesta
				System.out.println("Menor");
				
			}
			
		}
		
		//Cierra el Scanner
		sc.close();
		
	}

}
