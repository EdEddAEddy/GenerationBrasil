package exercicios1;

import java.util.Scanner;

public class ExercicioSwitch3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float number1, number2, result = 0;
		
		System.out.println("Digite o primeiro numero: ");
		number1 = sc.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		number2 = sc.nextFloat();
		
		System.out.println("Digite o codigo da operação matematica: ");
		int opMath = sc.nextInt();
		
		switch (opMath) {
		case 1:
			result = number1 + number2;
			System.out.printf("%.1f + %.1f = %.1f", number1, number2, result);
			break;
		case 2:
			result = number1 - number2;
			System.out.printf("%.1f - %.1f = %.1f", number1, number2, result);
			break;
		case 3:
			result = number1 * number2;
			System.out.printf("%.1f * %.1f = %.1f", number1, number2, result);
			break;
		case 4: 
			result = number1 / number2;
			System.out.printf("%.1f / %.1f = %.1f", number1, number2, result);
			break;
			default:
				System.out.println("Operação invalida!");
		}
		
		
		sc.close();
		
	}

}
