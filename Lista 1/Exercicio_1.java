package Aula3108;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*Fa�a um programa que recebe duas notas, 
 * exibe a m�dia aritm�tica das notas e uma 
 * mensagem indicando se o aluno foi aprovado 
 * ou reprovado. A m�dia para aprova��o deve 
 * ser maior que seis.*/
public class Exercicio_1 {
	
	public static void main(String args [] ) {
		
		Scanner leia = new Scanner(System.in);
		
		float x =0, y=0, media; 
		String nome;
		
		
		//System.out.printf("Insira a primeira nota: ");
		//x = leia.nextFloat();
		
		//System.out.printf("Insira a primeira nota: ");
		//y = leia.nextFloat();
		
		media = (x+y)/2;
		
		nome = JOptionPane.showInputDialog("Digite seu nome");
		
		double w = Double.parseDouble(JOptionPane.showInputDialog("Digite seu nome"));
		
		JOptionPane.showMessageDialog(null,"A sua m�dia �: "+media);
		
		if(media >6) {
			System.out.println("\nO aluno est� aprovado!!");
		} else {
			System.out.println("\nO aluno est� reprovado :(");
		}
		
	}

}
