package br.com.aeviles.estrututuradados.pilha.labs;

import java.util.Stack;

public class Exerc06 {

	public static void main(String[] args) {
		/*
		 *Escreva um programa para verificar se uma express�o 
		 *matem�tica tem os paraenteses agrupados de forma correta,isto � 
		 *seguido posteriormente por um fechamento de par�nteses 
		 *
		 *Ex:
		 *- As express~es ((A+B) ou A+B(violam a condi��o 1
		 *- As express�es) A+B(-C OU(A+B))-(C+D violam a condi��o 2
		 *-A express�o ((A+B)+D) est� ok */
		
		imprimeResultado("A+B");
		imprimeResultado("A+[B(-1)})");
		imprimeResultado("A+(A*B)-[G}");
		

	}
	
	public static void imprimeResultado(String expressao) {
		
		System.out.println(expressao + "est� balanceada? "+
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
