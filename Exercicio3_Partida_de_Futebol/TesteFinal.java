package Aula21_09;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteFinal {

public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Time time1 = new Time();
		Time time2 = new Time();
		Partida Time1 = new Partida ();
		Partida Time2 = new Partida ();
		
		String nome = leia.next();
		time1.setNome(nome);
		time2.setNome(nome);
		
		System.out.printf("informe o nome do 1º time: ");
		time1.setNome(leia.next());
		System.out.printf("informe o nome do 2º time: ");
		time2.setNome(leia.next());
		
		int saldotime1 = leia.nextInt();
		int saldotime2 = leia.nextInt();
		
		Time1.setSaldotime1(saldotime1);
		Time2.setSaldotime2(saldotime2);
		
		System.out.printf("\nQuantos gols o 1º time fez?");
		Time1.setSaldotime1(leia.nextInt());
		System.out.printf("Quantos gols o 2º time fez?");
		Time2.setSaldotime2(leia.nextInt());
		
		int pontostime1 = leia.nextInt();
		int pontostime2 = leia.nextInt();
		
		Time1.setPontostime1(pontostime1);
		Time2.setPontostime2(pontostime2);
		
		System.out.printf("\nDigite os pontos do 1º Time:");
		Time1.setPontostime1(leia.nextInt());
		System.out.printf("Digite os pontos do 2º Time:");
		Time2.setPontostime2(leia.nextInt());
		
		
		System.out.println("Nome: "+time1.getNome()+"\nPontos: "+Time1.getPontostime1());
		System.out.println("Nome: "+time2.getNome()+"\nPontos: "+Time2.getPontostime2());
			
	}
	
}