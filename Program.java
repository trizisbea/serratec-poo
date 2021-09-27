package exercicios;

public class Program {

	public static void main(String[] args) {
	
	SituacaoAluno media = new SituacaoAluno(); 
	media.MediaAluno();
	
	ExerciciosVariaveis exercicio = new ExerciciosVariaveis();
	exercicio.Exercicio(); 
	
	CalculadoraMedia calcular = new CalculadoraMedia(); 
	calcular.Executar(); 
	
	CalculadoraSalario calculo = new CalculadoraSalario(); 
	calculo.Calcular(); 

	TiposPrimitivos casting = new TiposPrimitivos();
	casting.Casting(); 
	
	ParImpar par = new ParImpar(); 
	par.Par(); 
	
	MultiploDois multiplicar = new MultiploDois(); 
	multiplicar.Multiplicar(); 
	
	TabelaMultiplicacao multiplique = new TabelaMultiplicacao();
	multiplique.Multiplicar(); 
	
	Fatoriais fatorar = new Fatoriais(); 
	fatorar.Fatorar(); 
	}

} 
 