/* Faça um programa que percorra números entre 0 e 30 e exibe a quantidade de números pares e impares. */ 

package exercicios;

public class ParImpar {
	public static void Par() {
		int contagemPar = 0;
		int contagemImpar = 0; 
		
		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
			contagemPar = contagemPar + 1;
				}
			else 
			contagemImpar = contagemImpar + 1; 	
		}
		
System.out.println("Quantidade de números pares: " + contagemPar); 	
System.out.println("Quantidade de números pares: " + contagemImpar); 
	}
}
