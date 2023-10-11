package ejercicioT2_3_08;

import java.util.Scanner;

public class EjercicioT2_3_08 {

	public static void main(String[] args) {
		
		/*Entera altura: se registrara la altura del teclado
		Entera alto: guardara la variable mas alta de todas las alturas*/
		int altura=0, alto=0;
		
		//Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle: mientras altura no sea -1...
		while (altura!=-1) {
			
			//Pide al usuario la altura de un arbol
			System.out.println("Dime la altura de un arbol");
			
			//La respuesta se guardara en la variable altura
			altura=sc.nextInt();
			
			//Si la altura introducida es mayor que alto...
			if (altura>alto) {
				
				//Alto procedera a ser esa altura
				alto=altura;
			
			}
			
		}
		
		//Muestra la altura del arbol mas alto
		System.out.println(alto);
		
		//Cierra el Scanner
		sc.close();
		
	}

}
