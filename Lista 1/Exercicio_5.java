package Aula3108;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String args []) {
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		
		System.out.printf("Digite um número para saber se ele é par ou não: ");
		x = leia.nextInt();
		
		if(x%2 == 0) {
			System.out.println("\nO número é PAR!!");
		} else {
			System.out.println("\nO número é IMPAR!!");
		}
	}
}
