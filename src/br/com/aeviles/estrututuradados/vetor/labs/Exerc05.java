package br.com.aeviles.estrututuradados.vetor.labs;

import java.util.ArrayList;

import br.com.aeviles.estrututuradados.vetor.Lista;

public class Exerc05 {

	public static void main(String[] args) {
		/*
		 * Melhore a classe Lista e implemente o método limpar
		 * onde todos os elementos da lista são removidos.
		 * Esse método é semelhante ao método clear da classe
		 * ArrayList*/
		
		ArrayList<String> arrayList = new ArrayList<String>(5);//capacidade 5
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("G");
		arrayList.add("h");
		arrayList.add("H");
		arrayList.add("I");
		System.out.println(arrayList);
		
		//Método clear ele remove todos os elementos
		arrayList.clear();
		System.out.println(arrayList);
		
		

		Lista<String> lista = new Lista <String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("G");
		lista.adiciona("h");
		lista.adiciona("H");
		lista.adiciona("I");
		
		System.out.println(lista);
		lista.limpar();
		System.out.println(lista);
		
		
	}

}
