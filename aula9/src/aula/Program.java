package aula;

public class Program {

	public static void main(String[] args) {
		
		Funcionario[] vetor = new Funcionario[] {
				
			new Funcionario ("Fulano", "atendente", 3500),
			new Funcionario ("Fulana", "gerente", 6000),
				
		};
		
		for (Funcionario f : vetor) {
			double abono = 500;
			f.abonoSalario(abono); 
			System.out.println(f); 
		}
	
	
	
	}
	


}