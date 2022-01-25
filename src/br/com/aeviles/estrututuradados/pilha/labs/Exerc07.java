package br.com.aeviles.estrututuradados.pilha.labs;

import java.util.Stack;

public class Exerc07 {

	public static void main(String[] args) {

		imprimeResultado(2);
		
		imprimeResultado(4);
		
		imprimeResultado(8);
		
		imprimeResultado(16);
		
		imprimeResultado(516);
		
		imprimeResultado(1050);
		
		
		
		imprimeResultadoQualquerBase(25, 16);

		imprimeResultadoQualquerBase(25, 8);
		
		imprimeResultadoQualquerBase(25, 2);
		
		imprimeResultadoQualquerBase(1035, 8);
		
		imprimeResultadoQualquerBase(1035, 16);
		
		
	}

	public static void imprimeResultado(int numero) {
		System.out.println(numero+" em binário é: "+decinakBinario(numero));
	}
	
	public static void imprimeResultadoQualquerBase(int numero, int base) {
		
		if(base>16) {
			throw new IllegalArgumentException();
		}
		System.out.println(numero+" na base "+base + " e "+ decimalQualquerBase(numero, base));
	}
	
	
	public static String decinakBinario(int numero) {
		Stack <Integer> pilha = new Stack<>();
		
		String numBinario = "";
		int resto;
		
		while (numero >0) {
			resto = numero%2;
			pilha.push(resto);
			numero/=2;
		}
		
		while(!pilha.isEmpty()) {
			numBinario+=pilha.pop();
		}
		
		return numBinario;
		
		
	}
	
	public static String decimalQualquerBase(int numero, int base) {
		Stack <Integer> pilha = new Stack<>();
		
		String numBase = "";
		int resto;
		String bases = "0123456789ABCDEF";
		
		
		while (numero >0) {
			resto = numero%base;
			pilha.push(resto);
			numero/=base;
		}
		
		while(!pilha.isEmpty()) {
			numBase+=bases.charAt(pilha.pop());
		}
		
		return numBase;
		
		
	}

}
