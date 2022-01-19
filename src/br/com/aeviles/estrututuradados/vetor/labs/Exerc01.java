package br.com.aeviles.estrututuradados.vetor.labs;

import br.com.aeviles.estrututuradados.vetor.Lista;

public class Exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Melhore a classe lista e implemente o método contem,
		 *  semelhante ao contém da classe ArrayList
		 */
		Lista<String> lista = new Lista <String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("g"));
		
		
	}

}
