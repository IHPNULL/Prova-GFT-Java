package model;

public class Supervisores extends Funcionarios{

	public Supervisores(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}
	public double Bonificacao()
	{
		return this.getSalario() + 5000;	}
}
