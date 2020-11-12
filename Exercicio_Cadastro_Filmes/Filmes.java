package Exercicio_CadastroFilmes;

public class Filmes {	
	
	private String titulo;
	private String diretor;
	private String ator;
	private String genero;

	
	public Filmes(String titulo, String diretor, String ator, String genero)
	{
		this.titulo = titulo;
		this.diretor = diretor;
		this.ator = ator;
		this.genero = genero;
	}
	
	public Filmes()
	{
		
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAtor() {
		return ator;
	}

	public void setAtor(String ator) {
		this.ator = ator;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	
	
}