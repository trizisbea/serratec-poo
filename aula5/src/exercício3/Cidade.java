package exercício3;

//Cidade não é filha de um Estado, portanto, não é caso de herança

public class Cidade extends Estado {
	
	public Cidade(String nomeCidade, Estado estado) {
		super(nomeCidade, estado);
		this.nomeCidade = nomeCidade; 
		this.estado = estado;
	}

	private String nomeCidade;
	private Estado estado;
	


	public String getNomeCidade() {
		return nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}

			

}
