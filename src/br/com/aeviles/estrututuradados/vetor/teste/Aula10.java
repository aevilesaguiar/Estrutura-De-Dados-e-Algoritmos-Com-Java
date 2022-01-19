package br.com.aeviles.estrututuradados.vetor.teste;

import br.com.aeviles.estrututuradados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email1.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email2.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email3.com");	
		Contato c4 = new Contato("Contato 3", "3456-7890", "contato3@email3.com");	
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if (pos >-1){
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);

	}

}
