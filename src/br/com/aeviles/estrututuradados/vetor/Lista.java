package br.com.aeviles.estrututuradados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	private T[] elementos; //
	private int tamanho;

	public Lista(int capacidade){
		this.elementos = (T[])new Object[capacidade];
		this.tamanho = 0;
	}
	
	
	public Lista(int capacidade, Class<T> tipoClasse){
		this.elementos = (T[])Array.newInstance(tipoClasse, capacidade);//USAR REFLEXION
		this.tamanho = 0;
	}
	
	public Lista(){
		
	}

		

	
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	// 0 1 2 3 4 5 6 = tamanho � 5
	// B C E F G + +
	//
	public boolean adiciona(int posicao, T elemento){
		
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	public T obtem(int posicao) {
		return this.busca(posicao);
	}
	
	
	public T busca(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		} 
		return this.elementos[posicao];
	}
	
	public int busca(T elemento){
		for (int i=0; i<this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	public int ultimoIndice(T elemento) {
			
		for (int i=this.tamanho-1; i>=0; i--){//se o tamanho do vetor quer dizer que o indce vai de 0 at� 4
			if (this.elementos[i].equals(elemento)){
				return i;
			}
		}	
		
		return -1;
	}
	
	//Exercicio lista
	public boolean contem(T elemento) {//T � do m�todo generics
		/*
		 * int pos = busca(elemento);
		 * if(pos>-1){
		 * return true;
		 * }
		 * return false;*/
		
		
		return busca(elemento)>-1;
	}
	
	// B D E F F -> posi��o a ser removida � 1 (G)
	// 0 1 2 3 4 -> tamanho � 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remove(int posicao){
		//verificar se a posi��o � v�lida ou n�o
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		//fazer um for para empurrar os elementos
		for (int i=posicao; i<this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;//por que o vetor vai passar de 5 para 4
	}
	
	//m�todo remove
	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if(pos>-1) {
			this.remove(pos);
		}
	}
	
	public void limpar() {
		/*//OP��O 1
		this.elementos=(T[])new Object[this.elementos.length]; 
		
		//OP��O2
		this.tamanho=0;//resseta os elementos
		*/
		//op��o 3
		
		for(int i =0; i<this.tamanho;i++) {
			this.elementos[i]=null;
		}
		
		this.tamanho=0;
	}
	
	public int tamanho(){
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	

}
