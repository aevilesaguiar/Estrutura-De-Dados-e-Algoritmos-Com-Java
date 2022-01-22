package br.com.aeviles.estrututuradados.pilha.teste;

import java.util.Stack;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("A pilha está vazia:"+stack.isEmpty());
		
		/*empilhando - método push*/
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(44);
		
		
		System.out.println("A pilha está vazia:"+stack.isEmpty());
		
		System.out.println("Tamanho da pilha:"+stack.size());
		
		System.out.println("Último elemento da pilha:(peek espiar)"+stack.peek());
		
		System.out.println("Remove o Último elemento da pilha(pop - desempilha):"+stack.pop());
		
		
		
		
		
		

	}

}
