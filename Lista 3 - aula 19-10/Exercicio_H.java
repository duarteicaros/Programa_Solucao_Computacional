/*Fa�a um programa que mostre todos os valores pares de um vetor de quinze posi��es que ser�
preenchido pelo usu�rio. Lembre-se: o vetor estar� completamente preenchido e apenas com
n�meros naturais.*/

package Exercicio_aula_1910;

import java.util.Scanner;

public class Exercicio_H {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] n = new int[15];
		int i;
		
		for(i=0; i<n.length; i++) {
			System.out.printf("Informe o "+(i+1)+"� n�mero: ");
			n[i] = leia.nextInt();
		}
		
		System.out.println();
		for(i=0; i<n.length; i++) {
			
			if(n[i] %2 == 0) {
				System.out.println("O vetor de "+(i+1)+"� posi��o corresponde �: "+n[i]+", � par");
			}
		}
		
		
		
		

	}

}
