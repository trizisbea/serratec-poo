package exercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Program p = new Program(); //lembre-se que a main é um classe estática, posso, mas não preciso instanciar!
		try {
			double numero = p.Imprimir(); 
			System.out.println("Você digitou " + numero); 
		}catch (Exception e) {
			System.out.println("Falha ao ler o número");
		}
		

	}
	public double Imprimir() throws Exception { //throws Exception - não permite que o erro se propague
												//poderia ser um método static, não sendo necessário instanciar a main
		System.out.println("Digite um número inteiro: ");
		Scanner scanner = new Scanner(System.in); 
		double numero = scanner.nextDouble(); //armazenamento do número digitado
		scanner.close(); //necessário fechar o scanner 
		return numero; 
	}

}
