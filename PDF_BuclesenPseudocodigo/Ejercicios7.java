package PDF_BuclesenPseudocodigo;

import java.util.Scanner;

public class Ejercicios7 {

	public static void main(String[] args) {
		// Escribe un programa que te pida dos n�meros con la condici�n de que
		// el segundo sea
		// mayor que el primero, en caso contrario te pregunta de nuevo el
		// n�mero hasta que
		// sea correcto. Si los n�meros son correctos, escribe todos los n�meros
		// comprendidos
		// entre el primer y el segundo n�mero (ambos inclusive).
		Scanner sc = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		boolean fin = true;

		System.out.println("Introduzca primer numero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca segundo numero: ");
		numero2 = sc.nextInt();
		while (fin == true) {
			if (numero1 < numero2) {
				for (int i = numero1; i <= numero2; i++) {
					System.out.println(i);
					fin = false;
				}
			} else {

				System.out.println("Introduzca segundo numero otra vez: ");
				numero2 = sc.nextInt();
			}
		}

	}
}
