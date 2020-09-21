package Aula3108;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("Informe a idade do nadador:");
		idade = leia.nextInt();
		
		
		if (idade >= 0 && idade <=10) {
			System.out.println("\nO nadador pertence a categoria Infantil");
		}
		else if(idade >=11 && idade <=14) {
			System.out.println("\nO nandador pertence a categoria Junior");
		}
		else if(idade >=15 && idade <=20) {
			System.out.println("\nO nadador pertence a categoria Adolescente");
		}
		else if(idade>=21 && idade <=35) {
			System.out.println("\nO nadador pertence a categoria Jovem");
		}
		else if(idade > 35) {
			System.out.println("\nO nadador pertence a categoria Máster");
		}
		else {
			System.out.println("\nInforme uma idade válida!!");
		}
	}

}
