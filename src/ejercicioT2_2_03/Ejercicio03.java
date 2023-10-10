package ejercicioT2_2_03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//Registra las variables enteras num1 y num2, que almacenaran los datos registrados por el usuario
		int num1, num2;
		
		//Registra la variable string opcion, que recogera la opcion elegida posteriormente
		String opcion;
		
		//En cuanto a la variable resultado, es una float que guardara el resultado entre las dos
		float resultado=0f;
		
		//Registra el Scanner para registrar los datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario que registre dos numeros
		System.out.println("Inserta dos numeros");
		
		//Guarda los dos resultados en sus respectivas variables, num1 y num2
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//Se usara un nextLine para que el siguiente Scanner funcione
		sc.nextLine();
		
		//Muestra el menu para lo que se puede hacer con los dos numeros
		System.out.println("A. SUMAR LOS NUMEROS");
		System.out.println("B. RESTAR LOS NUMEROS");
		System.out.println("C. MULTIPLICAR LOS NUMEROS");
		System.out.println("D. DIVIDIR LOS NUMEROS");
		
		//Registra la opcion seleccionada en la variable opcion
		opcion=sc.nextLine().toUpperCase();
		
		//Dependiendo de la opcion, te sumara, restara, multiplicara, dividira o se negara a hacer la operacion
		switch(opcion) {
		
			case "A" ->{
				//A: Sumara los dos numeros
				resultado=(float)num1+num2;
			}
			
			case "B" ->{
				//B: Restara los dos numeros
				resultado=(float)num1-num2;
			}
			
			case "C" ->{
				//C: Multiplicara los dos numeros
				resultado=(float)num1*num2;
			}
			
			case "D" ->{
				//D: Dividira los dos numeros
				resultado=(float)num1/num2;
			}
			
			default ->{
				//Otro: Opcion invalida
				System.out.println("La opcion elegida es invalida. El programa procedera a detenerse");
				break;
			}
		
		}
		
		//Muestra el resultado por pantalla
		System.out.println(resultado);
		
		//Cierra el Scanner
		sc.close();
		
	}

}
