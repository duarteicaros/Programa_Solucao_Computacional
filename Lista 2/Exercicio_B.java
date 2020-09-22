package Lista2;

import java.util.Scanner;

public class Exercicio_B {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n, cont=0, soma=0, media;
		
		System.out.printf("Informe um numero:");
		n = leia.nextInt();
		
		while(n != 0) {
			
			System.out.printf("Informe um numero:");
			n = leia.nextInt();
			soma +=n;
			cont++;
			
		}
		media = soma/cont;
		System.out.println("\nA media total é de: "+media);
	}

}
