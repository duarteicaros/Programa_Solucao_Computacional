package Aula3108;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1,n2,n3, pri=0, seg=0, ter=0;
		
		System.out.printf("Escreva o primeiro número:");
		n1 = leia.nextDouble();
		
		System.out.printf("Escreva o segundo número:");
		n2 = leia.nextDouble();
		
		System.out.printf("Escreva o terceiro número:");
		n3 = leia.nextDouble();
		
		if(n1 < n2 && n1<n3) {
			if(n2 < n3) {
				pri = n1;
				seg = n2;
				ter = n3;
			} else {
				pri = n1;
				seg = n3;
				ter = n2;
			}
		}
		else if(n2 < n1 && n2 < n3) {
			if(n1 < n3) {
				pri = n2;
				seg = n1;
				ter = n3;
			} else {
				pri = n2;
				seg = n3;
				ter = n1;
			}
		}
		else if(n3 < n1 && n3 < n2) {
			if(n2 < n1) {
				pri = n3;
				seg = n2;
				ter = n1;
			} else {
				pri = n3;
				seg = n1;
				ter = n2;
			}
			
		}
		
		System.out.println("Os numeros em ordem crescente são: ");
		System.out.println("Primeiro "+pri);
		System.out.println("Segundo " +seg);
		System.out.println("Terceiro "+ter);
		


		
		

	}

}
