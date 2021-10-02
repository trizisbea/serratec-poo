package exercicio2;

public class Medico extends Plano {
	
	protected String nome; 
	private int crm;
	
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "\nMedico [nome=" + nome + ", crm=" + crm + ", empresa=" + empresa + ", valorPago=" + valorPago
				+ ", valorIss=" + valorIss;
	}

	public String getNome() {
		return nome;
	}

	public int getCrm() {
		return crm;
	} 
	
	public void calcularPagamento() {
		double valorInicial = 80;
		valorIss = 0.05 * valorInicial;
		valorPago = (valorInicial - valorIss) + (0.10 * valorInicial);
	}
	
	

}
