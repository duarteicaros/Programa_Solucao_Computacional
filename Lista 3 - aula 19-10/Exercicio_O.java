/*Faça um programa que recebe cinquenta números inteiros 
 * em um vetor, os ordena e exibe o vetor
ordenado crescente.*/

package Exercicio_aula_1910;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_O {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] x = new int[10];
		int i;
		
		for(i=0; i<x.length; i++) {
			System.out.printf("Informe o número para o "+(i+1)+"º vetor:");
			x[i] = leia.nextInt();
		}
		
		Arrays.sort(x);
		
		System.out.print("Ordem crescente:    "); 
     	  for (int j = 0; j < x.length; j++) 
     	  {
     		System.out.print(x[j]+ "  ");       		
		  }
		
		

	}

}
