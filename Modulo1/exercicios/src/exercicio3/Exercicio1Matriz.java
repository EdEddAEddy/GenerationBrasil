package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1Matriz {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		ArrayList<Integer> digPrincipal = new ArrayList<>();
		ArrayList<Integer> digSecundaria = new ArrayList<>();
		int sumPrincipal = 0, sumSecundaria = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("Digite um número para a linha %d e coluna %d: ", i, j);
				matriz[i][j] = sc.nextInt();

				if (i == j) {
					digPrincipal.add(matriz[i][j]);
				}

				if (i + j == 2) {
					digSecundaria.add(matriz[i][j]);
				}
			}
		}
		
		for (int i = 0; i < digPrincipal.size(); i++) {
			sumPrincipal += digPrincipal.get(i);
			sumSecundaria += digSecundaria.get(i);
		}
	
		
		System.out.println("Elementos da Diagonal Principal: "+ digPrincipal);
		System.out.println ("Elementos da Diagonal Secundaria: "+ digSecundaria);
		System.out.println("Soma dos elementos da diagonal principal: "+ sumPrincipal);
		System.out.println("Soma dos elementos da diagonal secundaria: "+ sumSecundaria);
		
		sc.close();
	}
}
