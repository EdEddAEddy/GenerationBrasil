package aulas;

import java.util.Scanner;

public class AulaArray {

	public static void main(String[] args) {

		float nota1, nota2, nota3, somaMedia = 0;
		int x;
		float[] media = new float[4];

		Scanner sc = new Scanner(System.in);

		for (x = 0; x < media.length; x++) {
			System.out.println("\nInsira a nota do primeiro bimestre: ");
			nota1 = sc.nextFloat();
			System.out.println("\nInsira a nota do segundo bimestre: ");
			nota2 = sc.nextFloat();
			System.out.println("\nInsira a nota do terceiro bimestre: ");
			nota3 = sc.nextFloat();

			media[x] = (nota1 + nota2 + nota3) / 3;

			somaMedia += media[x];
		}
		
		float mg = somaMedia / media.length;
		System.out.println("\nMedia Geral: "+mg);
		
		for (x = 0; x < media.length; x++) {
			System.out.println("\nMédia aluno: "+(x+1)+" foi de: "+media[x]);
		}
		
		sc.close();

	}

}
