package Exercicio_CadastroFilmes;

import java.util.ArrayList;

import Exercicio_Agenda.Pessoas;

public class FilmesArray {
	
	ArrayList<Filmes> lista;
	
	public FilmesArray() {
		lista = new ArrayList<>();
	}
	
	public void inserir(Filmes filmes) {
		lista.add(filmes);
	}
	
	public void remover(String titulo) {
		int pos = busca(titulo);
		if(pos >= 0) {
			lista.remove(pos);
		}else {
			System.out.println("\nFilme não encontrado");
		}
	}
	
	
	public void imprimirTodos() {

		for(Filmes filmes: lista) {
			System.out.println("\n======================================="
					+ "\n\n Nome do filme: "+filmes.getTitulo()+
					"\n Diretor: "+filmes.getDiretor()+
				    "\n Ator Principal: "+filmes.getAtor()+
					"\n Genero: "+filmes.getGenero());
		}

	}
	
	public void alterar(String titulo, String novoTitulo, String novoDiretor, String novoAtor, String novoGenero)
	{
		int pos = busca(titulo);
		if(pos >= 0) {
			Filmes filmes = lista.get(pos);
			filmes.setTitulo(novoTitulo);
			filmes.setDiretor(novoDiretor);
			filmes.setAtor(novoAtor);
			filmes.setGenero(novoGenero);
			lista.set(pos, filmes);
		}else {
			System.out.println("\nRegistro não encontrado");
		}
	}
	
	public int busca(String titulo) {
		int pos = -1;		
		for(int i = 0; i < lista.size(); i++) {
			Filmes filmes = lista.get(i);
			if(filmes.getTitulo().equals(titulo)) {
				pos = i;
				break;
			}
		}		
		return pos;
	}

}
