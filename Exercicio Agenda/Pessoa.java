package Aula_26102020;

public class Pessoa implements Comparable <Pessoa> {
	
	public String nome;
	public String telefone;
	
	
	/*public Array_Pessoa(String nome) {
		
		this.nome = nome;
		this.telefone = telefone;
		
	}*/


	public Pessoa(String nome2) {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public int compareTo(Pessoa arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
