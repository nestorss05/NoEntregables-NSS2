package ejerciciosT2_3;

import java.util.Scanner;

public class EjercicioT2_3_06 {

	public static void main(String[] args) {
		
		/*Se registraran las siguientes variables enteras:
		edad: la edad introducida por el usuario
		totedad: la suma de todas las edades introducidas por el usuario, menos la ultima negativa
		cont: el contador de cuantas edades has introducido
		mayoredad: el contador de cuantos alumnos son mayores de edad*/
		int edad=0, totedad=0, cont=-1, mayoredad=0;
		
		//Se registra el scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle: mientras que la edad sea mayor o igual que 0...
		while (edad>=0) {
			
			//Se empezara a sumar el contador
			cont=++cont;
			
			//De paso, la edad total tambien se suma con esta variable
			totedad=totedad+edad;
			
			//Pide al usuario la edad de un alumno
			System.out.println("Dime la edad de un alumno");
			
			//La respuesta se guaradara en la variable edad
			edad=sc.nextInt();
			
			//Si la edad es mayor o igual a 18...
			if (edad>=18) {
				
				//Se sumara 1 al contador de la variable mayoredad
				mayoredad=++mayoredad;
			
			}
		}
		
		//Se mostrara la edad conjunta de todos los alumnos
		System.out.println("Edad de "+cont+" alumnos juntos: "+totedad);
		
		//Se mostrara la media de la edad de los alumnos
		System.out.println("Edad media de los alumnos: " + totedad/cont);
		
		//Se mostrara la cantidad de alumnos que son mayores de edad
		System.out.println("Alumnos mayores de edad: " + mayoredad);
		
		//Cierra el Scanner
		sc.close();
		
	}

}
