package exercicio2;

public class Program {

	public static void main(String[] args) {
	
		Gerente gerente = new Gerente("Fulana", 10000, "5"); 
		
		Assistente assistente = new Assistente("Fulano", 50000, 500);
		
		bonificar(gerente); 
		bonificar(assistente); 
			
	}

	private static void bonificar(Funcionario funcionario) {
		funcionario.bonificar();
		System.out.println(funcionario);
		
	}

}
