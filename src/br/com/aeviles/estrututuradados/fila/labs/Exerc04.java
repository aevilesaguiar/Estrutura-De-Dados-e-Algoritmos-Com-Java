package br.com.aeviles.estrututuradados.fila.labs;

import java.util.Random;

import br.com.aeviles.estrututuradados.fila.Fila;

public class Exerc04 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa usando filas que simule a brincadeira da batata
		 * quente. A brincadeira consiste de um grupo de crian�as que fica em 
		 * circulo, sentado ou em pe. Uma crian�a foca fora da roda, de costas
		 * ou com os olhos vendados , dizendo a frase;"Batata quente, quente, quente...queimou!"
		 * Enquanto isso , os demais v�o passando a bola de m�o em m�o at� ouvirem a palavra "queimou".
		 * Quem estiver com a bola nesse momento sai da roda.
		 * Ganha o ultimo que sobrar*/
		
		
		Fila<Integer> fila = new Fila<>();
		
		for (int i=0; i<10;i++) {
			fila.enfileira(i);
		}
		
		Random aleatorio = new Random();
		int num=0;
		while(num ==0) {
			num = aleatorio.nextInt(10);
				
		}
		
		System.out.println("Numero ="+num);
		
		while(fila.tamanho()>1) {
			for(int i=0;i<num;i++) {
				fila.enfileira(fila.desenfileira());
			}
			System.out.println("Eliminado ="+fila.desenfileira());
		}
		System.out.println("Ganhador: "+fila.desenfileira());
	
	}

}
