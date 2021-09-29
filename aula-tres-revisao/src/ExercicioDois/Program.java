package ExercicioDois;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		
		Pedido p1 = new Pedido(1, LocalDate.now(), 3, 65.90); 
		Pedido p2 = new Pedido(2, LocalDate.of(2021, 5, 28), 3, 26.52); 
		
		p1.finalizar(); 
		p2.finalizar(); 
				
	}

}
