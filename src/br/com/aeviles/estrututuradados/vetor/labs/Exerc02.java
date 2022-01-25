package br.com.aeviles.estrututuradados.vetor.labs;

import java.util.ArrayList;

import br.com.aeviles.estrututuradados.vetor.Lista;

public class Exerc02 {

	public static void main(String[] args) {
		/*
		 * Melhore a classe Lista e implemente o método
		 * ultimoIndice, semelhante ao método lastIndexOf
		 * da classe ArrayList*/
		
		ArrayList<String> arrayList = new ArrayList<String>(5);//capacidade 5
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("G");
		
		System.out.println(arrayList.lastIndexOf("A"));
		
		Lista<String> lista = new Lista <String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("G");
		
		System.out.println(lista.ultimoIndice("A"));
		
	}

}
