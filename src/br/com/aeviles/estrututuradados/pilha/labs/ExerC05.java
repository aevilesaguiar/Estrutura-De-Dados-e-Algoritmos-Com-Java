package br.com.aeviles.estrututuradados.pilha.labs;

import java.util.Stack;

public class ExerC05 {

	public static void main(String[] args) {
		
		/*
		 *Escreva um programa que testa se uma sequencia de caracteres fornecida
		 *pelo o usuario � um pal�ndromo, ou seja, � uma palavra cuja primeira 
		 *metade � sim�trica � segunda metade. Veja alguns exemplos:
		 *-AABCCBAA-sim
		 *-ADDFDDA-sim
		 *-ABFFBB-n�o
		 * */
		
		imprimeResultado("ADA");
		
		imprimeResultado("AMA");
		
		imprimeResultado("RAMAR");
		
		imprimeResultado("AEVILES");
		
		
		
		
		

	}
	
	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + " � pal�ndromo? "+ testaPalindromo(palavra));
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
