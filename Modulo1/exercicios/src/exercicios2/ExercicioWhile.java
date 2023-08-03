package exercicios2;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int countSmaller = 0, countBigger = 0, idade = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
			if (idade < 21 && idade >= 0) {
				countSmaller++;
			} else if (idade > 50) {
				countBigger++;
			}
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d \n", countSmaller);
		System.out.printf("Total de pessoas maiores de 50 anos: %d", countBigger);
		
		sc.close();
	}
	
}
