package Aula3108;

import java.util.Scanner;

public class Exercicio_7 {

	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		double x,y;
		int a;
		
		
		System.out.printf("Informe o primeiro n�mero: ");
		x =leia.nextDouble();
		
		System.out.printf("Informe o segundo n�mero: ");
		y =leia.nextDouble();
		
		
		System.out.printf("\nEscolha uma op��o!"
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
			System.out.println("O valor da soma � de: "+ soma);
			break;
		case 2:
			double sub;
			sub = x-y;
			System.out.println("O valor da subtra��o � de: "+ sub);
			break;
		case 3: 
			double vezes;
			vezes = x*y;
			System.out.println("O valor da multiplica��o � de: "+ vezes);
			break;
		case 4:
			double div;
			div = x/y;
			System.out.println("O valor da divis�o � de: "+ div);
			break;
			default:
			System.out.println("Escolha uma op��o v�lida");
		}
	}
}
