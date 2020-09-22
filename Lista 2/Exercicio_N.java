package Lista2;

import java.util.Scanner;

public class Exercicio_N {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		
		double h, x, soma;

		System.out.printf("Informe o numero:");
		x = leia.nextInt();

		for (h = 0; x >= 1; x--) {
			h = 1 + (1 / x);

		}

		System.out.println(h);

	}

}
