package exercicios1;

import java.util.Scanner;

public class ExercicioIF1 {

	public static void main(String[] args) {

		int number1, number2, number3;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		number1 = input.nextInt();
		
		System.out.println("Digite o valor de B: ");
		number2 = input.nextInt();
		
		System.out.println("Digite o valor a ser comparado: ");
		number3 = input.nextInt();
		
		
		if (number1 + number2 > number3) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (number1 + number2 < number3) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		
		input.close();
	}
}
