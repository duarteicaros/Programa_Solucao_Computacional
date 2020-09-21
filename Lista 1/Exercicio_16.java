package Aula3108;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int tempCasa, sexo;
		
		double salario;
		
		String nome;
		
		System.out.printf("Informe o nome do funcionário:");
		nome = leia.next();
		
		System.out.printf("Qual o salario de "+nome+"?");
		salario = leia.nextDouble();
		
		System.out.printf("Quanto tempo de casa tem "+nome+"?");
		tempCasa = leia.nextInt();
		
		System.out.printf("Qual o sexo de "+nome+"?"
				+ "\n(1) para femino"
				+ "\n(2) para masculino"
				+ "\n:");
		sexo = leia.nextInt();
		
		if(sexo == 1 && tempCasa >10) {
			salario = salario*25/100 + salario;
			System.out.println("\nO salario com bonus de natal de "+nome+" será de: R$"+salario);
		}
		else if(sexo == 2 && tempCasa >15) {
			salario = salario*20/100 + salario;
			System.out.println("\nO salario com bonus de natal de "+nome+" será de: R$"+salario);
		}
		else {
			salario += 200;
			System.out.println("\nO salario com bonus de natal de "+nome+" será de: R$"+salario);
		}
		
		

	}

}
