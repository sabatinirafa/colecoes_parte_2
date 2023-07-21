package br.com.sabatinirafa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String resp;
		List<String> nomesMasculinos = new ArrayList<String>();
		List<String> nomesFemininos = new ArrayList<String>();
		
		
		do {
			System.out.println("Qual o nome da pessoa que deseja adicionar?");
			String nome = scanner.next();
			
			System.out.println("Qual o sexo dessa pessoa? [m/f]");
			String sexo = scanner.next();
			
			if (sexo.equals("m")) {
				nomesMasculinos.add(nome);
			} else if (sexo.equals("f")) {
				nomesFemininos.add(nome);
			} else {
				System.out.println("Sexo não indentificado");
			}
			
			System.out.println("Deseja adicionar mais alguém? [s/n]");
			resp = scanner.next();
			
		} while (resp.equals("s"));
		
		String listaFemininos = "";
		
		for (String nome : nomesFemininos) {
			listaFemininos += " - " + nome + "\n";
		}
		
		String listaMasculinos = "";
		
		for (String nome : nomesMasculinos) {
			listaMasculinos += " - " + nome + "\n";
		}
		
		
		System.out.println("Nomes Femininos: \n" + listaFemininos);
		System.out.println("Nomes Masculinos: \n" + listaMasculinos);
	}

}
