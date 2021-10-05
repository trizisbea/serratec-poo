package exercicio1;

public class Program {

	public static void main(String[] args) {
		
		int[] vetor1 = {1, 2, 3, 4, 5};  
		int[] vetor2 = {3, 0, 4}; 
		
		for(int i = 0; i < vetor1.length; i++) {
		
			try {
			System.out.println("Divisão: " + "vetor1[i]" + "/" + "vetor2[i]" + "=" + (vetor1[i] / vetor2[1])); 
			}
			catch(ArithmeticException e) {
				System.out.println("Ocorreu um erro na divisão");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Ocorreu um erro ao tentar acessar o índice inexistente do vetor");
				
			}
				
			}		

	}

}
