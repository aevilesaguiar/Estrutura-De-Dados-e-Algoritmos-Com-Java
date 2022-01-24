package br.com.aeviles.estrututuradados.fila.labs;

import br.com.aeviles.estrututuradados.fila.Fila;

public class Exerc01 {

	public static void main(String[] args) {
		/*
		 * Usando  a estrutura de dados Fila, crie uma fila de documentosque precisam
		 * ser impressos . Cada documento é composto de um nome e quantidade de folhas
		 * a serem impressoras
		 * O programa deve:
		 * Enfileirar os docuemntos;
		 * E seguindo a ordem, o programa deve imprimir cada documento,
		 * desinfileirando da fila. Se desejar pode usar Threads para esperar 
		 * a impressão de acordo com o numero de folhas a serem impressas.*/
		
		
		Fila<Documento> filaImpressora = new Fila<Documento>();
		
		filaImpressora.enfileira(new Documento("A", 1));
		
		filaImpressora.enfileira(new Documento("B", 2));
		
		filaImpressora.enfileira(new Documento("C", 3));
		
		filaImpressora.enfileira(new Documento("D", 4));
		
		filaImpressora.enfileira(new Documento("E", 9));
		
		while(!filaImpressora.estaVazia()) {
			Documento doc = filaImpressora.desenfileira();
			System.out.println("Imprimindo documento "+ doc.getNome());
		try {
			Thread.sleep(200 * doc.getNumFolhas());
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		System.out.println("Todos os documentos foram impressos");
}
}
