package aulas;

import java.util.Scanner;

public class AulaMatriz {

	public static void main(String[] args) {

		int[][] numeros = new int[3][2];
		int linha, coluna = 0, somaNumeros = 0, somaDiagonal = 0;

		Scanner sc = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				System.out.println("\nDigite um número");
				numeros[linha][coluna] = sc.nextInt();
				somaNumeros += numeros[linha][coluna];
				if (linha == coluna) {
					somaDiagonal += numeros[linha][coluna];
				}
			}
		}

		System.out.printf("\nSomatoria dos números: %d", somaNumeros);
		sc.close();
		
	}
}
