package br.com.aeviles.estrututuradados.vetor;

public class Vetor {

	//declarando um vetor de elementos
	private String[] elementos;//no caso da string o valor inicial � null, se fosse boolean � false...
	private int tamanho;

	
	//declarar um construtor
	public Vetor(int capacidade) {
		this.elementos=new String[capacidade];
	}
	
	
	
	/*public void adiciona(String elemento) {
		for (int i=0; i<this.elementos.length;i++){
			
			if(this.elementos[i]==null) {
				this.elementos[i]=elemento;
				break;
			}
		}
	
		
	}*/
	
	public void adiciona(String elemento) {
		this.elementos[this.tamanho]=elemento;
		this.tamanho ++;
	}
	

}
