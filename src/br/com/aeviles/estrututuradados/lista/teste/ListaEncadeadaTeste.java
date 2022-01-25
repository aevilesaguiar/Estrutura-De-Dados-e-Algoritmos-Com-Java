package br.com.aeviles.estrututuradados.lista.teste;

import br.com.aeviles.estrututuradados.lista.ListaEncadeada;

public class ListaEncadeadaTeste {

	public static void main(String[] args) {

		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		
		lista.adiciona(1);
		System.out.println(" Tamanho da lista= "+lista.getTamanho());
		System.out.println(lista);
	}

}
