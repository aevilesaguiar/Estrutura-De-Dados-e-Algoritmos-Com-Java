package br.com.aeviles.estrututuradados.vetor.teste;

import br.com.aeviles.estrututuradados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		vetor.remove(0);
		System.out.println(vetor);
		vetor.remove(2);
		System.out.println(vetor);

		int pos = vetor.busca("A");
		if(pos>-1) {
			vetor.remove(pos);
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		System.out.println(vetor);
		
	}

}
