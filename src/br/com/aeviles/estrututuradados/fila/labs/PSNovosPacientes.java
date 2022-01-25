package br.com.aeviles.estrututuradados.fila.labs;

import java.util.Random;

import br.com.aeviles.estrututuradados.fila.FilaComPrioridade;

public class PSNovosPacientes implements Runnable {

	private FilaComPrioridade<Pessoa> fila;
	private int cont = 7;
	private Random prioridade = new Random();
	
	
	public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	//da interface Runnable, incluíremos um tempo
	@Override
	public void run() {

		for(int i=0;i<8;i++) {
			try {
				Thread.sleep(8000);
				Pessoa p=new Pessoa(""+ cont, prioridade.nextInt(3));
				fila.enfileira(p);
				cont++;
				System.out.println(p+" enfileirada ");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
