package ejerciciosT2L1;

import java.util.Scanner;

public class EjercicioT2L1E10 {

	public static void main(String[] args) {

		//Registra las variables enteras num1, num2 y num3, que guardaran los tres numeros que se le pediran al usuario
		int numa, numb, numc;
		
		//Inicia el Scanner para registrar datos por el teclado
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario el Numero 1
		System.out.println("Inserta el numero A");
		
		//La respuesta se registrara en la variable numa
		numa=sc.nextInt();
		
		//Pide al usuario el Numero 2
		System.out.println("Inserta el numero B");
		
		//La respuesta se registrara en la variable numb
		numb=sc.nextInt();
		
		//Pide al usuario el Numero 3
		System.out.println("Inserta el numero C");
		
		//La respuesta se registrara en la variable numc
		numc=sc.nextInt();
		
		//Si la suma de los numeros A y B da como resultado el numero C...
		if (numa+numb==numc) {
			
			//Se le informara al usuario que la suma de los numeros A y B dan C
			System.out.println("La suma de los numeros A y B dan el numero C");
		
		}
		
		//En el caso contrario, se comprobaran los demas numeros. Aqui se comprobara si A+C=B
		else if (numa+numc==numb) {
			
			//Se le informara al usuario que la suma de los numeros A y C dan B
			System.out.println("La suma de los numeros A y C dan el numero B");
		
		}
		
		//En el caso contrario, se comprobaran los demas numeros. Aqui se comprobara si B+C=A
		else if (numb+numc==numa) {
			
			//Se le informara al usuario que la suma de los numeros A y C dan B
			System.out.println("La suma de los numeros B y C dan el numero A");
		
		}
		
		//Si ninguna combinacion va bien...
		else {
			
			//Se le informara al usuario que la suma de los dos primeros numeros no da el tercero
			System.out.println("La suma ninguna combinacion daria cualquier numero de los tres introducidos");
		
		}
		
		//Cierra el Scanner.
		sc.close();
		
	}

}