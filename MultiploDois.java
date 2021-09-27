/*Faça um programa que percorra todos os número de 1 até 22. Para os números múltiplos de 2, imprima a palavra “Java”, e
mostre o total de múltiplos de 2 encontrado. */

package exercicios;

public class MultiploDois {
	public static void Multiplicar() {
	int numpar = 0; 
	int num = 1;
	
	for(int i = 1; i <= 22; i++) {
		if(i % 2 == 0) {
	num = i; 		
	numpar = numpar + 1;
	System.out.println("Java " + num) ;
			
		}
	}
	System.out.println("Número de pares: " + numpar);
	}
}
