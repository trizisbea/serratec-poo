package exercicio2;

public class Funcionario {
	
		protected String nome;
		protected String cpf;
		protected double salario;
		protected String turno;
		
		public Funcionario(String nome, double salario) {
			super();
			this.nome = nome;
			this.salario = salario;
		}
		
		@Override
		public String toString() {
			return String.format("nome: %s, salário: %2f", this.nome, this.salario);
		}

		public void bonificar() {
			// TODO Auto-generated method stub
			
		}
		
		
}

