package br.com.aeviles.estrututuradados.vetor.teste;

import br.com.aeviles.estrututuradados.vetor.Lista;
import br.com.aeviles.estrututuradados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {

		Lista<String> vetor = new Lista<String>(1);
		vetor.adiciona("Elemento");
		//não é possivel passar tipo inteiro, nem um objeto apenas uma String
		//vetor.adiciona(1); não compila
		//vetor.adiciona(new Contato());não compila
		
		vetor.adiciona("Elemento");
		System.out.println(vetor);
		
		Lista<Contato> vetor1 = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email1.com");
		
		
		vetor1.adiciona(c1);
		System.out.println(vetor1);
		
	}

}
