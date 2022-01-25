package br.com.aeviles.estrututuradados.vetor.teste;

import br.com.aeviles.estrututuradados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		System.out.println(vetor);
		vetor.adiciona(3, "D");
		System.out.println(vetor);
	}

}
