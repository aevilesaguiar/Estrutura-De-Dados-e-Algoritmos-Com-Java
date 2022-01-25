package br.com.aeviles.estrututuradados.fila.labs;

import br.com.aeviles.estrututuradados.fila.FilaComPrioridade;

public class PSAtendimento implements Runnable {
	
	private FilaComPrioridade<Pessoa> fila;
	
	

	public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}


	//da interface Runnable, incluiremos um tempo
	@Override
	public void run() {

			while(!fila.estaVazia()) {
				try {
					System.out.println(fila.desenfileira()+" atendida");
					Thread.sleep(5000);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		System.out.println("Atendimento concluído");
	}

}
