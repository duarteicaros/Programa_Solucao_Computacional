
package Aula3108;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String a;
		double x, imc;
		
		
		System.out.printf("Insira a sua altura: ");
		x = leia.nextDouble();
		
		System.out.println("Insira seu sexo"
				+ "\n (M) para Masculino"
				+ "\n (F) para Feminino:");
		a = leia.next().toUpperCase();
		
		if(a == "M") {
			imc = (72.7 * x) - 58;
			System.out.println("Seu peso ideal é: "+ imc);
		}
		else if(a == "F") {
			imc = (62.1 * x) - 44.7;
			System.out.println("Seu peso ideal é: "+ imc);	
		}
		else {
				System.out.println("Insira uma opção válida");
		}
	}

}
