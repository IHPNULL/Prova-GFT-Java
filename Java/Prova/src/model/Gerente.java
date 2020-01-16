package model;

public class Gerente extends Funcionarios {

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}
	public double Bonificacao()
	{
		return this.getSalario() + 10000;	
	}	
}