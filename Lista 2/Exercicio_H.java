package Lista2;

import java.util.Scanner;

public class Exercicio_H {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, soma = 0;

		System.out.printf("Informe o numero que deseja fazer o fatorial: ");
		num = leia.nextInt();
		
		if(num >0) {
			for (soma = 1; num > 1; num--) {
				soma = soma * num;

			}

			System.out.println("\nO valor fatorado de é: " + soma);	
		}
		else {
			System.out.println("\nInforme um valor positivo ou diferente de 0!");
		}

		
	}

}
