package model;

public class Pessoas {
	private String nome;
	private int idade;

	
	
	public Pessoas(String string, int i) {
		this.nome = string;
		this.idade = i;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
		
}
