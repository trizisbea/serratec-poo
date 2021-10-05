package exercicio_mercado;

public class Item {
	
	private int quantidadeItens;
	private Produto produto;
	
	public Item(int quantidadeItens, Produto produto) {
		super();
		this.quantidadeItens = quantidadeItens;
		this.produto = produto;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	} 
	
	
}
