package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Escribe la funci�n �RepiteCaracter� a la que le pasamos dos
		// par�metros: un car�cter y un entero.
		// La funci�n nos devolver� una cadena que contendr� el car�cter
		// repetido
		// tantas veces como indique el entero. Ej.: RepiteCaracter(�A�, 5) =
		// �AAAAA�. No se pueden utilizar PadLeft ni PadRight.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca caracter");
		char caracter= sc.next().charAt(0);
		System.out.println("Introduzca numero de repeticiones");
		int entero = sc.nextInt();
		
		
		System.out.print(RepiteCaracter(caracter,entero));
		
	}

	public static String RepiteCaracter(char caracter, int entero) {
		
		String repeticiones=" ";
		
		for(int i=0;i<entero;i++){
			
			repeticiones=caracter+repeticiones;
			
		}
		return repeticiones;
		

	}
		
		
		
	}

