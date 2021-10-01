package exercício3;

public class Estado {
	
	private String nomeEstado; 
	private String sigla;
	
	public Estado(String nomeEstado, String estado) {
		super();
		this.nomeEstado = nomeEstado;
		this.sigla = estado;
	}

	public Estado(String nomeCidade, Estado estado) {
		
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}
		

}
