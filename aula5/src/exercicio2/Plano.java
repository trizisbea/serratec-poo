package exercicio2;

public class Plano {
	
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss;
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "\nPlano [empresa=" + empresa + ", valorPago=" + valorPago + ", valorIss=" + valorIss + "]";
	} 
	
	public void calcularPagamento(){
		
		double valorInicial = 80;
		valorIss = 0.05 * valorPago;
		valorPago = valorInicial - valorIss;
	}

	public double getValorIss() {
		return valorIss;
	}

	public double getValorPago() {
		return valorPago;
	}

		

}
