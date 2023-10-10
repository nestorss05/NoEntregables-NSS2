package ejercicioT2_2_04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//Registra las strings t1 y t2, donde se almacenaran los datos de los dos numeros a pasar a formato numerico
		String t1, t2;
		
		//Registra las variables num1 y num2, que seran los numeros convertidos de los Strings
		int num1=0, num2=0;
		
		//Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario por cuanto has sacado en la primera tirada
		System.out.println("Cuanto has sacado en la primera tirada");
		
		//Registra la respuesta en la variable t1
		t1=sc.nextLine().toUpperCase();
		
		//Pide al usuario por cuanto has sacado en la segunda tirada
		System.out.println("Cuanto has sacado en la segunda tirada");
		
		//Registra la respuesta en la variable t2
		t2=sc.nextLine().toUpperCase();
		
		//Se pasara el numero 1 de String a Entero
		switch (t1) {
		
			//UNO = num1 sera el valor 1
			case "UNO" -> {
				num1=1;
			}
			
			//DOS = num1 sera el valor 2
			case "DOS" -> {
				num1=2;
			}
			
			//TRES = num1 sera el valor 3
			case "TRES" -> {
				num1=3;
			}
			
			//CUATRO = num1 sera el valor 4
			case "CUATRO" -> {
				num1=4;
			}
			
			//CINCO = num1 sera el valor 5
			case "CINCO" -> {
				num1=5;
			}
			
			//SEIS = num1 sera el valor 6
			case "SEIS" -> {
				num1=6;
			}
			
			//Otro = num1 no podra recibir ningun valor
			default -> {
				System.out.println("El numero del dado 1 es invalido.");
			}
			
		}
		
		//Se pasara el numero 2 de String a Entero
		switch (t2) {
		
			//UNO = num2 sera el valor 1
			case "UNO" -> {
				num2=1;
			}
			
			//DOS = num2 sera el valor 2
			case "DOS" -> {
				num2=2;
			}
			
			//TRES = num2 sera el valor 3
			case "TRES" -> {
				num2=3;
			}
			
			//CUATRO = num2 sera el valor 4
			case "CUATRO" -> {
				num2=4;
			}
			
			//CINCO = num2 sera el valor 5
			case "CINCO" -> {
				num2=5;
			}
			
			//SEIS = num2 sera el valor 6
			case "SEIS" -> {
				num2=6;
			}
			
			//Otro = num2 no podra recibir ningun valor
			default -> {
				System.out.println("El numero del dado 2 es invalido.");
			}
			
		}
		
		//Muestra el resultado de la suma de los dos dados
		System.out.println(num1+num2);
		
		//Cierra el Scanner
		sc.close();
		
	}

}
