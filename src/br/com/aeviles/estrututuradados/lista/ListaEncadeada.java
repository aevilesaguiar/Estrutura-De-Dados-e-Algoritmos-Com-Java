package br.com.aeviles.estrututuradados.lista;

public class ListaEncadeada <T>{
	
	private No <T>inicio;
	private int tamanho=0;//por padrão valores primitivos sempre começam com 0 
	
	public void adiciona(T elemento) {
		No <T> celula= new No<T>(elemento);
		this.inicio=celula;
		this.tamanho++;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + ", tamanho=" + tamanho + "]";
	}
	
	
	
	
	
	
	
}
