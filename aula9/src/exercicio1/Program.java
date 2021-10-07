package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
	
		Aluno a1 = new Aluno("Bernardo", 5.5, 8.5); 
		Aluno a2 = new Aluno("Pedro", 6, 6); 
		Aluno a3 = new Aluno("Laura", 7.0, 8.5); 
		Aluno a4 = new Aluno("Fabiana", 7.5, 9); 
		
		List<Aluno> lista = new ArrayList <>(); 
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		try {
			a1.calcularMedia(); 
			System.out.println("A média do aluno " + a1.getNome() + " é " + a1.calcularMedia());
			
		}
		
		catch(AlunoException a) {
			
			System.out.println(a.getMessage());
			
		}
		

		for (Aluno aluno : lista) {
		System.out.println("Aluno: " + aluno);
			
		}
		
		

	}

}
