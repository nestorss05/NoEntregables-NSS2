package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		//Registra la variable float nota, que se tratara de la nota que haya sacado el alumno
		float nota;
		
		//Inicia el Scanner para registrar datos por el teclado
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario la nota de un alumno
		System.out.println("Inserta la nota del alumno. La nota introducida debe ser un numero entre 0 y 10. Se admiten decimales.");
		
		//La nota introducida se guardara en la variable nota
		nota = sc.nextFloat();
		
		/*Se comprobara la nota que recibira el alumno. Rango permitido: 0 - 10
		Si la nota se sale del rango permitido, se le informara al usuario que la nota introducida no esta en el rango.*/
		if (nota>10 || nota<0) {
			
			System.out.println("La nota introducida no esta en el rango permitido (o es mayor que 10, o es menor que 0)");
		
		}
		
		//Si la nota es mayor o igual que un 9, la nota sera un SOBRESALIENTE
		else if (nota>=9) {
			
			System.out.println("Enhorabuena, tu nota es un SOBRESALIENTE. Has sacado un " + nota);
		
		}
		
		//Si la nota es entre 7 y 8.9, la nota sera un NOTABLE
		
		else if (nota>=7) {
			
			System.out.println("Muy bien, tu nota es un NOTABLE. Has sacado un " + nota);
		
		}
		
		//Si la nota es entre 6 y 6.9, la nota sera un BIEN
		
		else if (nota>=6) {
			
			System.out.println("No esta mal, tu nota es un BIEN. Has sacado un " + nota);
		
		}
		
		//Si la nota es entre 5 y 5.9, la nota sera un SUFICIENTE
		
		else if (nota>=5) {
			
			System.out.println("Podria estar mejor, pero has aprobado. Tu nota es un SUFICIENTE. Has sacado un " + nota);
		
		}
		
		//Si la nota es entre 0 y 4.9, la nota sera un INSUCIFIENTE. Aunque siendo un 4.9 se deberia redondear a un 5, ¿no crees? ¿Un 5 condicional al menos?
		
		else {
			
			System.out.println("Podria estar muchisimo mejor. Esfuerzate para la proxima, que tu nota es un INSUFICIENTE. Has sacado un " + nota);
		
		}
		
		//Cierra el Scanner.
		sc.close();
		
	}

}
