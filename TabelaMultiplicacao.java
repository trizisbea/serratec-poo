/*Fa�a uma tabela de multiplica��o para o n�mero 2 multiplicando do 1 at� 10. */

package exercicios;

public class TabelaMultiplicacao{
	public static void Multiplicar(){
	
	int num = 1;
	
	for(int i = 1; i <= 10; i++) {
	num = (i * 2); 
	System.out.println(i + " x" + " 2 " + "= " + num); 	
	}
	
	}
}
