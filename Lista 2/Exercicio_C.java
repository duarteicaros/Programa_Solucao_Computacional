package Lista2;

import java.util.Scanner;

public class Exercicio_C {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int x, n = 0, num;

		System.out.printf("Informe um numero:");
		x = leia.nextInt();

		do {
			
			n++;
			num = n * n;
			
			

		} while (num <= x);

		// System.out.println(Math.sqrt(x));

		System.out.println("\nO numero natural que mais se aproxima da raiz de " + x + " é: " + (n-1));
	}

}
