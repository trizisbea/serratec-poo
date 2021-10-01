package exercício3;

public class Program {

	public static void main(String[] args) {
		
		Estado estado1 = new Estado("Rio de Janeiro", "RJ"); 
		Estado estado2 = new Estado("Minas Gerais", "MG");
		
		Cidade cidade1 = new Cidade("Teresópolis", estado1);
		Cidade cidade2 = new Cidade("Petrópolis", estado1);
		
		Endereco endereco1 = new Endereco("Rua das Flores", "Centro", "25953600",cidade1);
		Endereco endereco2 = new Endereco("Rua da Fofoca", "Alto da Serra", "65894120", cidade2); 
		
		Contato contatinho1 = new Contato("Fulana", endereco1);
		Contato contatinho2 = new Contato("Fulano", endereco2);
		
		imprimirContato(contatinho1);
		imprimirContato(contatinho2);
		
		
	}

		public static void imprimirContato(Contato contato) {
		
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Endereco: " + contato.getEndereco()); 
	} 
	

}	
