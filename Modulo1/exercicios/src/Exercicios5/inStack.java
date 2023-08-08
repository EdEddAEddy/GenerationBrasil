package Exercicios5;

import java.util.Scanner;
import java.util.Stack;

public class inStack {

	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		do {

			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o nome: ");
				String livro = sc.nextLine();
				livro = sc.nextLine();
				livros.push(livro);
				System.out.println("Livro Adicionado!");
				System.out.println("------------------------");
			}

			if (opcao == 2) {
				if (livros.size() == 0) {
					System.out.println("Pilha vazia");
					System.out.println("------------------------");
				} else {
					System.out.println(livros);
					System.out.println("------------------------");
				}
			}

			if (opcao == 3) {
				if (livros.size() == 0) {
					System.out.println("Pilha vazia");
					System.out.println("------------------------");
				} else {
					String livroRemovido = livros.pop();
					System.out.printf("O livro '%s' foi removido: ", livroRemovido);
					System.out.println("\n------------------------");
				}
			}
		} while (opcao != 0);

		sc.close();
		
	}

}
