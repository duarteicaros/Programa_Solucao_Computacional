package Lista2;

import java.util.Scanner;

public class Exercicio_J {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int menor=0, maior=0, idade, i;
		
		for(i=0; i<=100;i++ ) {
			System.out.printf("Informe a idade:");
			idade = leia.nextInt();
			
			if (i == 0) {
		        menor = idade;
		        maior = idade;
		    } else if (idade < menor) {
		        menor = idade;
		    } else if (idade > maior) {
		        maior = idade;
		    }
		
		}
		
		System.out.println("Menor idade: " + menor);
		System.out.println("Maior idade: " + maior);
		

	}

}
