package Aula3108;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int d1,d2,m1,m2,a1,a2;
		
		System.out.printf("Informe o dia da primeira data:");
		d1 = leia.nextInt();
		
		System.out.printf("Informe o mes da primeira data:");
		m1 = leia.nextInt();
		
		System.out.printf("Informe o ano da primeira data:");
		a1 = leia.nextInt();
		
		System.out.printf("\nInforme o dia da segunda data:");
		d2 = leia.nextInt();
		
		System.out.printf("Informe o mes da segunda data:");
		m2 = leia.nextInt();
		
		System.out.printf("Informe o ano da segunda data:");
		a2 = leia.nextInt();
		
		
		if(a1 > a2) {
			System.out.println("\nA data mais recente é: "+d1+"/"+m1+"/"+a1);
			
		}
		else if(a1 == a2) {
			if(m1 > m2) {
				System.out.println("\nA data mais recente é: " +d1+"/"+m1+"/"+a1);
		}
			else if(m1 == m2) {
				if(d1 > d2) {
					System.out.println("\nA data mais recente é: " +d1+"/"+m1+"/"+a1);
				}
				else {
					System.out.println("\nA data mais recente é: "+d2+"/"+m2+"/"+a2);
				}
			}
		} 
		else if(a2 > a1) {
			System.out.println("\nA data mais recente é: " +d2+"/"+m2+"/"+a2);
		}

	}

}
