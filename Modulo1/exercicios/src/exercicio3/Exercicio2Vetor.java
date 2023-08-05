package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];
		ArrayList<Integer> elPar = new ArrayList<>();
		ArrayList<Integer> elImpar = new ArrayList<>();
		int sum = 0;
		float med = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("\nDigite o %dº numero", i + 1);
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			sum += vetor[i];
			if (vetor[i] % 2 == 0) {
				elPar.add(vetor[i]);
			}

			if (i % 2 != 0) {
				elImpar.add(vetor[i]);
			}
		}

		System.out.println("Elementos nos indices imapares: " + elImpar);
		System.out.println("Elementos pares: " + elPar);
		System.out.println("Soma: " + sum);
		med = sum / vetor.length;
		System.out.println("Média: " + med);

		sc.close();

	}

}
