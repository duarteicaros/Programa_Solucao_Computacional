package Aula21_09;

public class Time {

	private String nome;
	private int pontos;
	private int jogos;
	private int saldoDeGols;
	private int lugarNaTabela;
	
	
	//Métodos Get e Set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getJogos() {
		return jogos;
	}
	public void setJogos(int jogos) {
		this.jogos = jogos;
	}
	public int getSaldoDeGols() {
		return saldoDeGols;
	}
	public void setSaldoDeGols(int saldoDeGols) {
		this.saldoDeGols = saldoDeGols;
	}
	public int getLugarNaTabela() {
		return lugarNaTabela;
	}
	public void setLugarNaTabela(int lugarNaTabela) {
		this.lugarNaTabela = lugarNaTabela;
	}

}
