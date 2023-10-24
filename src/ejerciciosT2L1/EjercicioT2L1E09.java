package ejerciciosT2L1;

import java.util.Scanner;

public class EjercicioT2L1E09 {

	public static void main(String[] args) {

		//Registra las Strings res1 y res2, que sera lo que sacara cada jugador en el Piedra, Papel o Tijera
		String res1, res2;
		
		//Inicia el Scanner para registrar datos por el teclado
		Scanner sc = new Scanner(System.in);
		
		//PRIMORDIAL: NO VALE PAPELERA
		
		//Pide al primer jugador que saque piedra, papel o tijera
		System.out.println("Jugador 1. ¿Piedra, papel o tijera?");
		
		//Lo que introduzca el primer jugador se guardara en la variable res1
		res1 = sc.nextLine().toUpperCase();
		
		//Pide al segundo jugador que saque piedra, papel o tijera
		System.out.println("Jugador 2. ¿Piedra, papel o tijera?");
		
		//Lo que introduzca el segundo jugador se guardara en la variable res2
		res2 = sc.nextLine().toUpperCase();
		
		//Se comprobara aqui si alguno de los usuarios ha tenido el valor de poner papelera...
		if (res1.equals("PAPELERA") || res2.equals("PAPELERA")) {
			//¿Que si los ha tenido? Le diremos que eso no vale, que estz en contra de las normas
			System.out.println("La respuesta de uno de los jugadores es incorrecta. La respuesta debe ser Piedra, Papel o Tijera");
			System.out.println("Como se nota que has puesto papelera... ¡Que no vale papelera, hombre!");
		
		}
		
		//Ya papelera aparte, se comprobara si las respuestas han sido piedra, papel o tijera
		else if (res1.equals("PIEDRA") || res1.equals("PAPEL") || res1.equals("TIJERA")) {
			
			//Si todas las respuestas son validas, procederemos a comprobar quien ha ganado, dependiendo de lo que hayan sacado
			if (res2.equals("PIEDRA") || res2.equals("PAPEL") || res2.equals("TIJERA")) {
				
				//Si los dos jugadores han sacado PIEDRA...
				if (res1.equals("PIEDRA") && res2.equals("PIEDRA")) {
					
					//Se les informaran los resultados y que hay empate
					System.out.println("Ambos jugadores han sacado PIEDRA. Hay empate.");
				
				}
				
				//Si los dos jugadores han sacado PAPEL...
				else if (res1.equals("PAPEL") && res2.equals("PAPEL")) {
					
					//Se les informaran los resultados y que hay empate
					System.out.println("Ambos jugadores han sacado PAPEL. Hay empate.");
				
				}
				
				//Si los dos jugadores han sacado TIJERA...
				else if (res1.equals("TIJERA") && res2.equals("TIJERA")) {
					
					//Se les informaran los resultados y que hay empate
					System.out.println("Ambos jugadores han sacado TIJERA. Hay empate.");
				
				}
				
				//Si el primer jugador ha sacado PIEDRA y el segundo jugador ha sacado PAPEL...
				else if (res1.equals("PIEDRA") && res2.equals("PAPEL")) {
					
					//Se le informaran los resultados y la victoria del JUGADOR 2
					System.out.println("El Jugador 1 ha sacado PIEDRA. El jugador 2 ha sacado PAPEL. Ha ganado el JUGADOR 2.");
				
				}
				
				//Si el primer jugador ha sacado PIEDRA y el segundo jugador ha sacado TIJERA...
				else if (res1.equals("PIEDRA") && res2.equals("TIJERA")) {
					
					//Se le informaran los resultados y la victoria del JUGADOR 1
					System.out.println("El Jugador 1 ha sacado PIEDRA. El jugador 2 ha sacado TIJERA. Ha ganado el JUGADOR 1.");
				
				}
				
				//Si el primer jugador ha sacado PAPEL y el segundo jugador ha sacado PIEDRA...
				else if (res1.equals("PAPEL") && res2.equals("PIEDRA")) {
					
					//Se le informaran los resultados y la victoria del JUGADOR 1
					System.out.println("El Jugador 1 ha sacado PAPEL. El jugador 2 ha sacado PIEDRA. Ha ganado el JUGADOR 1.");
				
				}
				
				//Si el primer jugador ha sacado PAPEL y el segundo jugador ha sacado TIJERA...
				else if (res1.equals("PAPEL") && res2.equals("TIJERA")) {
					
					//Se le informaran los resultados y la victoria del JUGADOR 2
					System.out.println("El Jugador 1 ha sacado PAPEL. El jugador 2 ha sacado TIJERA. Ha ganado el JUGADOR 2.");
				
				}
				
				//Si el primer jugador ha sacado TIJERA y el segundo jugador ha sacado PIEDRA...
				else if (res1.equals("TIJERA") && res2.equals("PIEDRA")) {
					
					//Se le informaran los resultados y la victoria del JUGADOR 2
					System.out.println("El Jugador 1 ha sacado TIJERA. El jugador 2 ha sacado PIEDRA. Ha ganado el JUGADOR 2.");
				
				}
				
				//Si el primer jugador ha sacado TIJERA y el segundo jugador ha sacado PAPEL...
				else {
					
					//Se le informaran los resultados y la victoria del JUGADOR 1
					System.out.println("El Jugador 1 ha sacado TIJERA. El jugador 2 ha sacado PAPEL. Ha ganado el JUGADOR 1.");
				
				}
				
			}
			
			//En caso de que el Jugador 2 no tenga una respuesta correcta, se les informara que su respuesta no es correcta.
			else {
				
				System.out.println("La respuesta de uno de los jugadores es incorrecta. La respuesta debe ser Piedra, Papel o Tijera");
				System.out.println("Por casualidad no habras puesto papelera, ¿verdad?");
			
			}
			
		}
		
		//En caso de que el Jugador 1 (o el Jugador 2) no tenga una respuesta correcta, se les informara que su respuesta no es correcta.
		else {
			
			System.out.println("La respuesta de uno de los jugadores es incorrecta. La respuesta debe ser Piedra, Papel o Tijera");
			System.out.println("Por casualidad no habras puesto papelera, ¿verdad?");
		
		}
		
		//Cierra el Scanner.
		sc.close();
		
	}

}
