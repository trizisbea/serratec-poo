package exercicio3;

public class Cidade extends Estado {
	
	private String nomeCidade;
	private Estado estado;
	
	
	public Cidade(String nomeCidade, Estado estado) {
		super(getNomeEstado(), sigla);
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}	
}
