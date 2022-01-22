package br.com.aeviles.estrututuradados.pilha.labs;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Exerc03 {

	public static void main(String[] args) {
		/*Utilize a classe Pilhae desenvolva:
		 * 1-Crie uma pilha com capacidade para 20 livros
		 * 2-Insira 6 livros na pilha: Cada livro possui nome, isbn, ano de lançamento
		 * e autor
		 * 3-Crie um exemplo para utilizar cada método da classe pilha.
		 * */
		
		Pilha<Livro> pilha = new Pilha<Livro>(20);
		
		Livro livro1 = new Livro();
		livro1.setNome("Estruturas de Dados e Algoritmos com JavaScript: Escreva um Código JavaScript Complexo e Eficaz Usando a Mais Recente ECMAScript");
		livro1.setIsbn("8575226932");
		livro1.setAutor("Loiane Groner");
		livro1.setAnoLancamento(2019);
		
		Livro livro2 = new Livro();
		livro2.setNome("Sencha Architect App Development ");
		livro2.setIsbn("1782169814");
		livro2.setAutor("Loiane Groner");
		livro2.setAnoLancamento(2013);
		
		Livro livro3 = new Livro();
		livro3.setNome("Mastering Ext Js");
		livro3.setIsbn("978-1783282258");
		livro3.setAutor("Loiane Groner");
		livro3.setAnoLancamento(2015);
		
		Livro livro4 = new Livro();
		livro4.setNome("JavaScript Regular Expressions (English Edition) ");
		livro4.setIsbn("1782164006");
		livro4.setAutor("Loiane Groner");
		livro4.setAnoLancamento(2013);
		
		Livro livro5 = new Livro();
		livro5.setNome("Ext Js 4 First Look  ");
		livro5.setIsbn("1849516669");
		livro5.setAutor("Loiane Groner");
		livro5.setAnoLancamento(2011);
		
		Livro livro6 = new Livro();
		livro6.setNome("Sencha Architect App Development ");
		livro6.setIsbn("1782169814");
		livro6.setAutor("Loiane Groner");
		livro6.setAnoLancamento(2013);
		
		System.out.println("Pilha de livro criada, pilha de livro estpa vazia?"+pilha.estaVazia());
		System.out.println("Empilhando livros na pilha:");
		
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);
		
		System.out.println(pilha.tamanho()+" livros foram empilhados:");
		System.out.println(pilha);
		

		System.out.println("Pilha de livro criada, pilha de livro está vazia?"+pilha.estaVazia());
		
		
		System.out.println("Espiando topo da pilha:  "+pilha.topo());
		
		System.out.println("Desempilhando livros na pilha:");
		
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando livro: "+pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
	}

}
