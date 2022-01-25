package br.com.aeviles.estrututuradados.pilha.teste;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Aula13 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha);
		System.out.println("Quantidade de elementos da Pilha:" +pilha.tamanho());
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		pilha.empilha(4);
		
		System.out.println("Quantidade de elementos da Pilha:" +pilha.tamanho());
		
		
		
	}

}
