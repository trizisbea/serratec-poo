package exercicio2;

public class Gerente extends Funcionario {
	
	private String nivel;

	public Gerente(String nome, double salario, String nivel) {
		super(nome, salario);
		this.nivel = nivel;
	}
	
	@Override
	public void bonificar() {
		super.bonificar();
		this.salario += 200; 
	}

}
