package exercicio_mercado;

public class Program {

	public static void main(String[] args) {
		
		BebidaAlcoolica b1 = new BebidaAlcoolica("Cerveja", 12, 10);
		BebidaAlcoolica b2 = new BebidaAlcoolica("Vinho", 150, 25);
		Eletrodomestico e1 = new Eletrodomestico("TV", 2000, 220);
		Eletrodomestico e2 = new Eletrodomestico("Geladeira", 2352.64, 220);
		Eletrodomestico e3 = new Eletrodomestico("Radio", 837.59, 110); 
		
		Carrinho carrinho = new Carrinho();
		carrinho.addItem(new Item(5, b1));
		carrinho.addItem(new Item(3, b2));
		carrinho.addItem(new Item(9, e1));
		carrinho.addItem(new Item(3, e2));
		carrinho.addItem(new Item(1, e3));
		
		System.out.println(b1.toString());
		System.out.println("Valor da venda: " + b1.Vender(5));
		
		System.out.println(b2.toString());
		System.out.println("Valor da venda: " + b2.Vender(3));
		
		System.out.println(e1.toString());
		System.out.println("Valor da venda: " + e1.Vender(9));
		
		System.out.println(e2.toString());
		System.out.println("Valor da venda: " + e2.Vender(3));
		
		System.out.println(e3.toString());
		System.out.println("Valor da venda: " + e3.Vender(1));
		
		//System.out.println("Valor total da venda: " + (b1.Vender(5) + b2.Vender(3) + e1.Vender(9) + e2.Vender(3) + e3.Vender(1)));
		
		System.out.println("\nTotal da compra: " + carrinho.getValorTotal());
	}
	
}
