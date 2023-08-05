package exercicio3;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int number, index = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número a ser procurado na lista: ");
		number = sc.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == number) {
				index = i;
			}
		}

		if (index != 0) {
			System.out.printf("O número %d está localizado na posição: %d", number, index);
			return;
		}

		System.out.printf("O número %d não foi encontrado!", number);
		return;
	}

}
