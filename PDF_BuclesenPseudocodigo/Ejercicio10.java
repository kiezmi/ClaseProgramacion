package PDF_BuclesenPseudocodigo;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Escribe un programa que pasa un n�mero de decimal a binario (usando
		// divisiones sucesivas entre 2). Nota: Al ir escribiendo los restos de
		// las
		// divisiones, es normal que el n�mero se escriba al rev�s.

		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		int resto = 0;
		int dividir = 0;
		System.out.println("Introduzca numero para pasarlo a binario: ");
		
		numero1 = sc.nextInt();
				
		resto=numero1%2;
		dividir=numero1/2;
		System.out.print(resto);
		
		resto=numero1%2;
		dividir=numero1/2;
		System.out.print(resto);
		
		resto=numero1%2;
		dividir=numero1/2;
		System.out.print(resto);
		
		resto=numero1%2;
		dividir=numero1/2;
		System.out.print(resto);
		
		}

	}


