package Lista2;

import java.util.Scanner;

public class Exercicio_G {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.printf("Informe o numero que deseja fazer o fatorial: ");
		num = leia.nextInt();
		
		
		for(soma=1; num > 1; num--) {
			soma = soma *num;
			
		}
		
		System.out.println("\nO valor fatorado de é: "+soma);

	}

}
