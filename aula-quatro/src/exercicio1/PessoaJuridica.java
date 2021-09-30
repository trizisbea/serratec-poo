package exercicio1;

public class PessoaJuridica extends ImpostoDeRenda {
	
	private String cnpj; 
	private String inscEstadual;
	
	public PessoaJuridica(String nome, double rendimento, String cnpj, String inscEstadual) {
		super(inscEstadual, rendimento);
		this.nome = nome; 
		this.rendimento = rendimento; 
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	} 
	
	public void calculoIr() {
		double valorPagar = 0;
		valorPagar = this.rendimento - (0.15 * rendimento);
		//System.out.print("\nValor a pagar: " + valorPagar);
	}
	
	@Override
	public String toString() {
		return String.format("Pessoa Jurídica - nome: %s, rendimento %2f, cnpj %s, incEstadual %s", this.nome, this.rendimento, this.cnpj,this.inscEstadual);
}
	
}
