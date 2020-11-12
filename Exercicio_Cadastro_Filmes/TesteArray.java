package Exercicio_CadastroFilmes;

import javax.swing.JOptionPane;

import Exercicio_Agenda.Pessoas;
import Exercicio_Agenda.PessoasArray;

public class TesteArray {

	public static void main(String[] args) {
		
		FilmesArray filmesArray = new FilmesArray();
		
		int op;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("MENU \n 0 - Sair, "
					+ "\n 1 - Incluir filme, \n 2 - Alterar Filme, "
					+ "\n 3 - Excluir Filme, "
					+ "\n 4 - Listar Filmes"));
			if(op == 1)
			{
				String titulo = JOptionPane.showInputDialog("Digite o nome do Filme:");
				String diretor = JOptionPane.showInputDialog("Digite o diretor do FIlme:");
				String ator = JOptionPane.showInputDialog("Digite o ator principal:");
				String genero = JOptionPane.showInputDialog("Digite o genero do filme:");
				
				Filmes filmes = new Filmes(titulo, diretor, ator, genero);
								
				filmesArray.inserir(filmes);	
			}else if(op == 2) {
				
				String titulo = JOptionPane.showInputDialog("Digite o nome do Filme:");
				String novoTitulo = JOptionPane.showInputDialog("Digite o novo nome do Filme:");
				String novoDiretor = JOptionPane.showInputDialog("Digite a alteração do Diretor:");
				String novoAtor = JOptionPane.showInputDialog("Digite a alteração do ator:");
				String novoGenero = JOptionPane.showInputDialog("Digite a alteração do genero do filme:");
				filmesArray.alterar(titulo, novoTitulo, novoDiretor, novoAtor, novoGenero);
				
			}else if(op == 3) {
				
				String titulo = JOptionPane.showInputDialog("Digite o filme que deseja excluir:");
				filmesArray.remover(titulo);
			
			}else if(op == 4){
				filmesArray.imprimirTodos();
				}
			else if(op < 0 || op > 5){
				System.out.println("\nOpção Inválida!!");
			}else {
				System.out.println("\nPrograma Finalizado!!");
			}
		
		
		
		}while(op!=0);
	}

}