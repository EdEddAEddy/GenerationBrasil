package exercicio2Poo;

public class ExFuncionarios {

	private String nome;
	private int idade;
	private char sexo;
	private String cpf;
	private float altura;

	public ExFuncionarios(String nome, int idade, char sexo, String cpf, float altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
