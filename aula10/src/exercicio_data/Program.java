package exercicio_data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate datanasc = LocalDate.of(1999, 4, 24); 
		LocalDate hoje = LocalDate.now(); 
		
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Data de nascimento: " + datanasc.format(formatar));
		System.out.println("Data de hoje: " + hoje.format(formatar));
		
		System.out.println("Meu nascimento foi num ano bissexto? " + datanasc.isLeapYear());
		
		LocalDateTime segnasc = LocalDateTime.of(1999, 4, 24, 11, 20, 00); 
		LocalDateTime agora = LocalDateTime.now();
		
		Duration duracao = Duration.between(segnasc, agora);
		System.out.println("Quantos segundos desde que eu nasci? " + duracao.getSeconds());
		
		

	}

}
