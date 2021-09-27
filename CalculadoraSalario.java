package exercicios;

public class CalculadoraSalario {
	public static void Calcular() {
		double salario = 1700; 
		
		if (salario < 1751.81) {
			System.out.println(salario + (0.08*salario));
		}
		else if (salario > 1751.82 && salario < 2.919) {
			System.out.println(salario + (0.09*salario)); 	
	}
		else if (salario > 2919.73 && salario < 5839.45) {
			System.out.println(salario + (0.10*salario)); 	
		}
		else if (salario > 5839.456) {
		System.out.println(salario + (0.11*salario));	
		}
	} 
} 
	

	