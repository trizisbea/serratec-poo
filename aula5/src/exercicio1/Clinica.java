package exercicio1;

public class Clinica extends Plano {
	
	private String nome; 
	private String cgc;
	
	public Clinica(String nome, String cgc) {
		super(cgc);
		this.nome = nome;
		this.cgc = cgc;
	}

	public String getNome() {
		return nome;
	}

	public String getCgc() {
		return cgc;
	}
	
	

}
