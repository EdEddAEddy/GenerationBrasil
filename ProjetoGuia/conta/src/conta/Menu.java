package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.util.Cores;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		Scanner sc = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "**************************************************");
			System.out.println("                                                  ");
			System.out.println("          BANCO DO BRAZIL COM Z                   ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("          1 - Criar Conta                         ");
			System.out.println("          2 - Listar todas as Contas              ");
			System.out.println("          3 - Buscar Conta por numero             ");
			System.out.println("          4 - Atualizar dados da Conta            ");
			System.out.println("          5 - Apagar Conta                        ");
			System.out.println("          6 - Sacar                               ");
			System.out.println("          7 - Depositar                           ");
			System.out.println("          8 - Transferir valores entre contas     ");
			System.out.println("          9 - Sair                                ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("          Entre com a opção desejada:             ");
			System.out.println("                                                  " + Cores.TEXT_RESET);

			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.err.println(Cores.TEXT_YELLOW_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");

				System.out.println("Digite o Numero da Agência: ");
				agencia = sc.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				sc.skip("\\R?");
				titular = sc.nextLine();

				do {
					System.out.println("Digite o Tipo da conta (1-CC ou 2-CP): ");
					tipo = sc.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = sc.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = sc.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = sc.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
				contas.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");

				System.out.println("Digite o numero da conta: ");
				numero = sc.nextInt();

				contas.procurarPorNumero(numero);

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");

				System.out.println("Digite o numero da conta: ");
				numero = sc.nextInt();

				if (contas.buscarNaColletion(numero) != null) {
					System.out.println("Digite o Numero da Agência: ");
					agencia = sc.nextInt();
					System.out.println("Digite o Nome do Titular: ");
					sc.skip("\\R?");
					titular = sc.nextLine();

					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = sc.nextFloat();

					tipo = contas.retornaTipo(numero);

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o Limite de Crédito (R$): ");
						limite = sc.nextFloat();
						contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						aniversario = sc.nextInt();
						contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
					}
					default -> {
						System.out.println("Tipo de conta inválido!");
					}
					}
				} else
					System.out.println("\nConta não encontrada!");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");

				System.out.println("Digite o número da conta: ");
				numero = sc.nextInt();

				contas.deletar(numero);

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

				System.out.println("Digite o Numero da conta: ");
				numero = sc.nextInt();

				do {
					System.out.println("Digite o Valor do Saque (R$): ");
					valor = sc.nextFloat();
				} while (valor <= 0);

				contas.sacar(numero, valor);

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				System.out.println("Digite o numero da conta: ");
				numero = sc.nextInt();

				do {
					System.out.println("Digite o valor do deposito (R$): ");
					valor = sc.nextFloat();
				} while (valor <= 0);

				contas.depositar(numero, valor);

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");

				System.out.println("Digite o Numero da conta de origem: ");
				numero = sc.nextInt();
				System.out.println("Digite o Numero da conta de destino: ");
				numeroDestino = sc.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = sc.nextFloat();
				} while (valor <= 0);
				
				contas.transferir(numero, numeroDestino, valor);
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break;

			}

		}

	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
