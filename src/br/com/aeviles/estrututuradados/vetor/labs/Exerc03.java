package br.com.aeviles.estrututuradados.vetor.labs;

import br.com.aeviles.estrututuradados.vetor.Lista;

public class Exerc03 {
	/*
	 * Melhore a classe Lista e implemente o m�todo remove (T elemento) , 
	 * onde ser� possivel remover um elemento da lista 
	 *passando o mesmo como o par�metro */

	public static void main(String[] args) {


		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println(lista);
		
		lista.remove("A");
		System.out.println(lista);
		
		lista.remove("F");
		System.out.println(lista);
		
		lista.remove("D");
		System.out.println(lista);
	}

}
