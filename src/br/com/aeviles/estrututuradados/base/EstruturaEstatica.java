package br.com.aeviles.estrututuradados.base;

public class EstruturaEstatica<T> {//T significa o tipo da classe
	
	protected T[] elementos; 
	protected int tamanho;

	public EstruturaEstatica(int capacidade){
		this.elementos = (T[]) new Object[capacidade]; //solu��o do livro effective Java
		this.tamanho = 0;
	}
	
	public EstruturaEstatica(){
		this(10);//passando a capacidade 10
	}
	
	//adiciona no final
	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	//Adiciona em qualquer posi��o
	protected boolean adiciona(int posicao, T elemento){
			
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
		
		protected void aumentaCapacidade(){
			if (this.tamanho == this.elementos.length){
				T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
				for (int i=0; i<this.elementos.length; i++){
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
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
