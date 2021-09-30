package exercicio1;

public class Program {

	public static void main(String[] args) {
		PessoaFisica testaIr1 = new PessoaFisica("Fulana", 5000, "1234", "4567");
		PessoaJuridica testaIr2 = new PessoaJuridica("Empresa x", 96000, "9876", "5612");
		
		testaIr1.calculoIr();
		testaIr2.calculoIr();
		

		System.out.println(testaIr1); 
		System.out.println(testaIr2); 
				
	}

}
