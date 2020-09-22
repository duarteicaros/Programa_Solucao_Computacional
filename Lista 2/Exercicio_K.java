package Lista2;

import java.util.Scanner;

public class Exercicio_K {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double saldo, menor=0, maior=0;
		int x;

		for (x = 0; x < 30; x++) {
			System.out.printf("Qual foi o saldo do " + (x + 1) + "º dia?");
			saldo = leia.nextDouble();
			
			if (x == 0) {
		        menor = saldo;
		        maior = saldo;
		    } else if (saldo < menor) {
		        menor = saldo;
		    } else if (saldo > maior) {
		        maior = saldo;
		    }
		}
		
		
		System.out.println("\nO maior saldo durante esse mes foi de: R$"+maior);
		System.out.println("\nO menor saldo durante esse mes foi de: R$"+menor);
	}

}
