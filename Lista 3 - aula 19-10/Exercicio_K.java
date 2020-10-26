package Exercicio_aula_1910;

import java.util.Scanner;

public class Exercicio_K {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String primeira, segunda;
		
		System.out.printf("Informe a primeira palavra:");
		primeira = leia.next();
		
		
		System.out.printf("Informe a segunda palavra:");
		segunda = leia.next();
		
		if(primeira.equalsIgnoreCase(segunda)) {
			System.out.println("\nAs duas palavras são iguais!!");
		} else {
			System.out.println("\nAs palavras são diferentes :(");
		}
		
		
		
		
		

	}

}
