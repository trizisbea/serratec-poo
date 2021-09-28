package aulas;

	public class Medico {
	private int crm; 
	private String nome; 
	private double salario; 
	private int valorConsulta;
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
		salario = (valorConsulta / 1); 
		System.out.println("Pagamento do médico em consultas em dinheiro: " + valorDinheiro);
	}
	
	public void pagamentoPlano() {
		salario = (valorConsulta * 0.70);
		System.out.println("Pagamento do médico em consultas pelo plano: " + valorPlano);
	}
	
	public void status() {
		System.out.println("Dados do médico: ");
		System.out.println("CRM " + this.crm);
		System.out.println("Nome do médico: " + this.nome);
		System.out.println("Salário total: " + this.salario);
		System.out.println("Valor da Consulta: " + this.valorConsulta);
	}
	

}

