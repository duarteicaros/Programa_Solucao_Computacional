package Lista2;

import java.util.Scanner;

public class Exercicio_L {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, soma;
		
		System.out.printf("Informe o numero:");
		x = leia.nextInt();
		
		for(soma=0; x >= 1; x--) {
			soma = soma + x;
			 
		}
		
		System.out.println(soma);
	}

}
