package Exercicios;

public class imovel {
	
	int codImovel; 
	String bairro; 
	String tipo; 
	double valor;
	
	void reajustar() {
		if (this.tipo == "casa") {
			double valorReajuste = (this.valor * 0.05) + this.valor; 
			System.out.println("Valor com reajuste: " +  valorReajuste); 
		}
		else {
			double valorReajuste = (this.valor * 0.08) + this.valor; 
			System.out.println("Valor com reajuste " + valorReajuste); 
		}
		
	}
	
	void categoria () {
	if (this.valor > 50000) {
		System.out.println("categoria A");
	}
	if (this.valor > 10000 && this.valor < 50000) {
		System.out.println("categoria B");
	}
	if (this.valor < 10000) {
		System.out.println("categoria C");
	
	}
	
}
	
}

