package Exercicios;

import javax.swing.JOptionPane; 

public class MainCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(); 
		int opcao; 
		double resultado; 
		String menu = "Digite uma das op��es abaixo \n" + "1 - Soma \n" + "2 - Subtra��o \n" + "3 - Multiplica��o \n" + "4 - Divis�o \n" + "5 - Sair";
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu,"Calculadora - JAVA", JOptionPane.QUESTION_MESSAGE));
		
		while (opcao != 5) {
			
		String numero1 = JOptionPane.showInputDialog("Digite um valor: "); 
		String numero2 = JOptionPane.showInputDialog("Digite mais um valor: "); 
		
		resultado = calculadora.calcular(Double.parseDouble(numero1), Double.parseDouble(numero2), opcao);
		
		JOptionPane.showMessageDialog(null, resultado); 
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "CALCULADORA - JAVA, JOptionPane.QUESTION_MESSAGE"));
		
		}
	}

}
