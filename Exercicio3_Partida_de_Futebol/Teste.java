package Aula21_09;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome=null, funcao=null;
		
		Jogadores jogador1 = new Jogadores(nome, funcao);
		Jogadores jogador2 = new Jogadores(nome, funcao);
		
		/*Como pedir os dados pelo usuario*/
		
		System.out.printf("informe o nome do jogador:");
		jogador1.setNome(leia.next());
		
		System.out.printf("Informe a fun��o do jogador:");
		jogador1.setFuncao(leia.next());
		
		/*informando diretamente pelo eclipse*/
		
		jogador2.setNome("Menino Ney");
		jogador2.setFuncao("atacante");
		
		
		/*Imprimindo os valores dados aos jogadores*/
		
		System.out.println("Jogador �: "+jogador1.getNome()+"\t\tfun��o �: "+jogador1.getFuncao());
		System.out.println("\nJogador �: "+jogador2.getNome()+"\t\t fun��o �: "+jogador2.getFuncao());

	}

}
