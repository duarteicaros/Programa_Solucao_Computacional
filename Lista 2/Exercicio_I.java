package Lista2;

import java.util.Scanner;

public class Exercicio_I {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n,m,contador = 0, potencia = 1;

		System.out.printf("Informe o numero da base:");
		n = leia.nextInt();
		
		System.out.printf("Informe o numero do expoente:");
		m = leia.nextInt();
	
		  
		  while (contador != m) {
		    potencia = potencia * n;
		    contador++;
		  }

			System.out.println("\nO valor é: " + potencia);	
		
	}

}
