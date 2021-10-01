package exercicio1;

public class Anestesista extends Medico {
	
	private String tipoAnestesista;

	public Anestesista(String nome, int crm, String tipoAnestesista) {
		super(nome, tipoAnestesista, crm);
		this.tipoAnestesista = tipoAnestesista;
	}

	public String getTipoAnestesista() {
		return tipoAnestesista;
	}

	public void setTipoAnestesista(String tipoAnestesista) {
		this.tipoAnestesista = tipoAnestesista;
	}

	
	@Override
	public void calcularPagamento(){
		
		double valorInicial = 80;
		valorIss = 0.05 * valorInicial;
		valorPago = (valorInicial - valorIss) + (0.10 * valorInicial) + 1000;
		
	}

	@Override
	public String toString() {
		return "Anestesista [tipoAnestesista=" + tipoAnestesista + ", nome=" + nome + ", valorPago=" + valorPago + ", valorIss=" + valorIss + "]";
	}

	

}
