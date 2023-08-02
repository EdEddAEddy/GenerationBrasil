package exercicios1;

import java.util.Scanner;

public class ExercicioIF4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a primeira caracteristica: ");
	String firstCharac = sc.nextLine();
	
	System.out.println("Digite a segunda caracteristica: ");
	String secondCharac = sc.nextLine();
	
	System.out.println("Digite a terceira caracteristica: ");
	String thirdCharac = sc.nextLine();
	
	
	if (firstCharac.equalsIgnoreCase("vertebrado")){
		if (secondCharac.equalsIgnoreCase("ave")) {
			if (thirdCharac.equalsIgnoreCase("carnivoro")) {
				System.out.println("Águia");
			}
			
			if (thirdCharac.equalsIgnoreCase("onivoro")) {
				System.out.println("Pomba");
			}
		}
		if (secondCharac.equalsIgnoreCase("mamifero")) {
			if (thirdCharac.equalsIgnoreCase("onivoro")) {
				System.out.println("Homem");
			} 
			
			if (thirdCharac.equalsIgnoreCase("herbivoro")) {
				System.out.println("Vaca");
			}
		}
	}
	
	if (firstCharac.equalsIgnoreCase("invertebrado")){
		if (secondCharac.equalsIgnoreCase("inseto")) {
			if (thirdCharac.equalsIgnoreCase("hematofago")) {
				System.out.println("pulga");
			}
			
			if (thirdCharac.equalsIgnoreCase("herbivoro")) {
				System.out.println("lagarta");
			}
		}
		if (secondCharac.equalsIgnoreCase("anelideo")) {
			if (thirdCharac.equalsIgnoreCase("hematofago")) {
				System.out.println("Sanguessuga");
			} 
			
			if (thirdCharac.equalsIgnoreCase("onivoro")) {
				System.out.println("Minhoca");
			}
		}
	}
	
	sc.close();
	
	}

}
