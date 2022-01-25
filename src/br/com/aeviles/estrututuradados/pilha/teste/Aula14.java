package br.com.aeviles.estrututuradados.pilha.teste;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {


		Pilha<Integer> pilha = new Pilha<Integer>();
		System.out.println("Empilhar elemento");
		
		for(int i=1; i<=11;i++) {
			pilha.empilha(i);
		}

		System.out.println(pilha);
		System.out.println("Quantidade de elementos: "+pilha.tamanho());

	}

}
