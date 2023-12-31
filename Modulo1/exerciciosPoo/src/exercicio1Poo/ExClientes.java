package exercicio1Poo;

public class ExClientes {

	private String nome;
	private int idade;
	private char sexo;
	private boolean compraFrenquente;
	private float altura;

	public ExClientes(String nome, int idade, char sexo, boolean compraFrenquente, float altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.compraFrenquente = compraFrenquente;
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

	public boolean isCompraFrenquente() {
		return compraFrenquente;
	}

	public void setCompraFrenquente(boolean compraFrenquente) {
		this.compraFrenquente = compraFrenquente;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
