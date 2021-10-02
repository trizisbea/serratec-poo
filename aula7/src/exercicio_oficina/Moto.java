package exercicio_oficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
	
	private int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}
	
	@Override
	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAR.getValorporServico();
		
	}
	
	@Override
	public double trocarOleo() {
		return valorCobrado = valorCobrado + TipoServico.TROCADEOLEO.getValorporServico();
		
	}
	@Override
	public double fazerRevisao() {
		return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorporServico();	
		
	}

}
