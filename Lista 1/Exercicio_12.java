package Aula3108;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int d1, d2, m1, m2, a1, a2;
		String nome1, nome2;
		
		System.out.printf("Informe o nome da primeira pessoa:");
		nome1 = leia.next();

		System.out.printf("Informe o dia de nascimento de "+nome1+":");
		d1 = leia.nextInt();

		System.out.printf("Informe o mes de nascimento de "+nome1+":");
		m1 = leia.nextInt();

		System.out.printf("Informe o ano de nascimento de "+nome1+":");
		a1 = leia.nextInt();

		System.out.printf("\nInforme o nome da segunda pessoa:");
		nome2 = leia.next();
		
		System.out.printf("Informe o dia de nascimento de "+nome2+":");
		d2 = leia.nextInt();

		System.out.printf("Informe o mes de nascimento de "+nome2+":");
		m2 = leia.nextInt();

		System.out.printf("Informe o ano de nascimento de "+nome2+":");
		a2 = leia.nextInt();

		if (a1 < a2) {
			System.out.println("\nA pessoa mais velha é: "+nome1+" nascida em: " + d1 + "/" + m1 + "/" + a1);

		} else if (a1 == a2) {
			if (m1 < m2) {
				System.out.println("\nA data mais recente é: "+nome1+" nascida em: " + d1 + "/" + m1 + "/" + a1);
			} else if (m1 == m2) {
				if (d1 < d2) {
					System.out.println("\nA data mais recente é: "+nome1+" nascida em: " + d1 + "/" + m1 + "/" + a1);
				} else {
					System.out.println("\nA data mais recente é: "+nome2+" nascida em: " + d2 + "/" + m2 + "/" + a2);
				}
			}
		} else if (a2 < a1) {
			System.out.println("\nA data mais recente é: "+nome2+" nascida em: " + d2 + "/" + m2 + "/" + a2);
		}

	}

}
