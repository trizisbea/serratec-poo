package exercicio1;

public class Aluno extends AlunoException {
	
	private String nome; 
	private double nota1; 
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		super(nome);
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double calcularMedia() throws AlunoException {
		double media = (nota1 + nota2) / 2; 
		
		if(this.nota1 > 10 || this.nota2 > 10 || this.nota1 < 0 || this.nota2 < 0) {
			
			throw new AlunoException("É preciso que a nota esteja entre 0 e 10");
		}
		
		media = (nota1 + nota2) / 2;
		
		return media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}
	
	

}
