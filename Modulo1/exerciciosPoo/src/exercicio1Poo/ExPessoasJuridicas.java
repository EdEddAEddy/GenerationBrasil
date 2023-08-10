package exercicio1Poo;

public class ExPessoasJuridicas extends ExClientes {

	private String cnpj;

	public ExPessoasJuridicas(String nome, int idade, char sexo, boolean compraFrenquente, float altura, String cpf,
			String cnpj) {
		super(nome, idade, sexo, compraFrenquente, altura);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSexo());
		System.out.println(isCompraFrenquente());
		System.out.println(getAltura());
		System.out.println(this.cnpj);
	}

}