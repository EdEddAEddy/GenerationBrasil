package exercicio2Poo;

public class ExGerente extends ExFuncionarios {

	private boolean eGerente;

	public ExGerente(String nome, int idade, char sexo, String cpf, float altura, boolean eGerente) {
		super(nome, idade, sexo, cpf, altura);
		this.eGerente = eGerente;
	}

	public boolean iseGerente() {
		return eGerente;
	}

	public void seteGerente(boolean eGerente) {
		this.eGerente = eGerente;
	}

	public void visualizar() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSexo());
		System.out.println(getCpf());
		System.out.println(getAltura());
		System.out.println(eGerente);
	}

}
