package Aula3108;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String args []) {
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		
		System.out.printf("Digite um n�mero para saber se ele � par ou n�o: ");
		x = leia.nextInt();
		
		if(x%2 == 0) {
			System.out.println("\nO n�mero � PAR!!");
		} else {
			System.out.println("\nO n�mero � IMPAR!!");
		}
	}
}
