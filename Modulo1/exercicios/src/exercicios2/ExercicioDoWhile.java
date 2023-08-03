package exercicios2;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = 0, sum = 0;

		do {
			System.out.println("Digite um número: ");
			number = sc.nextInt();
			if (number >= 0) {
				sum += number;
			}
		} while (number != 0);
		
		System.out.printf("A soma dos números positivos é: %d", sum);
		
		sc.close();
	}

}
