package Exercicios;

public class Calculadora {
	public double calcular(double a, double b, int operacao) { 
		double resultado = 0;

		switch(operacao) {
		case 1: 
			resultado = a + b; break; 
			
		case 2:
			resultado = a - b; break;
			
		case 3: 
			resultado = a * b; break;
			
		case 4:
			resultado = a / b; break;
		
		default: 
			System.out.println("Sair"); break; 
		}
		return resultado; 
	}


}
