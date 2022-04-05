package br.com.gft.exer02.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String[] alfabetoOrdenado = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.println("Olá! Seja Bem vindo(a) ao sistema GFT Start #4");
		System.out.println();
		lerLetras();

	}

	public static void lerLetras() {

		try {
			System.out.println("Digite duas letras do alfabeto em ordem alfabetica - Ex: ac");
			String valor = sc.next();
			valor = valor.replace(",", "");
			if (valor.trim().length() > 2) {
				System.out.println("Você deve digitar apenas duas letras. Ex: ac");
				lerLetras();
			} else {

				String primeiraLetra = (valor.charAt(0) + "").toUpperCase();
				String segundaLetra = (valor.charAt(1) + "").toUpperCase();

				int indicePrimeiraLetra = Arrays.asList(alfabetoOrdenado).indexOf(primeiraLetra);
				int indiceSegundaLetra = Arrays.asList(alfabetoOrdenado).indexOf(segundaLetra);

				if (indicePrimeiraLetra == -1 || indiceSegundaLetra == -1) {
					System.out.println("Letra nao encontrada no alfabeto, tente novamente");
					lerLetras();
				} else if (indicePrimeiraLetra > indiceSegundaLetra) {
					System.out.println("Não está na ordem alfabética");
				} else {
					System.out.println(primeiraLetra + "," + segundaLetra + "="
							+ ((indiceSegundaLetra - indicePrimeiraLetra) - 1));
				}

			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao ler o texto digitado, tente novamente");
			lerLetras();

		}

	}

}
