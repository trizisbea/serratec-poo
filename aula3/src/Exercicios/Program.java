package Exercicios;

public class Program {

	public static void main(String[] args) {
		
	imovel MainImovel = new imovel(); 
	
	MainImovel.bairro = "Centro";
	MainImovel.tipo = "apto";
	MainImovel.valor = 25000;
	
	imovel MainImovel2 = new imovel(); 
	
	MainImovel2.bairro = "Quitandinha"; 
	MainImovel2.tipo = "casa"; 
	MainImovel2.valor = 98900; 
	
	MainImovel.categoria(); 
	MainImovel2.categoria();
	
	MainImovel.reajustar(); 
	MainImovel2.reajustar();
	
	}

}
