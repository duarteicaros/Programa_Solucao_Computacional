package Lista2;

import java.util.Scanner;

public class Exercicio_M {

	public static void main(String[] args) {

Scanner leia = new Scanner(System.in);
		
		int menor=0, maior=0, num, i, soma=0, media;
		
		for(i=0; i<50;i++ ) {
			System.out.printf("Informe o numero");
			num = leia.nextInt();
			
			soma+=num;
			
			if (i == 0) {
		        menor = num;
		        maior = num;
		    } else if (num < menor) {
		        menor = num;
		    } else if (num > maior) {
		        maior = num;
		    }
			
		
		}
		
		media = soma/50;
		
		System.out.println("\nMenor numero digitado: " + menor);
		System.out.println("Maior numero digitado: " + maior);
		System.out.println("A media de todos os numeros é de: "+media);

	}

}
