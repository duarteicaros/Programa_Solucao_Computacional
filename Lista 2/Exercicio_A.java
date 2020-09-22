package Lista2;

import java.util.Scanner;

public class Exercicio_A {

	public static void main(String[] args) {
		
		Scanner	leia = new Scanner(System.in);
		
		int n, media, soma=0, contador=1;
		
		do {
			System.out.printf("\nInforme um numero:");
			n = leia.nextInt();

			soma+=n;
			contador++;
			
			media =  soma/contador;

			System.out.println("A media total é: "+media);
			
		}while(n != 0);
		

	}

}
