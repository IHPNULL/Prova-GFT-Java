package model;

public class Vendedor extends Funcionarios {

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}	
	public double Bonificacao()
	{
		return this.getSalario() + 3000;
	}
}