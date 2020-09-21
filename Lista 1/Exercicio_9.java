package Aula3108;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.printf("Informe o valor de A:");
		a = leia.nextInt();
		
		System.out.printf("Informe o valor de B:");
		b = leia.nextInt();
		
		System.out.printf("Informe o valor de C:");
		c = leia.nextInt();
		
		if((a < b+c) && (b< a+c) && (c< a+b)) {
			if((a==b) && (b==c)) {
				System.out.println("Triangulo Equilatero");
			}
			else if((a==b) && (b==c) || (a==c)) {
				System.out.println("TRiangulo isosceles");
			}
			else {
				System.out.println("Triangulo Escaleno");
			}
		}
		else {
			System.out.println("Não é possivel formar um Triangulo!");
		}

	}

}


