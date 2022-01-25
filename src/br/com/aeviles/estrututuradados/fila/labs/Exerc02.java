package br.com.aeviles.estrututuradados.fila.labs;

import br.com.aeviles.estrututuradados.fila.Fila;

public class Exerc02 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que simule a distribuição de senhas de atendimento
		 * a um grupo de pessoas. Cada pessoa pode receber uma senha prioritária ou uma senha normal. 
		 * O programa deve obedecer o seguinte critério:
		 * -Existe apenas 1 atendente;
		 * -1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária
		 * -Não havendo prioridades, as pessoas com senha normal podem ser atendidas
		 * */
		
		Fila<String> regular = new Fila<>();
		Fila<String> prioridade = new Fila<>();
		
		final int MAX_PRIORIDADE = 3;

		
		regular.enfileira("Pessoa 1");
		regular.enfileira("Pessoa 2");
		regular.enfileira("Pessoa 3");
		prioridade.enfileira("Pessoa 1P");
		prioridade.enfileira("Pessoa 2P");
		prioridade.enfileira("Pessoa 3P");
		prioridade.enfileira("Pessoa 3P");
		prioridade.enfileira("Pessoa 3P");
		regular.enfileira("Pessoa 4");
		regular.enfileira("Pessoa 5");
		regular.enfileira("Pessoa 6");
		regular.enfileira("Pessoa 7");
		regular.enfileira("Pessoa 8");
		
		
		while (!regular.estaVazia() || !prioridade.estaVazia()) {
			int cont=0;
			while(!prioridade.estaVazia()&& cont<MAX_PRIORIDADE) {
				atendePessoa(prioridade);
				cont ++;
			}
			
			if(!regular.estaVazia()) {
				atendePessoa(regular);
				
			}
			if(prioridade.estaVazia()) {
				while(!regular.estaVazia()) {
					atendePessoa(regular);
				}
			}
			
		}
	}
	public static void atendePessoa(Fila<String> fila) {
		String pessoaAtendida = fila.desenfileira();
		System.out.println(pessoaAtendida+" foi atendida");
	}
}
