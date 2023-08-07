package aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {

		int op;
		Scanner sc = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList<>();

		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("---------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produto ao estoque ?");
			System.out.println("\n(2) Deseja remover produto do estoque ?");
			System.out.println("\n(3) Deseja atualizar produto do estoque ?");
			System.out.println("\n(4) Deseja mostrar os produtos do estoque ?");
			System.out.println("\n(0) Deseja encerrar o programa ?");
			System.out.println("---------------------------------------------");
			System.out.println("\nDigite a opção");
			op = sc.nextInt();

			switch (op) {
			case 1:
				sc.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = sc.nextLine();
				estoque.add(produto);
				break;
			case 2:
				sc.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				produto = sc.nextLine();
				if (estoque.contains(produto)) {
					estoque.remove(produto);
				} else {
					System.out.println("Produto não existe");
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("\nDigite o produto que quer atualizar");
				String verifica = sc.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do anterior: ");
				String novo = sc.nextLine();
				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nProduto não existe");
				}
				break;
			case 4:
				System.out.println("\nOs produtos que temos no estoque são: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nPrograma finalizado");
				break;
			default:
				System.out.println("\nOpção invalida");
			}

		} while (op != 0);
	}

}
