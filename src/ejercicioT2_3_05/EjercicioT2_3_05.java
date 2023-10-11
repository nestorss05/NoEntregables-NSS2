package ejercicioT2_3_05;

import java.util.Scanner;

public class EjercicioT2_3_05 {

	public static void main(String[] args) {

		//Registro y doy valor a las enteras num y numt
		//num guardara el valor que pondra el usuario, nump guardara cada valor de num positivo y los ira sumando, mientras que numn hara la misma funcion pero para los negativos.
		//cont sera el contador que tiene que llegar a 10, contc el contador de los ceros, contn el de los numeros negativos.
		int num = 0, nump = 0, numn= 0, cont = 0, contc = 0, contn = 0;
		
		//Enciende el Scanner para leer datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle: Hasta que el contador llegue a 10...
		while (cont<10) {
			
			//Lo primero que se hara es sumar 1 al contador
			cont = ++cont;
			
			//Pide al usuario un numero
			System.out.println("Escribe un numero");
			
			//Se guaradara la respuesta en la variable num
			num = sc.nextInt();
			
			//Bucle: si el numero insertado es positivo...
			if (num>0) {
				
				//La respuesta de num se sumara a lo que haya en nump
				nump = nump+num;
			
			}
			
			//Else: si el numero es negativo...
			else if (num<0) {
				
				//La respuesta de num se sumara a lo que haya en numn
				numn = numn+num;
				
				//Tambien se sumara 1 al contador de numeros negativos
				contn = ++contn;
			
			}
			
			//Else: si el numero es 0...
			else {
				
				//El contador de ceros procedera a sumarse uno mas
				contc=++contc;
			
			}
			
		}
		
		//El programa te mostrara la suma de los diez numeros introducidos.
		System.out.println("Suma: "+nump);
		
		//Despues, el programa te mostrara la media de los diez numeros introducidos.
		System.out.println("Media: "+(float)numn/contn);
		
		//Por ultimo, el programa te mostrara la cantidad de ceros que has introducido
		System.out.println("Has introducido "+contc+" ceros");
		
		//Cierra el Scanner
		sc.close();
		
	}

}
