package exercicio2;

public class Atleta implements Olimp�adas {
	
	private String nome; 
	private double peso; 
	private String modalidade; 
	private static int totalParticipantes;
	
	public Atleta(String nome, double peso, Pa�s pa�s, String modalidade) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		totalParticipantes += 1;
	} 
	
	public String verificaSituacao() {
		
		if (this.peso > 90) {
			System.out.println("Participar�\n");
			}
			
			else if(this.peso < 90 && this.peso > 60) {
				System.out.println("Participar�\n");	
			}
			else {
				System.out.println("N�o Participar�\n");
			}
		return modalidade;
		}
		


	public String getNome() {
		return nome;
	}


	public double getPeso() {
		return peso;
	}


	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public static int getTotalParticipantes() {
		System.out.println("\nO total de participantes � " + totalParticipantes);
		return totalParticipantes;
		
	}
	
	 @Override
	public String toString() {
		return String.format("\nAtleta: %s Peso: %.2f Modalidade: %s", 
				this.nome, this.peso, this.modalidade);
	
	}

	 
	

}
