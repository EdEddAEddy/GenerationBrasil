package exercicios4;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList2 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		numbers.add(6);

		System.out.println("\nDigite um número para procurar na lista: ");
		Integer number = sc.nextInt();
		
		
		Integer numberIndex = numbers.indexOf(number);
		if (numberIndex != -1) {
			System.out.printf("\nO número %d está localizado na posição: %d", number, numberIndex);
		} else {
			System.out.printf("\nO número %d não foi localizado", number);
		}
		
		sc.close();
		
	}

}
