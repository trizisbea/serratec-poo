package exercicio2;

public class Program {

	public static void main(String[] args) {
		
		Pa�s p1 = new Pa�s("Brasil"); 
		Pa�s p2 = new Pa�s("Coreia do Sul"); 
		
		Atleta a1 = new Atleta("Fulano" , 85, p1, "Arco e flecha");
		Atleta a2 = new Atleta("Fulana" , 62, p2, "Futebol");
		Atleta a3 = new Atleta("Ciclano" , 59, p1, "Gin�stica");
			
		
		Atleta.getTotalParticipantes();
		
		System.out.println(a1.toString());
		a1.verificaSituacao();
		
		System.out.println(a2.toString());
		a2.verificaSituacao();
		
		System.out.println(a3.toString());
		a3.verificaSituacao();
		
		
}

} 
