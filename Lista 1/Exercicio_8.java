package Aula3108;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double b1, b2, b3, h1, h2, h3, a1,a2,a3;
		
		System.out.printf("Informe a primeira base:");
		b1 = leia.nextDouble();
		
		System.out.printf("Informe a primeira altura:");
		h1 = leia.nextDouble();
		
		System.out.printf("Informe a segunda base:");
		b2 = leia.nextDouble();
		
		System.out.printf("Informe a segunda altura:");
		h2 = leia.nextDouble();
		
		System.out.printf("Informe a terceira base:");
		b3 = leia.nextDouble();
		
		System.out.printf("Informe a terceira altura:");
		h3 = leia.nextDouble();
		
		
		a1 = (b1 * h1) / 2;
		a2 = (b2 * h2) / 2;
		a3 = (b3 * h3) / 2;

		if(a1 > a2 && a1 > a3) {
			System.out.println("\nA maior area é a do primeiro triangulo, sendo ela: "+a1);
		}
		else if (a2> a1 && a2> a3) {
			System.out.println("\nA maior area é a do segundo triangulo, sendo ela: "+a2);
		}
		else if (a3 > a1 && a3> a2) {
			System.out.println("\nA maior area é a do terceiro triangulo, sendo ela: "+a3);
		}
	}

}
