package exercicio3;

import java.util.Arrays;

public class Contato {
	private String nome; 
	private Endereco endereco;
	private Telefone[] telefones; 
	
	public Contato(String nome, Telefone[] telefones) {
		this.nome = nome;
		this.telefones = telefones; 
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Endereco getEndereco() {
		return endereco;
	}
	
	
	
	public Telefone[] getTelefones() {
		return telefones;
	}


	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	public void adicionarTelefone(Telefone telefone) {
		for(int i = 0; i < this.telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = telefone; break; } 
		}
	}
		
		public void mostrarTelefones() {
			for (int i = 0; i < this.telefones.length; i++) {
				System.out.println("Telefone: " + telefones[i].getNumero());
		}
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", endereco=" + endereco + ", telefones=" + Arrays.toString(telefones) + "]";
	}

}
