package br.com.aeviles.estrututuradados.pilha.labs;

import java.util.Stack;

public class Exerc06 {

	public static void main(String[] args) {
		/*
		 *Escreva um programa para verificar se uma expressão 
		 *matemática tem os paraenteses agrupados de forma correta,isto é 
		 *seguido posteriormente por um fechamento de parênteses 
		 *
		 *Ex:
		 *- As express~es ((A+B) ou A+B(violam a condição 1
		 *- As expressões) A+B(-C OU(A+B))-(C+D violam a condição 2
		 *-A expressão ((A+B)+D) está ok */
		
		imprimeResultado("A+B");
		imprimeResultado("A+[B(-1)})");
		imprimeResultado("A+(A*B)-[G}");
		

	}
	
	public static void imprimeResultado(String expressao) {
		
		System.out.println(expressao + "está balanceada? "+
		verificaSimbolosBalanceados(expressao));
	}
	
	
	final static String ABRE= "([{<";
	final static String FECHA= ")]}>";
	public static boolean verificaSimbolosBalanceados(String expressao) {
		

		Stack<Character> pilha = new Stack<Character>();
		int index = 0;
		char simbolo,topo;
		
		while(index < expressao.length()) {
			
			simbolo = expressao.charAt(index);
			
			if(ABRE.indexOf(simbolo)>-1){//simbolo>-1 quer dizer que existe
				pilha.push(simbolo);
			}else if(FECHA.indexOf(simbolo)>-1){//simbolo>-1 quer dizer que existe
				if(pilha.isEmpty()) {
					return false;
				}else {
					topo= pilha.peek();
					
					if(ABRE.indexOf(topo)!=FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}
					index++;
		}
		
		
		return true;
	}

}
