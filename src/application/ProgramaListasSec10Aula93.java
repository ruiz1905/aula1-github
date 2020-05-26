package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaListasSec10Aula93 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");    // posição 0
		list.add("Alex");     // 1
		list.add("Bob");      // 2
		list.add("Anna");     // 3
		list.add(2, "Marco"); // 4  inserindo na posição 2 da lista
		
		System.out.println(list.size()); // tamanho da 5
		for (String x : list) {
			System.out.println(x); // Maria / Alex / Marco / Bob / Anna
		}
		
		System.out.println("--------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); // removeIf removendo com predicado (função lambda , dentro do parenteses)
		
		for (String x : list) {
			System.out.println(x); // Alex / Bob / Anna
		}
		
		System.out.println("--------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // encontrar a posição de um elemento
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // -1 Marco não existe na lista
		
		System.out.println("--------------------");
		// filtrar a lista todos que começam com A
		// declarar uma nova lista com o nome de result List<String> result = 
		// stream - tipo especial que aceita operações com expresões lambda(predicado) 
		// função filter recebe um predicado
		// o stream não é compativel com list tem que converter o stream para lista usando a função collect 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x); // Alex / Anna
		}
		
		// como encontrar um elemento na lista que atenda um certo predicado
		// findFirst pega o 1.o elemento do stream que atenda o predicado, se o elemento não existir retorna null
		System.out.println("--------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); 
		System.out.println(name); // == "A" - Alex     /   == "J" - null
	}
	
}
