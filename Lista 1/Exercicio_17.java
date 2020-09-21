package Aula3108;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int b1, b2, b3, h1, h2, h3, l1, l2, l3, a1, a2, a3;

		System.out.printf("Informe a base do primeiro cubo:");
		b1 = leia.nextInt();

		System.out.printf("Informe a altura do primeiro cubo:");
		h1 = leia.nextInt();

		System.out.printf("Informe a largura do primeiro cubo:");
		l1 = leia.nextInt();

		System.out.printf("\nInforme a base do segundo cubo:");
		b2 = leia.nextInt();

		System.out.printf("Informe a altura do segundo cubo:");
		h2 = leia.nextInt();

		System.out.printf("Informe a largura do segundo cubo:");
		l2 = leia.nextInt();

		System.out.printf("\nInforme a base do terceiro cubo:");
		b3 = leia.nextInt();

		System.out.printf("Informe a altura do terceiro cubo:");
		h3 = leia.nextInt();

		System.out.printf("Informe a largura do terceiro cubo:");
		l3 = leia.nextInt();

		a1 = b1 * h1 * l1;
		a2 = b2 * h2 * l2;
		a3 = b3 * h3 * l3;

		if (a1 > a2 && a1 > a3) {
			if (a2 > a3) {
				System.out.println("\nOrdem de colocação: Cubo 1, Cubo 2 e Cubo 3");
			}
			else if (a2< a3) {
				System.out.println("\nOrdem de colocação: Cubo 1, Cubo 3 e Cubo 2");
			}
			else if(a2 == a3) {
				System.out.println("\nOrdem de colocação: Cubo 1, Cubo 2 e Cubo 3");
			}

		}
		else if(a2> a1 && a2> a3) {
			if(a1 > a3) {
				System.out.println("\nOrdem de colocação: Cubo 2, Cubo 1 e Cubo 3");
			}
			else if(a1< a3) {
				System.out.println("\nOrdem de colocação: Cubo 2, Cubo 3 e Cubo 1");
			}
			else if (a1 == a3) {
				System.out.println("\nOrdem de colocação: Cubo 2, Cubo 1 e Cubo 3");
			}
		}
		else if(a3 > a1 && a3 > a2) {
			if(a1 > a2) {
				System.out.println("\nOrdem de colocação: Cubo 3, Cubo 1 e Cubo 2");
			}
			else if(a1 <a2) {
				System.out.println("\nOrdem de colocação: Cubo 3, Cubo 2 e Cubo 1");
			}
			else if (a1 == a2) {
				System.out.println("\nOrdem de colocação: Cubo 3, Cubo 2 e Cubo 1");
			}
		}
		else if (a1 == a2 ) {
			if(a1 > a3) {
				System.out.println("\nOrdem de colocação: Cubo 1, Cubo 2 e Cubo 3");
			}
		}
		else if(a1 == a3) {
			if(a1 >a2) {
				System.out.println("\nOrdem de colocação: Cubo 1, Cubo 3 e Cubo 2");
			}
		}
		else if(a2==a3) {
			if(a2 > a1) {
				System.out.println("\nOrdem de colocação: Cubo 2, Cubo 3 e Cubo 1");
			}
		}
	

	}

}
