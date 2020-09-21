package Aula3108;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double cc;
		
		System.out.printf("Informe o valor de cilindradas do veiculo:");
		cc = leia.nextDouble();
		
		if(cc >= 0 && cc <=120) {
			System.out.println("Sub Production");
		}
		else if(cc > 120 && cc <=240) {
			System.out.println("Production");
		}
		else if(cc >240) {
			System.out.println("Super Production");
		}
		else {
			System.out.println("Insira um valor acima de 0!!");
		}

	}

}
