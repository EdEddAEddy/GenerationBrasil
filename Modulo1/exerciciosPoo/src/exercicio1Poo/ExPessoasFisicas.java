package exercicio1Poo;

public class ExPessoasFisicas extends ExClientes {
	
	private String cpf;

	public ExPessoasFisicas(String nome, int idade, char sexo, boolean compraFrenquente, float altura, String cpf) {
		super(nome, idade, sexo, compraFrenquente, altura);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSexo());
		System.out.println(isCompraFrenquente());
		System.out.println(getAltura());
		System.out.println(cpf);
	}
	
	

}
