package exercicio_map;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> carros = new HashMap<String, String>();
		
		carros.put("Fiat", "Palio");
		carros.put("Toyota", "Etios");
		carros.put("Renault", "Sandero");
		
		//mostra somente os itens do mapa
		for (String string : carros.keySet()) {
			System.out.println(string);
			
		}
		//mostra as chaves e os itens relacionados
		for (Map.Entry<String, String> entrada : carros.entrySet()) {
			System.out.println(entrada);
			
		}

	}

}
