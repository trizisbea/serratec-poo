package ExercicioDois;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Pedido {
	private int numero;  
	private LocalDate dataPedido;
	private int quantidade; 
	private double valor; 
	private double total;
	public static int totalPedidos;
	

	
	public Pedido(int numero, LocalDate dataPedido, int quantidade, double valor) {
		super();
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		this.total = total;
	}


	protected int getNumero() {
		return numero;
	}


	protected LocalDate getDataPedido() {
		return dataPedido;
	}


	protected double getQuantidade() {
		return quantidade;
	}


	protected double getValor() {
		return valor;
	}


	protected double getTotal() {
		return total;
	}

	protected int getTotalPedidos() {
		return totalPedidos;
	}
	
	public void status() {
		
	}	
	
	void finalizar() {
		if (this.dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY) ) {
			this.total = (this.valor - this.valor * 0.1) * this.quantidade;
			
		}
		else {
			this.total = this.valor * this.quantidade;
		}
		
	}
	
}
