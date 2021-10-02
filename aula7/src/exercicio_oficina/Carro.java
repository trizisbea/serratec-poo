package exercicio_oficina;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAR.getValorporServico();
		
	}
	
	@Override
	public double trocarOleo() {
		if (this.dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY) ) {
			this.valorCobrado = this.valorCobrado + TipoServico.TROCADEOLEO.getValorporServico() - 50;
			
		}else {
			this.valorCobrado = this.valorCobrado + TipoServico.TROCADEOLEO.getValorporServico(); 
		}
		return valorCobrado; 
		
	}
	@Override
	public double fazerRevisao() {
		if (this.dataConserto.getMonth().equals(Month.AUGUST) ) {
			this.valorCobrado = this.valorCobrado + TipoServico.REVISAO.getValorporServico() - (this.valorCobrado * 0.10);
		} else {
			this.valorCobrado = this.valorCobrado + TipoServico.REVISAO.getValorporServico();
		}
		return valorCobrado;
		
	}
	 
	
	

}
