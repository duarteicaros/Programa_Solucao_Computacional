package Aula3108;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1,n2,t1,t2,t3, media;
		int x=5;
		
		System.out.printf("Insira o valor da primeira prova:");
		n1 = leia.nextDouble();
		
		System.out.printf("Insira o valor da segunda prova:");
		n2 = leia.nextDouble();
		
		System.out.printf("Insira o valor da nota do primeiro trabalho:");
		t1 = leia.nextDouble();
		
		System.out.printf("Insira o valor da nota do segundo trabalho:");
		t2 = leia.nextDouble();
		
		System.out.printf("Insira o valor da nota do terceiro trabalho:");
		t3 = leia.nextDouble();
		
		media = (n1+n2+t1+t2+t3)/x;
		
		if(media >= 6 || media <= 10) {
		System.out.println("\nAprovado com media de: "+media);
		}
		else if(media >=4 || media <6) {
			System.out.println("\nExame com média de: "+media);
		}
		else if (media >=0 || media <4) {
			System.out.println("\nReprovado com media de: "+media);
		}
	}

}
