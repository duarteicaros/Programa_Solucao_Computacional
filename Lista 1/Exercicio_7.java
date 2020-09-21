package Aula3108;

import java.util.Scanner;

public class Exercicio_7 {

	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		double x,y;
		int a;
		
		
		System.out.printf("Informe o primeiro número: ");
		x =leia.nextDouble();
		
		System.out.printf("Informe o segundo número: ");
		y =leia.nextDouble();
		
		
		System.out.printf("\nEscolha uma opção!"
				+ "\n(1) Para somar"
				+ "\n(2) para subtrair"
				+ "\n(3) para multiplicar"
				+ "\n(4) para dividir"
				+ "\nSua escolha foi: ");
		a = leia.nextInt();
		
		System.out.printf("\n");
		switch (a) {
		case 1:
			double soma;
			soma = x+y;
			System.out.println("O valor da soma é de: "+ soma);
			break;
		case 2:
			double sub;
			sub = x-y;
			System.out.println("O valor da subtração é de: "+ sub);
			break;
		case 3: 
			double vezes;
			vezes = x*y;
			System.out.println("O valor da multiplicação é de: "+ vezes);
			break;
		case 4:
			double div;
			div = x/y;
			System.out.println("O valor da divisão é de: "+ div);
			break;
			default:
			System.out.println("Escolha uma opção válida");
		}
	}
}
