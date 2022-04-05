package br.com.gft.exer01.entitie;

public class Pessoa {

	private int idade;
	private double altura;
	private double peso;

	public Pessoa() {
	}

	public Pessoa(int idade, double altura, double peso) {
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}