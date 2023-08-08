package Exercicios5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class inQueue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		do {
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o nome: ");
				String cliente = sc.nextLine();
				cliente = sc.nextLine();
				fila.add(cliente);
				System.out.println("Cliente Adicionado!");
				System.out.println("------------------------");
			}

			if (opcao == 2) {
				if (fila.size() == 0) {
					System.out.println("Fila vazia");
					System.out.println("------------------------");
				} else {
					System.out.println(fila);
					System.out.println("------------------------");
				}
			}

			if (opcao == 3) {
				if (fila.size() == 0) {
					System.out.println("Fila vazia");
					System.out.println("------------------------");
				} else {
					String clienteChamado = fila.poll();
					System.out.printf("O cliente %s foi chamado: ", clienteChamado);
					System.out.println("\n------------------------");
				}
			}

		} while (opcao != 0);
		
		sc.close();
		
	}

}
