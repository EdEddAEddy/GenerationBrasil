package exercicios2;

import java.util.Scanner;

public class ExercicioFor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number1, number2;

		System.out.println("Digite o primeiro número do intervalo: ");
		number1 = sc.nextInt();

		System.out.println("Digite o ultimo número do intervalo, sendo menor que o primeiro: ");
		number2 = sc.nextInt();

		if (number1 > number2) {
			System.out.println("Intervalo inválido!");
			return;
		}

		System.out.printf("No intervalo entre %d e %d \n", number1, number2);
		
		for (int i = number1; i <= number2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf("%d é multiplo de 3 e 5 \n", i);
			}
		}
		
		sc.close();
		
	}
}
