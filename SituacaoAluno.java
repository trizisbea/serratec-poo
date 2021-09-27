package exercicios;

public class SituacaoAluno {
	 public static void MediaAluno() {
			double nota1 = 8; 
			double nota2 = 9; 
			
			double media = ((nota1 + nota2)/2); 
			
			if(media >= 7) {
				if (media == 10) {
					System.out.println("Aprovado Parabéns!");}
					else {
						System.out.println("Aprovado!");	
					}
				}
			
			else 
			System.out.println("Reprovado!");	
}
} 
