package br.com.gft.exer03.application;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	static double totalCompra, totalPago;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ol�! Seja Bem vindo(a) ao Mercadinho do Ubiratan");
		System.out.println();

		System.out.print("Valor total das compras = ");
		totalCompra = sc.nextDouble();
		System.out.print("Qual o valor pago pelo cliente? ");
		totalPago = sc.nextDouble();

		System.out.println(calculaTroco(totalCompra, totalPago));

		sc.close();
	}

	public static String calculaTroco(double conta, double pago) {
		DecimalFormat formatador = new DecimalFormat("###,##0.00");
		if (pago < conta)
			return ("\nPagamento insuficiente, faltam R$" + formatador.format(conta - pago) + "\n");
		else {
			int nota[] = { 100, 50, 20, 10, 5, 2, 1 };
			int centavos[] = { 50, 25, 10, 5, 1 };

			String result;
			double troco;
			int i, vlr, ct;

			troco = pago - conta;
			result = "\nTroco = R$" + formatador.format(troco) + "\n\n";

			vlr = (int) troco;
			i = 0;
			while (vlr != 0) {
				ct = vlr / nota[i];
				if (ct != 0) {
					result = result + (ct + " nota(s) de R$" + nota[i] + "\n");
					vlr = vlr % nota[i]; // sobra
				}
				i = i + 1;
			}

			result = result + "\n";

			vlr = (int) Math.round((troco - (int) troco) * 100);
			i = 0;
			while (vlr != 0) {
				ct = vlr / centavos[i];
				if (ct != 0) {
					result = result + (ct + " moeda(s) de" + centavos[i] + "centavo(s)\n");
					vlr = vlr % centavos[i];
				}
				i = i + 1;
			}

			return (result);
		}
	}

}