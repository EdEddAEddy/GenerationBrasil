package exercicio2Poo;

public class ExVendedor extends ExFuncionarios{

	private int id;

	public ExVendedor(String nome, int idade, char sexo, String cpf, float altura, int id) {
		super(nome, idade, sexo, cpf, altura);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void visualizar() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSexo());
		System.out.println(getCpf());
		System.out.println(getAltura());
		System.out.println(id);
	}
}
