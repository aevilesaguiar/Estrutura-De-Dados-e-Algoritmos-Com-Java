package br.com.aeviles.estrututuradados.vetor.teste;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula12 {

	public static void main(String[] args) {
		
		//arrayList ela p ArrayList<E> 
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//adiciona o elemento no final da 
		arrayList.add("A");
		arrayList.add("B");
		
		System.out.println(arrayList);
		
		//adicionar o elemento em uma determinada posição
		arrayList.add(1,"C");
		System.out.println(arrayList);
		arrayList.add(1,"G");
		System.out.println(arrayList);
		
		//método contains faz a busca
		boolean existe = arrayList.contains("C");
		
		if(existe) {
			System.out.println("Elemento existe no array");
		}else {
			System.out.println("Elemento não existe no array");
		}
		
		//método de busca indexOf, retorna o indice que o objeto se encontra
		int pos = arrayList.indexOf("A");
		
		if(pos>-1) {
			System.out.println("Elemento existe no array: "+pos);
		}else {
			System.out.println("Elemento não existe no array: "+pos);
		}
		
		//Busca por posição através do método get
		System.out.println(arrayList.get(1));
		
		//método para remover
		arrayList.remove(0); // remove passando o índice
		arrayList.remove("B");//remove o objeto
		
		System.out.println(arrayList);
		
	
		//tamanho no arrayList
		System.out.println(arrayList.size());
		
		//verificar se está vazio
		System.out.println(arrayList.isEmpty());
		
		
		//Percorrendo lista
		arrayList.forEach(lista->{
			System.out.println("Percorrendo");
			System.out.println("Lista: " + lista);
		});
		
	}

}

