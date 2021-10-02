package exercicio_oficina;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		
		Proprietario p1 = new Proprietario("Fulano da Silva"); 
		
		Carro c = new Carro("Sedan", LocalDate.of(2021, 8, 28), p1, "Gol"); 
		//LocalDate.of(2021, 8, 28)
		//LocalDate.now()
		
		Moto m = new Moto("Modelo", LocalDate.of(2021,8,28), p1, 150); 
		
		c.trocarOleo(); 
		c.fazerRevisao(); 
		c.lavarVeiculo();
		
		m.trocarOleo(); 
		m.fazerRevisao(); 
		//m.lavarVeiculo();
		
		
		System.out.println(c.getValorCobrado());
		System.out.println(c.toString());
		
		System.out.println(m.getValorCobrado());
		System.out.println(m.toString());

	}

}
