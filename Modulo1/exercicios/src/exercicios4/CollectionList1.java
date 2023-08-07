package exercicios4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList1 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.printf("\nDigite a %dº cor", i + 1);
			colors.add(sc.nextLine());
		}
		System.out.println("\nListar cores digitadas: ");
		System.out.println(colors);
		
		for (String el : colors) {
			System.out.println(el);
		}
		

		System.out.println("-------------------------");


		Collections.sort(colors);
		System.out.println(colors);

		for (String el : colors) {
			System.out.println(el);
		}
		
		
		sc.close();
		
	}

}
