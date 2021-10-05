package exercicio_mercado;

public interface Venda {

	public static final double valor = 0;
	
	public default double Vender(double quantidadeItens) {
		return valor;
	}

}
