package ejerciciosT2_2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//La string letracnt sera para registrar la letra del carnet de conducir
		String letracnt;
		
		//Enciende el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario la letra del carnet de conducir
		System.out.println("Dime el tipo de carnet de conducir, segun su letra (y numero si hace falta)");
		
		//El resultado se registrara en letracnt
		letracnt = sc.nextLine().toUpperCase();
		
		//Se registrara la letra del carnet
		switch (letracnt) {
		
			//E = Remolques
			case "E" -> {
				System.out.println("El carnet sirve para remolques.");
			}
			
			//D = Autobuses
			case "D" -> {
				System.out.println("El carnet sirve para autobuses.");
			}
			
			//C1 a C5 = Camiones
			case "C1","C2","C3","C4","C5" -> {
				System.out.println("El carnet sirve para camiones.");
			}
			
			//A = Motocicletas
			case "A" -> {
				System.out.println("El carnet sirve para motocicletas.");
			}
			
			//B1 y B2 = Automoviles
			case "B1","B2" -> {
				System.out.println("El carnet sirve para automoviles.");
			}
			
			//Otro = Categoria no contemplada
			default -> {
				System.out.println("Categoría no contemplada");
			}
			
		}
		
		//Cierra el Scanner
		sc.close();
		
	}

}
