package ExercicioUm;

public class Program {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Fulano", "Silva", 3000); 
		Empregado empregado2 = new Empregado("Fulana", "Souza", 6500); 
		
		empregado1.calculaImpostoRenda();
		empregado2.calculaImpostoRenda();
		
		empregado1.status(); 
		empregado2.status(); 
		

}
}
