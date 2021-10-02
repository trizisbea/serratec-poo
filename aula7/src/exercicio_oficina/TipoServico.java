package exercicio_oficina;

public enum TipoServico {
	
	TROCADEOLEO(100),
	LAVAR(50),
	REVISAO(200); 
	
	private double valorPorServico;
	
	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	double getValorporServico() {
		//this.valorPorServico = valorPorServico;
		return valorPorServico;
	
	}

}
