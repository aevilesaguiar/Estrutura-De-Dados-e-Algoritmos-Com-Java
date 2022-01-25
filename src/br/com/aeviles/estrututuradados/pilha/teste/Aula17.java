package br.com.aeviles.estrututuradados.pilha.teste;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Aula17 {
	public static void main(String[] args) {
		

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		pilha.empilha(4);
		pilha.empilha(5);
		pilha.empilha(6);
		
		System.out.println(pilha);
		
		System.out.println("Desempilhando elemento: "+pilha.desempilha());
		
		System.out.println(pilha);
		
		System.out.println("Desempilhando elemento: "+pilha.desempilha());
		
		System.out.println(pilha);
	}

}
