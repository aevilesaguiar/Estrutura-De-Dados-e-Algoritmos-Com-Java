package br.com.aeviles.estrututuradados.fila.teste;
 
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

		public static void main(String[] args) {
				
			Queue<Paciente> filaComPrioridade = new PriorityQueue<>();
			
		
			filaComPrioridade.add(new Paciente("A", 2));
			filaComPrioridade.add(new Paciente("B", 1));
			
			System.out.println(filaComPrioridade);

}
}
