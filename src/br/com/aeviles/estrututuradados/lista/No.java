package br.com.aeviles.estrututuradados.lista;

public class No <T>{
	
	private T elemento; //o elemento é onde guardamos os elementos que podem ser de qualquer tipo
	private No <T>proximo;
	
		
	public No() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public No(T elemento, No<T> proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
	}



	public No(T elemento) {
		super();
		this.elemento = elemento;
		this.proximo = null;
	}



	public T getElemento() {
		return elemento;
	}
	
	public void setElemento(T elemento) {
		
		this.elemento = elemento;
	}
	
	public No<T> getProximo() {
		return proximo;
	}
	
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}



	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
	}
	
	
	

}
