package exerc�cio3;

//Cidade n�o � filha de um Estado, portanto, n�o � caso de heran�a

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
