package aulas;

	public class Medico {
	int crm; 
	String nome; 
	double salario; 
	int valorConsulta;
	private static int total;
	
	public Medico(int i, String string, int j, int k) {
		this.crm = i; 
		this.nome = string; 
		this.salario = j; 
		this.valorConsulta = k;
		Medico.total = total + 1;
}
	public static int gettotal() {
		return total; 
	}

	public void pagamentoDinheiro(){
		
		double valorDinheiro = 0; 
		valorDinheiro = (valorConsulta / 1); 
		System.out.println("Pagamento do m�dico em consultas em dinheiro: " + valorDinheiro);
	}
	
	public void pagamentoPlano() {
		double valorPlano = 0;
		valorPlano = (valorConsulta * 0.70);
		System.out.println("Pagamento do m�dico em consultas pelo plano: " + valorPlano);
	}
	
	public void status() {
		System.out.println("Dados do m�dico: ");
		System.out.println("CRM " + this.crm);
		System.out.println("Nome do m�dico: " + this.nome);
		System.out.println("Sal�rio total: " + this.salario);
		System.out.println("Valor da Consulta: " + this.valorConsulta);
	}
	

}

