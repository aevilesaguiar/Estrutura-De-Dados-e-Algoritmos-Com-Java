package br.com.aeviles.estrututuradados.pilha.teste;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Aula15 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		pilha.empilha(1);
		
		System.out.println(pilha.estaVazia());
		pilha.empilha(6);
		
		System.out.println(pilha.estaVazia());
		System.out.println(pilha);
		
	}

}
