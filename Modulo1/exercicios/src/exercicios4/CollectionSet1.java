package exercicios4;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet1 {

	public static void main(String[] args) {

		Set<Integer> numbers = new TreeSet<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite um numero: ");
			numbers.add(sc.nextInt());
		}
		
		Iterator<Integer> iNumbers = numbers.iterator();
		while(iNumbers.hasNext()) {
			System.out.println(iNumbers.next());
		}
		
		sc.close();
		
	}
}
