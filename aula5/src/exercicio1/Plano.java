package exercicio1;

public class Plano {
	
	protected String empresa;
	protected double valorPago;
	protected double valorIss;
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Plano [empresa=" + empresa + ", valorPago=" + valorPago + ", valorIss=" + valorIss + "]";
	} 
	
	public void calcularPagamento(){
		
		double valorInicial = 80;
		valorIss = 0.05 * valorPago;
		valorPago = valorInicial - valorIss;
	}

	public double getValorIss() {
		return valorIss;
	}
	
	

}
