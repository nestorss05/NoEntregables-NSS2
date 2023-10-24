package ejerciciosT2L2;

import java.util.Scanner;

public class EjercicioT2L2E02 {

	public static void main(String[] args) {
		
		//diasemana = variable byte que registrara el numero respectivo del dia de la semana
		byte diasemana;
		
		//Abre el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario un numero del 1 al 7
		System.out.println("Escribe un numero correspondiente al dia de la semana. El numero debe ser uno entre 1 y 7");
		
		//Registra la respuesta en la variable diasemana
		diasemana = sc.nextByte();
		
		//No vale poner el dia porque si, habra que poner en contexto primero
		System.out.println("El dia de la semana es:");
		
		//Se empezara a revisar cual numero coincide con un dia de la semana
		switch(diasemana) {
		
			case 1->{
				//Dia 1: Lunes
				System.out.println("Lunes");
			}
			case 2->{
				//Dia 2: Martes
				System.out.println("Martes");
			}
			case 3->{
				//Dia 3: Miercoles
				System.out.println("Miercoles");
			}
			case 4->{
				//Dia 4: Jueves
				System.out.println("Jueves");
			}
			case 5->{
				//Dia 5: Viernes
				System.out.println("Viernes");
			}
			case 6->{
				//Dia 6: Sabado
				System.out.println("Sabado");
			}
			case 7->{
				//Dia 7: Domingo
				System.out.println("Domingo");
			}
			default->{
				//Otra respuesta llevaria a un dia invalido
				System.out.println("Dia invalido. Recuerda, el numero debe ser entre 1 y 7, puesto a que una semana tiene 7 dias.");
			}
			
		}
		
		//Cierra el Scanner
		sc.close();
		
	}

}
