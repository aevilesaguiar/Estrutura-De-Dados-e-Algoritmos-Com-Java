package br.com.aeviles.estrututuradados.pilha.labs;

import java.util.Scanner;

import br.com.aeviles.estrututuradados.pilha.Pilha;

public class Exerc02 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia 10 números. Para cada número lido,
		 * verifique e codifique de acordo com as regras a seguir:
		 * - se o numero for par, empilhe na pilha chamada par;
		 * -se o numeo for impar,empilhe na pilha chamada impar;
		 * -se o numero for zero(0), desempilhe um elemento de cada pilha.
		 * Caso alguma pilha esteja vazia, mostre uma mensagem de erro na tela.
		 * Ao final do programa desempilhe todos os elementos das duas pilhas
		 * imprimindo-os na tela
		 * */
		
		Pilha <Integer> par = new Pilha<Integer>();
		Pilha <Integer> impar = new Pilha<Integer>();
		
		//ler numero
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=10;i++ ) {
			System.out.println("Entre com um numero: ");
			int num = scan.nextInt();
			
			if(num ==0) {
				//pilha par
				
				Integer desempilhado = par.desempilha();
				
				if(desempilhado==null) {
					System.out.println("Pilha Par Vazia");
				}else {
					System.out.println("Desempilhando da pilha par:"+desempilhado);
				}

				//pilha impar
				desempilhado = impar.desempilha();
				
				if(desempilhado==null) {
					System.out.println("Pilha Ímpar Vazia");
				}else {
					System.out.println("Desempilhando da pilha ímpar:"+desempilhado);
				}
				
				
				
			}else if(num %2 ==0) {
				System.out.println("Número par, empilhando na pilha par: "+num);
				par.empilha(num);
				
			}else {
				System.out.println("Número par, empilhando na pilha ímpar: "+num);
				impar.empilha(num);
			}
		}
	System.out.println("Desempilhando todos os numeros da pilha par:");
	
	while(!par.estaVazia()) {
		System.out.println("Desempilhando da pilha par: "+par.desempilha());
	}
	System.out.println("Desempilhando todos os números da pilha ímpar");
	
	while(!impar.estaVazia()) {
		System.out.println("Desempilhando da pilha ímpar: "+impar.desempilha());
	}
	
	}
		

}	


