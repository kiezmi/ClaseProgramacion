package PDF_BuclesenPseudocodigo;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Escribe un programa que te pregunte si quieres n�meros pares o
		// impares. Si te dice
		// pares, escribe los n�meros pares del 1 al 10 y si te dice impares,
		// escribe los n�meros
		// impares del 1 al 10.
		Scanner sc = new Scanner(System.in);
		int caso = 0;

		System.out.println("Elige entre numeros pares(1) o impares(2): ");
		
		caso = sc.nextInt();

		switch (caso) {
		case 1:
			for (int i = 1; i < 10; i++) {
				if (i % 2 == 0) {
				
					System.out.println(i);
				}}
			
			break;
		case 2:
			for (int i = 1; i < 10; i++) {
				if (i % 2 == 0) {
				} else {
					System.out.println(i);
				}}
			
			break;

		default:
			break;
		}}
	

}
