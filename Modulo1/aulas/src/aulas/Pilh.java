package aulas;

import java.util.Iterator;
import java.util.Stack;

public class Pilh {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();

		pilha.push("Prato verde");
		pilha.push("Prato azul");
		pilha.push("Prato branco");
		pilha.push("Prato preto");

		System.out.println(pilha);

		System.out.println(pilha.pop());

		System.out.println(pilha.peek()); // mostra o ultimo elemento

		System.out.println(pilha.push("Prato roxo"));

		System.out.println(pilha);

		System.out.println(pilha.size());

		System.out.println(pilha.contains("Prato verde"));

		Iterator<String> iPilha = pilha.iterator();

		while (iPilha.hasNext()) {
			System.out.println(iPilha.next());
		}
		
		pilha.clear();
		
		System.out.println(pilha.isEmpty());

	}
}
