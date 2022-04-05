package br.com.gft.exer04.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Seja Bem vindo(a) ao sistema GFT Start #4");
		System.out.println();
		
		System.out.println("Qual letra você quer verificar? ");
		String letra = sc.next();
		
		if (letra.length() > 1){
            System.out.println("Não é uma letra válida");
        } else {
           letra = letra.toUpperCase();

            switch(letra){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": System.out.println("vogal"); break;
            default: System.out.println("consoante");  
            }
        }
	}
}