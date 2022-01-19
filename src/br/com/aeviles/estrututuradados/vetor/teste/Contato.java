package br.com.aeviles.estrututuradados.vetor.teste;

import java.util.Objects;

public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	
	
	//Construtor da classe objet
	public Contato() {

	}
	
	Contato(String nome, String telefone, String email){
		super();
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefone, other.telefone);
	}

	
	
}
