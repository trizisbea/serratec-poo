package exercicio1;

public class ImpostoDeRenda {
	
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimento;
	
	public ImpostoDeRenda(String nome, double rendimento) {
		super();
		this.nome = nome;
		this.rendimento = rendimento;
	}
	
	public void status() {
		System.out.println("\nNome: " + nome+ "\nTelefone: " + telefone + "\ne-mail: " + email + "\nRendimento: " + rendimento); 
							

	}	
	
}
