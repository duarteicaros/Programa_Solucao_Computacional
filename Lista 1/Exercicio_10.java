package Aula3108;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c,x1,x2;
		
		System.out.printf("Informe o valor de A:");
		a = leia.nextInt();
		
		System.out.printf("Informe o valor de B:");
		b = leia.nextInt();
		
		System.out.printf("Informe o valor de C:");
		c = leia.nextInt();
		
		if(a != 0) {
			
			x1 = (int) ((-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
			
			x2 = (int) ((-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
			
			if(x1 > 0 && x2 > 0) {
				
				System.out.println("\n O valor das raizaes são: X1="+ Math.sqrt(x1)+" e X2="+Math.sqrt(x2));
			}
			else {
				System.out.println("\nNão existem raizes reais");
			}
			
		}
		else {
			System.out.println("\nO valor de A não pode ser igual a 0!!");
		}

	}

}
