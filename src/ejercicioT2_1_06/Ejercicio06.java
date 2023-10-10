package ejercicioT2_1_06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		//Registra las variables estaticas enteras a, b y c, que en este caso seran las coeficientes de la ecuacion que se le preguntaron al usuario
		final int a, b, c;
		
		//Registra las variables float soli1 y soli2, que seran las dos soluciones de la ecuacion
		float soli1, soli2;
		
		//La variable raiz servira para saber si hay solucion o no
		float raiz;

		//Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Explica al usuario lo que se hara
		System.out.println("Vamos a hacer una ecuacion de segundo grado");
		System.out.println("");
		System.out.println("  2");
		System.out.println("ax  + bx + c = 0");
		System.out.println("");
		
		//Pide al usuario la coeficiente a
		System.out.println("Inserta el valor de a");
		
		//La respuesta sera guardada en la variable a
		a = sc.nextInt();
		
		//Pide al usuario la coeficiente b
		System.out.println("Inserta el valor de b");
				
		//La respuesta sera guardada en la variable a
		b = sc.nextInt();
		
		//Pide al usuario la coeficiente c
		System.out.println("Inserta el valor de c");
						
		//La respuesta sera guardada en la variable a
		c = sc.nextInt();
		
		//Se explicara la ecuacion
		System.out.println("La ecuacion tratada para hallar x (ecuacion de segundo grado) es esta");
		System.out.println("");
		System.out.println("           2");
		System.out.println("    -b ± √b  - 4ac");
		System.out.println("x = --------------");
		System.out.println("          2a");
		
		//Se sumara unicamente la raiz
		raiz=(float)(b*b)-(4*a*c);
		
		//Despues, se comprobara si la raiz no es negativa
		if (raiz>=0) {
			
			//En caso de que la raiz sea positiva, se aplicara ya la raiz cuadrada
			raiz=(float) Math.sqrt(raiz);
			
			//Despues, se hallaran las dos soluciones
			
			//Solucion 1: (-b + raiz)/2a
			soli1 = (float)((-1*b)+raiz)/(2*a);
			
			//Solucion 2: (-b - raiz)/2a
			soli2 = (float)((-1*b)-raiz)/(2*a);
			
			//Se mostrara la Solucion 1 por pantalla
			System.out.println("Resultado 1: " + soli1);
			
			//Se mostrara la Solucion 1 por pantalla
			System.out.println("Resultado 2: " + soli2);
			
		}
		else {
			
			//En caso de que la raiz sea negativa, se le informara al usuario que la ecuacion no tiene solucion y no puede continuar
			System.out.println("                       2");
			System.out.println("Puesto a que la raiz √b  - 4ac no puede ser negativa y asi ha sido, no hay soluciones para esta ecuacion.");
		
		}
		
		//Cierra el Scanner.
		sc.close();
		
	}

}
