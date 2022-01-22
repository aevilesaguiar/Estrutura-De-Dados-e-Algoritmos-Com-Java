package br.com.aeviles.estrututuradados.pilha.labs;

import java.util.Stack;

public class ExerC05 {

	public static void main(String[] args) {
		
		/*
		 *Escreva um programa que testa se uma sequencia de caracteres fornecida
		 *pelo o usuario é um palíndromo, ou seja, é uma palavra cuja primeira 
		 *metade é simétrica á segunda metade. Veja alguns exemplos:
		 *-AABCCBAA-sim
		 *-ADDFDDA-sim
		 *-ABFFBB-não
		 * */
		
		imprimeResultado("ADA");
		
		imprimeResultado("AMA");
		
		imprimeResultado("RAMAR");
		
		imprimeResultado("AEVILES");
		
		
		
		
		

	}
	
	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + " é palíndromo? "+ testaPalindromo(palavra));
	}
	
	
	
	public static boolean  testaPalindromo(String palavra) {
		//ADA
		
		Stack<Character> pilha = new Stack <Character>();
		
		for(int i=0; i<palavra.length(); i++) {
			pilha.push(palavra.charAt(i));//empilhando os caracteres
		}
		
		String palavraInversa= "";
		
		while(!pilha.isEmpty()) {
			palavraInversa+=pilha.pop();
		}
		
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}
		
		return false;
	}

}
