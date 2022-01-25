package br.com.aeviles.estrututuradados.fila.labs;

import br.com.aeviles.estrututuradados.fila.FilaComPrioridade;

public class Exerc03 {

	/*PRIORIDADES*/
	public static final int VERDE=2;
	public static final int AMARELO=1;
	public static final int VERMELHO=0;
	
	public static void main(String[] args) {
		/*
		 * Utilize a classe fila para simular um sistema de senhas de um pronto socorro.
		 * cada pessoa pode ser classificda com 3 códigos: vermelho de prioridade maior, amarelo de prioridade media 
		 * e verde quando a situação não é grave e a pessoa pode esperar mais tempo.
		 * O programa deve obedecer as seguintes condições:
		 * - enfileire 6 pessoas na fila inicial
		 * -pessoas coom prioridade vermelha devem ser atendidas primeiro;
		 * -cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado.
		 * A cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleatória
		 * 
		 * Crie um código para criar aleatoriedade*/
		
		FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
		fila.enfileira(new Pessoa("1", VERDE));
		fila.enfileira(new Pessoa("2", AMARELO));
		fila.enfileira(new Pessoa("3", VERMELHO));
		fila.enfileira(new Pessoa("4", VERDE));
		fila.enfileira(new Pessoa("5", VERDE));
		fila.enfileira(new Pessoa("6", VERMELHO));

		///começar o atendimento
		
		PSAtendimento atendimento = new PSAtendimento(fila);
		PSNovosPacientes pacientes= new PSNovosPacientes(fila);
		
		Thread t1 = new Thread(atendimento);
		Thread t2 = new Thread(pacientes);
		
		t1.start();
		t2.start();
		
		
	}

}
