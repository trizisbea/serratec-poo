package exercicio3;

public class Estado {
	
	protected static String nomeEstado; 
	protected static String sigla;
	
	public Estado(String nomeEstado, String sigla) {
		super();
		this.nomeEstado = nomeEstado;
		this.sigla = sigla; 
	}


	public static String getNomeEstado() {
		return nomeEstado;
	}



}
