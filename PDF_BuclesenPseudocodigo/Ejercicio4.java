package PDF_BuclesenPseudocodigo;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Escribe un programa en el que tenemos que acertar un n�mero entre 1 y
		// 10. Si no
		// acertamos, nos vuelve a preguntar otro n�mero. Si acertamos, nos
		// felicita por nuestra
		// haza�a. El n�mero que hay que acertar ser� constante (hasta que
		// aprendamos a usar
		// los n�meros aleatorios).
		int numero = 5;
		int numero2 = 0;

		while (numero2 != numero) {
			System.out.print("Dime un numero comprendido entre 1 y 10: ");
			numero2 = sc.nextInt();

		}
		System.out.println("Enhorabuena, acertaste");
	}
}