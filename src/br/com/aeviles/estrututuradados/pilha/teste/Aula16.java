package br.com.aeviles.estrututuradados.pilha.teste;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {


		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.topo());
		
		System.out.println(pilha);
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		

		System.out.println("Elemento do topo da Pilha: " +pilha.topo());
		
		System.out.println(pilha);

	}

}
