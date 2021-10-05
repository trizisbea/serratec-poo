package exercicio_mercado;

public class BebidaAlcoolica extends Produto {
	
	private double teorAlcool;

	public BebidaAlcoolica(String nome, double valor, double teorAlcool) {
		super(nome, valor);
		this.teorAlcool = teorAlcool;
	}

	public double getTeorAlcool() {
		return teorAlcool;
	}

	public void setTeorAlcool(double teorAlcool) {
		this.teorAlcool = teorAlcool;
	}

	@Override
	public String toString() {
		return "\nBebidaAlcoolica [teorAlcool=" + teorAlcool + "]";
	}



}
