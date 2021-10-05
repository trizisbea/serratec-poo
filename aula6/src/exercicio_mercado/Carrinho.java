package exercicio_mercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Item> Itens;

	public Carrinho() {
		this.Itens = new ArrayList<Item>(); 
	} 
	
	public double getValorTotal() {
		double valorTotal = 0;
		for(Item item : this.Itens) {
			Produto produto = item.getProduto();
			valorTotal += produto.Vender(item.getQuantidadeItens());
			
			
		}
		return valorTotal; 
	}
	
	public void addItem(Item item) {
		
		this.Itens.add(item);
	}
	

}
