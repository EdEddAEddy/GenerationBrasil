package exercicios1;

import java.util.Scanner;

public class ExercicioSwitch2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String cargo = null;
		
		System.out.println("Nome do colaborador: ");
		String nome = sc.nextLine();
		
		System.out.println("Código do cargo: ");
		int codigoCargo = sc.nextInt();
		
		System.out.println("Salário: ");
		float salario = sc.nextFloat();
		
		
		switch (codigoCargo) {
		case 1:
			cargo = "Gerente";
			salario += salario * 0.1;
			break;
		case 2:
			cargo = "Vendedor";
			salario += salario * 0.07;
			break;
		case 3:
			cargo = "Supervisor";
			salario += salario * 0.09;
			break;
		case 4: 
			cargo = "Motorista";
			salario += salario * 0.06;
			break;
		case 5:
			cargo = "Estoquista";
			salario += salario * 0.05;
			break;
		case 6:
			cargo = "Técnico de TI";
			salario += salario * 0.08;
			break;
		}
		
		System.out.printf("Nome do colaborador: %s \nCargo: %s \nSalário: R$%.2f", nome, cargo, salario);
		
		sc.close();
		
	}

}
