package br.com.aeviles.estrututuradados.pilha.labs;

import java.util.Stack;

public class Exerc08 {

	public static void main(String[] args) {
		// Usando a classe Pilha ou Stack , desenvolva um algoritmo
		//que resolva o quebra cabeça torre de Hanoi
		
		Stack<Integer> original = new Stack<>();
		Stack<Integer> destino = new Stack<>();
		Stack<Integer> auxiliar = new Stack<>();
		
		
		original.push(3);
		original.push(2);
		original.push(1);
		
		torreDeHanoi(original.size(), original, destino, auxiliar);
	}
	
	public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> dest, Stack<Integer> aux){
		
		if (n > 0){
			torreDeHanoi(n-1, original, aux, dest);
			dest.push(original.pop());
			System.out.println("------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + dest);
			System.out.println("Aux: " + aux);
			torreDeHanoi(n-1, aux, dest, original);
		}
		
	}
}
