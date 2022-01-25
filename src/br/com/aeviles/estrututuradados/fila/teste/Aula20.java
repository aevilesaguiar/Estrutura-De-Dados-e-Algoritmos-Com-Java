package br.com.aeviles.estrututuradados.fila.teste;

import br.com.aeviles.estrututuradados.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {
		
		//fila sempre ir para o final
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(4);
		fila.enfileira(5);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		System.out.println(fila);
		
		fila.enfileira(6);
		fila.enfileira(7);
		fila.enfileira(8);
		
		System.out.println(fila);
		

	}

}
