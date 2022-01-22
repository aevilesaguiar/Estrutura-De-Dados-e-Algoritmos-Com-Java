package br.com.aeviles.estrututuradados.pilha;

import br.com.aeviles.estrututuradados.base.EstruturaEstatica;

public class Pilha <T> extends EstruturaEstatica<T>{
	
	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		
		/*
		 * poderiamos fazer dessa forma
		 * this.elementos[tamanho++]=elemento;
		 * 
		*/
		super.adiciona(elemento);
	}
	
	public T topo() {
		
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[tamanho-1];
	}
	
	public T desempilha() {
		
		if(this.estaVazia()) {
			return null;
		}
		/*
		 * T elemento = this.elementos[tamanho-1]; tamanho--; return elemento;
		 */
		
		return this.elementos[--tamanho];///diminui o tamanho e depois acessa ao elemento
	}
	

}
