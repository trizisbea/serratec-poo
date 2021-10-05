package exercicio3;

public class Program {

	public static void main(String[] args) {
			
			Estado estado1 = new Estado("Rio de Janeiro", "RJ"); 
			Estado estado2 = new Estado("Minas Gerais", "MG");
			 
			Cidade cidade1 = new Cidade("Teresópolis", estado1);
			Cidade cidade2 = new Cidade("Petrópolis", estado1);
			
			Endereco endereco1 = new Endereco("Rua das Flores", "Centro", "25953600", cidade1);
			Endereco endereco2 = new Endereco("Rua da Fofoca", "Alto da Serra", "65894120", cidade2); 
			
			Telefone tel1 = new Telefone("9999-9999"); 
			Telefone tel2 = new Telefone("8888-8888");
			
			Contato contato1 = new Contato("Fulana", new Telefone[1]);
			Contato contato2 = new Contato("Fulano", new Telefone[2]);
			
			contato1.adicionarTelefone(tel1);
			contato2.adicionarTelefone(tel1);
					
		}

			public static void imprimirContato(Contato contato) {
			
			System.out.print(contato.toString());
		} 

	}


