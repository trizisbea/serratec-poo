package ExercicioUm;

public class Empregado {
	private String nome; 
	private String sobrenome; 
	private double salario;
	private double salarioDesconto; 
	
	
	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	

	protected String getNome() {
		return nome;
	}


	protected void setNome(String nome) {
		this.nome = nome;
	}


	protected String getSobrenome() {
		return sobrenome;
	}


	protected void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	protected double getSalario() {
		return salario;
	}


	protected void setSalario(double salario) {
		this.salario = salario;
	} 
	
	public void calculaImpostoRenda() {
	
		if (salario < 1903.98) {
				salarioDesconto = (salario * 1);}
				else if (salario > 1903.98 && salario < 2826.65) {
					salarioDesconto = salario - (salario * 0.075);
		}			else if (salario > 2826.65 && salario < 3751.05) {
				salarioDesconto = salario - (salario * 0.15); }
						else if (salario > 3751.06 && salario < 4664.68) {
							salarioDesconto = salario - (salario * 0.225);}
								else {
									salarioDesconto = salario - (salario * 0.275); 
				return; 
									 
			}
		
		}

		public void status() {
			System.out.println("Dados do usuário " + "\nNome: " + nome + "\nSobrenome: " + sobrenome + 
					"\nSalário com desconto: " + salarioDesconto);
			
		}
		

			
}
		
		
		
			
			
			
		
	


