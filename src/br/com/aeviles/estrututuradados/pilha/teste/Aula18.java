package br.com.aeviles.estrututuradados.pilha.teste;

import java.util.Stack;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("A pilha est� vazia:"+stack.isEmpty());
		
		/*empilhando - m�todo push*/
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(44);
		
		
		System.out.println("A pilha est� vazia:"+stack.isEmpty());
		
		System.out.println("Tamanho da pilha:"+stack.size());
		
		System.out.println("�ltimo elemento da pilha:(peek espiar)"+stack.peek());
		
		System.out.println("Remove o �ltimo elemento da pilha(pop - desempilha):"+stack.pop());
		
		
		
		
		
		

	}

}
