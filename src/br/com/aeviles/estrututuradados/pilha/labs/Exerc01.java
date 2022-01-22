package br.com.aeviles.estrututuradados.pilha.labs;

import java.util.Scanner;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Exerc01 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia 10 números. Para cada número lido,
		 * verifique e codifique de acordo com as regras a seguir:
		 * - se o numero for par, empilhe na pilha
		 * -se o numeo for impar, desempilhe um numero da pilha. Caso a pilha
		 * esteja vazia, mostre uma mensagem;
		 * -Se ao final do programa a pilha não estiver vazia, desempilhe todos os
		 * elementos, imprimindo-os na tela*/
		
		
		Pilha <Integer> pilha = new Pilha<Integer>(10);
		
		//ler numero
		
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=10;i++ ) {
			System.out.println("Entre com um numero: ");
			int num = scan.nextInt();
			
			if(num %2 ==0) {
				
				System.out.println("Empilhando o numero "+num);
				pilha.empilha(num);
			}else {
				Integer desempilhado = pilha.desempilha();
				if(desempilhado==null) {
					System.out.println("Pilha está vazia");
				}else {
					System.out.println("Numero impar, desempilhando um elemento da pilha: "+desempilhado);
				}
			}
		}
		
		System.out.println("Todos os numeros foram lidos, desempilhando numeros da pilha:");
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando um elemento da pilha: "+pilha.desempilha());
			}
		
		System.out.println("Todos os elementos foram desempilhados");
		}

}	


