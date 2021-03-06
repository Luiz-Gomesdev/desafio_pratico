package br.com.gft.exer01.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.gft.exer01.entitie.Pessoa;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> lista = new ArrayList<>();

		System.out.println("Ol?! Seja Bem vindo(a) ao sistema GFT Start #4");
		System.out.println("Fa?a o cadastro das pessoas");
		System.out.println();

		int n = 10;
		double[] vect = new double[10];
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Pessoa #" + (i + 1) + ":");
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			lista.add(new Pessoa(idade, altura, peso));
		}

		int sup50 = 0;
		int somaAltura2030 = 0;
		int total2030 = 0;
		int totalMenor40Quilos = 0;

		for (Pessoa p : lista) {
			if (p.getIdade() > 50) {
				sup50++;
			}

			if (p.getIdade() >= 10 && p.getIdade() <= 20) {
				total2030++;
				somaAltura2030 += p.getAltura();
			}

			if (p.getPeso() < 40) {
				totalMenor40Quilos++;
			}

		}

		System.out.println("Quantidade de pessoas com idade maior do que 50 anos:" + sup50);
		System.out.println(
				"A media das Alturas das pessoas com idade entre 10 e 20 anos:" + (somaAltura2030 / total2030));
		System.out.println(" A porcentagem das pessoas com peso inferior a 40 quilos:"
				+ totalMenor40Quilos * 100 / lista.size() + "%");

		sc.close();
	}

}