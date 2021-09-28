package aulas;

public class Program {

	public static void main(String[] args) {
		
		Medico m1 = new Medico(12345, "Ana Maria", 0, 250);
		
		Medico m2 = new Medico(456789, "Antonio", 0, 300);
		
		m1.pagamentoPlano();
		m2.pagamentoPlano();
		
		m1.pagamentoDinheiro();
		m2.pagamentoDinheiro();
		 
		m1.status();
		m2.status();
		
		System.out.println("Total de médicos: " + Medico.gettotal()); 
	}

}
