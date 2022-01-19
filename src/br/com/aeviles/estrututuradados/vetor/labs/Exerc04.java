package br.com.aeviles.estrututuradados.vetor.labs;

import br.com.aeviles.estrututuradados.vetor.Lista;

public class Exerc04 {

	public static void main(String[] args) {
		/*
		 * Melhore a classe Lista e implemente o método obtem(int posicao)
		 * onde sera possivel obter o elemento dada uma posição do vetor.
		 * Esse método é semelhante ao método get(int posicao) da classe
		 * ArrayList*/

		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");


		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(8));
		System.out.println(lista);

		


	}

}
