package exercicio3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2Matriz {

	public static void main(String[] args) {
		float[][] notas = new float[10][4];
		ArrayList<BigDecimal> medias = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < notas.length; i++) {
			float sum = 0;
			for (int j = 0; j < notas[0].length; j++) {
				System.out.printf("Digite uma nota do %dº aluno para o %dº bimestre: \n", i + 1, j + 1);
				notas[i][j] = sc.nextFloat();
				
				sum += notas[i][j];
				
			}
			float media = sum / notas[0].length;
			BigDecimal mediaFormatada = BigDecimal.valueOf(media);
			BigDecimal mediaArredondada = mediaFormatada.setScale(1, RoundingMode.HALF_UP);
			
			medias.add(mediaArredondada);
			
		}
		
		System.out.println(medias);
		
		sc.close();
		
	}
}
