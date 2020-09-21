package Aula3108;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String args []) {
		
		Scanner leia = new Scanner(System.in);
		
		double x,y;
		
		System.out.printf("Digite o primeiro numero: ");
		x = leia.nextDouble();
		
		System.out.printf("Digite o segundo numero: ");
		y = leia.nextDouble();
		
		
		if(x > y) {
			System.out.println("\nO maior número digitado foi: "+(Math.round(x * 100.0)/100.0));
		} else {
			System.out.println("\nO maior número digitado foi: "+(Math.round(y * 100.0)/100.0));
		}
	}

}
