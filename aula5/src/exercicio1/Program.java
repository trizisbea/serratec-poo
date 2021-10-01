package exercicio1;

public class Program {

	public static void main(String[] args) {
		
		Clinica c = new Clinica("Clinica x", "2255"); 
		
		Medico m = new Medico("Empresa x", "Ana Maria", 5698455); 
		
		Anestesista a = new Anestesista("Paula", 9532155, "Cirurgiã"); 
		
		m.calcularPagamento();
		System.out.println(m.toString());
		
		a.calcularPagamento(); 
		System.out.println(a.toString());

	}

}
