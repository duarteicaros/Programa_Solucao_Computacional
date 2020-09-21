package Aula3108;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String args [] ) {
	
		Scanner leia = new Scanner(System.in);
		
		int x,y;
		
		System.out.printf("Digite o primeiro numero: ");
		x = leia.nextInt();
		
		System.out.printf("Digite o segundo numero: ");
		y = leia.nextInt();
		
		if(x > y) {
			System.out.println("\nO maior número digitado foi: "+x);
		} else {
			System.out.println("\nO maior número digitado foi: "+y);
		}
		
		
	}
}
