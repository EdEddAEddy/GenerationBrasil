package exercicios1;

import java.util.Scanner;

public class ExercicioIF3 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		int idade = sc.nextInt();
		
		System.out.println("Primeeira doação de sangue? ");
		boolean primeiraDoacao = sc.nextBoolean();
		
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && primeiraDoacao) {
				System.out.printf("%s não está apto para doar sangue!", nome);
			} else {
				System.out.printf("%s está apto para doar sangue!", nome);
			}
		} else {
			System.out.printf("%s não está apto para doar sangue!", nome);
		}
		
		sc.close();
	}

}
