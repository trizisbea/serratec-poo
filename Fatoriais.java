/* Liste os fatoriais de 1 a 10 */ 

package exercicios;

public class Fatoriais {
	public static void Fatorar() {
		
	int fator = 1;
	
	for(int i = 1; i <= 10; i++) {
	fator = (fator * i);
	System.out.println("O fatorial de " + i + " é " + fator);	
	}
	}
}
