package exercicios1;

import java.util.Scanner;

public class ExercicioIF2 {

	public static void main(String[] args) {
		
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		number = sc.nextInt();
		
		if (number >= 0) {
			if (number%2 == 0) {
				System.out.printf("O Número %d é par e positivo!", number);
			} else {
				System.out.printf("O Número %d é impar e positivo!", number);
			}
		}
		
		if (number < 0) {
			if (number%2 == 0) {
				System.out.printf("O Número %d é par e negativo!", number);
			} else {
				System.out.printf("O Número %d é impar e negativo!", number);
			}
		}
		
		sc.close();

	}

}
