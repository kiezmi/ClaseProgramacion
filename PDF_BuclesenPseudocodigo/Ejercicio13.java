package PDF_BuclesenPseudocodigo;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		// Escribe un programa que nos presente un men� con 3 opciones.
		// Eligiendo la opci�n
		// �a� nos escribir� todos los m�ltiplos de 11 comprendidos entre 1 y
		// 100. Eligiendo la
		// opci�n �b�, lo mismo pero con los m�ltiplos de 17. Eligiendo la
		// opci�n �c�, lo mismo
		// pero con los m�ltiplos de 23.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Opcion A");
		System.out.println("Opcion B");
		System.out.println("Opcion C");
		System.out.println("Elija una opcion: ");
		char letra = 0;
		
		letra = sc.next().charAt(0);

		switch (letra) {

		case 'A':

			for (int i = 1; i <= 100; i++) {
				if (i % 11 == 0) {

					System.out.println(i);
				}
			}
			break;
		case 'B':
			for (int i = 1; i <= 100; i++) {
				if (i % 17 == 0) {

					System.out.println(i);
				}
			}
			break;
		case 'C':
			for (int i = 1; i <= 100; i++) {
				if (i % 23 == 0) {

					System.out.println(i);
				}
			}
			break;

		default:
			break;
		}

	}

}
