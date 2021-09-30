package exercicio1;

public class PessoaFisica extends ImpostoDeRenda {
	
	private String cpf;
	private String rg;

	public PessoaFisica(String nome, double rendimento, String cpf, String rg) {
		super(nome, rendimento);
		this.nome = nome; 
		this.rendimento = rendimento; 
		this.cpf = cpf; 
		this.rg = rg;
		
	}
	
	public void calculoIr() {
		double valorPagar = 0;
		valorPagar = this.rendimento - (0.12 * rendimento);
		//System.out.print("\nValor a pagar: " + valorPagar);
	}
	
		@Override
	public String toString() {
		return String.format("Pessoa Física - nome: %s, rendimento %2f, cpf %s, rg %s", this.nome, this.rendimento, this.cpf,this.rg);
		
	}
	
	

}
