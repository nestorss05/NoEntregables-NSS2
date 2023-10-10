package ejercicioT2_2_01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Nota = variable byte que registrara la nota del usuario
		byte nota;
		
		//Abre el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario una nota
		System.out.println("Inserta una nota. El numero debe ser un entero entre 0 y 10");
		
		//Registra la respuesta en la variable byte
		nota = sc.nextByte();
		
		//Se empezara a revisar cual es la nota de cada usuario
		switch(nota) {
		
			case 0,1,2,3,4->{
				
				//Notas 0 - 4: Insuficiente
				System.out.println("Insuficiente. Esfuerzate mas para la siguiente.");
			
			}
			
			case 5->{
				
				//Nota 5: Suficiente
				System.out.println("Suficiente. No esta mal, pero deberias esforzarte un poco mas.");
			
			}
			
			case 6->{
				
				//Nota 6: Bien
				System.out.println("Bien. Pero podria estar bien esforzarte un poco mas");
			
			}
			
			case 7,8->{
				
				//Notas 7 - 8: Notable
				System.out.println("Notable. Muy bien, sigue asi.");
			
			}
			
			case 9,10->{
				
				//Notas 9 - 10: Sobresaliente
				System.out.println("Sobresaliente. Enhorabuena.");
			
			}
			
			default->{
				
				//Otra respuesta llevaria a una nota invalida
				System.out.println("Nota invalida. Recuerda, el numero debe ser un entero entre 0 y 10");
			
			}
			
		}
		
		//Cierra el Scanner
		sc.close();
		
	}

}
