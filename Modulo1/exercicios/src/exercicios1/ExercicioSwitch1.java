package exercicios1;

import java.util.Scanner;

public class ExercicioSwitch1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int valorTotal;
		
		System.out.println("Digite o numero do pedido: ");
		int pedido = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		
		switch (pedido) {
		case 1: 
			System.out.println("Cachorro Quente");
			valorTotal = quantidade * 10;
			System.out.printf("Valor total: %d", valorTotal);
			break;
		case 2: 
			System.out.println("X-Salada");
			valorTotal = quantidade * 15;
			System.out.printf("Valor total: %d", valorTotal);
			break;
		case 3:
			System.out.println("X-Bacon");
			valorTotal = quantidade * 18;
			System.out.printf("Valor total: %d", valorTotal);
			break;
		case 4:
			System.out.println("Bauru");
			valorTotal = quantidade * 12;
			System.out.printf("Valor total: %d", valorTotal);
			break;
		case 5:
			System.out.println("Refrigerante");
			valorTotal = quantidade * 8;
			System.out.printf("Valor total: %d", valorTotal);
			break;
		case 6:
			System.out.println("Suco de laranja");
			valorTotal = quantidade * 13;
			System.out.printf("Valor total: %d", valorTotal);
			break;
		}
		
		sc.close();
		
	}

}
