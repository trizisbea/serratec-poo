package exercicio_mercado;

public class Eletrodomestico extends Produto {
	
	private int voltagem;
	
	

	public Eletrodomestico(String nome, double valor, int voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public String toString() {
		return "Eletrodomestico [nome= " + getNome() + " valor = " + getValor() + " voltagem = " + voltagem + "]";
	}
	

}
