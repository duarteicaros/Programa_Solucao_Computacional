package Exercicio_aula_1910;

import java.util.Scanner;

public class Exercicio_J {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.printf("Informe a frase:");
		String entrada = leia.nextLine();
		String invertida = "";

		for (int i = entrada.length() - 1; i >= 0; i--) {
			invertida += entrada.charAt(i);
		}

		System.out.println("\nA palavra invertida fica: " + invertida);

	}

}
