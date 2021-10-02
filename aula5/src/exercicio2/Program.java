package exercicio2;

public class Program {

	public static void main(String[] args) {
		
		Clinica c = new Clinica("Empresa x", "Clinica x", "2255"); 
		
		Medico m = new Medico("Empresa x", "Ana Maria", 5698455); 
		
		Anestesista a = new Anestesista("Paula", 9532155, "Cirurgiã"); 
		
		ControlePagamento cp = new ControlePagamento(); 
		
		cp.calcularTotalPago(c);
		cp.calcularTotalPago(m);
		cp.calcularTotalPago(a);
		
		m.calcularPagamento();
		System.out.println(m.toString());
		
		a.calcularPagamento(); 
		System.out.println(a.toString());
		
		c.calcularPagamento(); 
		System.out.println(c.toString());
		
		System.out.println("\nTotal pago: " + cp.getTotalPago());

	}

}
