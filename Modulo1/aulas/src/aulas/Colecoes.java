package aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		ArrayList<Integer> minhaLista = new ArrayList<>();

		// adiciona elemento ao final da lista
		minhaLista.add(2);
		minhaLista.add(4);
		minhaLista.add(5);
		minhaLista.add(6);
		minhaLista.add(8);
		minhaLista.add(1);
		minhaLista.add(2);

		for (Integer el : minhaLista) {
			System.out.println(el);
		}

		System.out.println("--------------------");

		// remove elemento no index desejado
		Integer elementeRemovido = minhaLista.remove(0);
		System.out.println(elementeRemovido);

		System.out.println("--------------------");

		for (Integer el : minhaLista) {
			System.out.println(el);
		}

		System.out.println("--------------------");

		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		System.out.println("--------------------");
		
		Collections.sort(minhaLista);
		System.out.println(minhaLista);
		
		System.out.println("--------------------");

		Set<Integer> meuSet = new HashSet<Integer>(); //estrutura set
		
		meuSet.add(2);
		meuSet.add(7);
		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(3);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
	}

}
