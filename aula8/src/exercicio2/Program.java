package exercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Program p = new Program(); //lembre-se que a main � um classe est�tica, posso, mas n�o preciso instanciar!
		try {
			double numero = p.Imprimir(); 
			System.out.println("Voc� digitou " + numero); 
		}catch (Exception e) {
			System.out.println("Falha ao ler o n�mero");
		}
		

	}
	public double Imprimir() throws Exception { //throws Exception - n�o permite que o erro se propague
												//poderia ser um m�todo static, n�o sendo necess�rio instanciar a main
		System.out.println("Digite um n�mero inteiro: ");
		Scanner scanner = new Scanner(System.in); 
		double numero = scanner.nextDouble(); //armazenamento do n�mero digitado
		scanner.close(); //necess�rio fechar o scanner 
		return numero; 
	}

}
